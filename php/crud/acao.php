<?php //ações gerais do crud

/*
juntei todas as ações por facilidade, mas se precisar separar tudo, apenas separe os arquivos 
e coloque o nome do arquivo que irá agir naquele formulário dentro do "action" da tag "<form>" 
repetindo a estrutura básica de:

require("conectar.php");
//tratamento de erro de conexão ($conn é um dos padrões da linguagem
if ($conn->connect_error) {
  die("Conexão falhou: " . $conn->connect_error);
}

**ações**

$sql->close();
$conn->close();

*/

// "conecta" ao conectar.php (como se inserisse o conteúdo de um arquivo PHP dentro de outro)
require("conectar.php");
//tratamento de erro de conexão ($conn é um dos padrões da linguagem
if ($conn->connect_error) {
  die("Conexão falhou: " . $conn->connect_error);
}

//ação de inserir dados no banco
if (isset($_POST['enviar'])) {
  //pega elementos com base no id do index
  //o "trim" é para remover espaços no início e fim da string caso tenha
  $nome = trim($_POST['nome']);
  $nascimento = trim($_POST['nascimento']);
  $renda = trim($_POST['renda']);
  
  //valida se os valores de "renda" estão dentro de um certo escopo
  //"/^" e "/$" indicam início e fim de string
  //"[0-9]" indica que são ceitos apenas "strings" que sejam números (qualquer número que contenha valor de 0 a 9)
  //esse "+"após o último gurpo mencionado quer dizer que pode ter um ou mais dígitos
  //o "[.,][0-9]+" quer dizer que dentro desse grupo em parêntesis haverá um pontou ou vírgula seguido de um ou mais números
  //o "?" ao final diz que esse grupo em parênteses é opcional, se não houvesse parênteses o "?" afetaria apenas o "+" que é o mais próximo
  if (!preg_match('/^[0-9]+([.,][0-9]+)?$/', $renda)) {
      echo "Erro: A renda deve conter apenas valores numéricos válidos.";
      exit;
  }
  
  $data_formatada = date("Y-m-d", strtotime($nascimento));
  $renda_formatada = str_replace(',', '.', $renda);
  $renda_formatada = floatval($renda_formatada);
  
  $sql = $conn->prepare("INSERT INTO usuarios (nome, renda, nascimento) VALUES (?, ?, ?)");
  $sql->bind_param("sds", $nome, $renda_formatada, $data_formatada);
  
  if ($sql->execute() === TRUE) {
      header("location: index.php");
  } else {
      echo "Erro: " . $conn->error;
  }

  $sql->close();
}

//ação de excluir dados do banco
if (isset($_POST['excluir_listado'])) {
  $excluir = $_POST['excluir_da_lista'];
  
  //prepare faz os dados serem tratados apenas como valores, não comandos assim evitando sql injection
  //""i", excluir" indica para usar a variável excluir como um inteiro
  // i é para inteiro, s = String e por aí segue
  $sql = $conn->prepare("DELETE FROM usuarios WHERE id = ?");
  $sql->bind_param("i", $excluir);
  
  if ($sql->execute() === TRUE) {
      header("location: index.php");
  } else {
      echo "Erro: " . $conn->error;
  }

  $sql->close();
}

//ação de excluir dados do banco
if (isset($_POST['enviar_excluir'])) {
  $excluir = $_POST['excluir'];
  
  $sql = $conn->prepare("DELETE FROM usuarios WHERE nome = ?");
  $sql->bind_param("s", $excluir);
  
  if ($sql->execute() === TRUE) {
      header("location: index.php");
  } else {
      echo "Erro: " . $conn->error;
  }

  $sql->close();
}

$conn->close();

?>
