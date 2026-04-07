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
