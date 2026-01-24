//double -> int
double a1 = 9.7;
int a2 = (int) a1; // double -> int (perde a parte decimal)

//string -> int
String str = "teste";
int num = Integer.parseInt(str);

int hexa = Integer.decode("0xFF");//retorna strings em formato hexadecimal, o resultado será 255

Scanner scanner = new Scanner("123");
int num = scanner.nextInt();

//varios -> String
Integer b1 = 10;
String b2 = b1.toString();

int b3 = 10;
String b4 = String.valueOf(b3);
String b5 = b3 + "";//mesmo resultado que a linha anterior mas com concatenação
String b6 = Integer.toString(b3);

double b9 = 3.14159;
String b10 = String.format("%.2f", b9); //o "%.2f" limita as casas decimais para apenas duas, retornando "3.14"

String b11 = "Java";
char[] b12 = b11.toCharArray();//string para cadeia de caracteres
String b13 = new String(b12);

boolean b14 = Boolean.parseBoolean("true");
String b15 = Boolean.toString(b14);

LocalDate b16 = LocalDate.parse("2024-01-09");
String b17 = b16.toString();

DateFormat b18 = new SimpleDateFormat("dd/MM/yyyy");
String b19 = b18.format(new Date());//resulta numa string com a data e hora atuais do sistema

//objetos para tipos
Object c1 = "texto";
String c2 = (String) c1;

//array -> list
String[] arr = {"a", "b", "c"};
List<String> list = Arrays.asList(arr);
String[] arr2 = list.toArray(new String[0]);
