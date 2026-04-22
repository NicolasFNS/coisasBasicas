SELECT 
  REPEAT(name, 3) AS name, --repete 3 vezes
  REVERSE(characteristics) AS characteristics --reverso
  LENGTH(race) --tamanho
  BIT_LENGTH(name) --tamanho em bits
FROM monsters

------------
SELECT 
  f.name,
  SUM(f.won) AS won, --cada registro de vitoria/derrota cria um registro novo SUM() soma tudo
  SUM(f.lost) AS lost --também por que GROUP BY tem uma cláusula que necessita de uma função de agregação então usar select * junto não funciona
FROM fighters as f --define fighters como f (vale na consulta toda)
JOIN winning_moves as w ON f.move_id = w.id --combina dados das tabelas fighters(f) e winning_moves(w) usando a coluna move_id como chave correspondente
WHERE w.move NOT IN ('Hadoken', 'Shouoken', 'Kikoken') --busca as que não tem um desses nomes no move equivalente
GROUP BY f.name --agrupar por nome
ORDER BY won DESC --agrupor por win de forma decrescente
LIMIT 6; --limita a consulta a 6 linhas

------------
SELECT 
    n,
    CASE --lógica condicional
        WHEN n = 0 THEN 0 --se n for 0 res vai ser 0
        ELSE CAST(CEIL((1 + SQRT(1 + 8 * n)) / 2) AS INTEGER) --se não fz o calculo: 
  --SQRT calcula raiz quadrada, 
  --CEIL arredonda para cima, 
  --CAST(... AS INTEGER) converte para inteiro
    END AS res --finaliza o CASE e nomeia a coluna como res
FROM participants;

-------------------
WITH RECURSIVE fib(n, res1, res2) AS ( --WITH cria uma tabela temporária e RECURSIVE permite que ela use a si mesma
  SELECT 1, 0::BIGINT, 1::BIGINT --n = 1, res1 = 0, res2 = 1 ::BIGINT força tipo inteiro grande (evita overflow)
  UNION ALL --junta select + resultados futuros e não remove duplicatas
  SELECT n + 1, res2, res1 + res2 --n = n+1, res1 = res2, res2 = res1+res2
  FROM fib
  WHERE n < (SELECT MAX(n) FROM fibo) --seleciona o maior n da tabela fibo (no desafio n era apenas uma sequência crescente
)
SELECT DISTINCT f.n, fib.res1 AS res --DISTINCT remove duplicatas
FROM fibo f --seleciona de fibo, como se fibo fosse = f (o mesmo que fibo AS f)
JOIN fib ON fib.n = f.n --junta tabela fibo com tabela calculada fib usando n como chave identificadora
ORDER BY f.n; --ordena pelo n da tabela original
