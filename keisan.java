class keisan{
public static void main(String args[])
{
System.out.println("数字→記号→数字の順番に入力してください");
// 入力:2つの数値を入力
//String 変数 = new java.util.scanner(System.in).nextLine();
//int 変数 = new java.util.Scanner(System.in).nextInt();
int in0 = new java.util.Scanner(System.in).nextInt();
String kig = new java.util.Scanner(System.in).nextLine();
int in1 = new java.util.Scanner(System.in).nextInt();
//処理:足し算
int add = (in0 + in1);
//処理:引き算
int sub = (in0 - in1);
//処理:掛け算
int mul = (in0 * in1);
//処理:割り算
int div = (in0 / in1);
//処理:余り
int mod = (in0 % in1);
//計算結果を出力
if (kig.equals("+")){
System.out.println("答えは"+ add +"です");}
if (kig.equals("-")){
System.out.println("答えは"+ sub +"です");}
if (kig.equals("*")){
System.out.println("答えは"+ mul +"です");}
if (kig.equals("/")){
System.out.println("答えは"+ div +"、余りは"+ mod +"です");}
else
System.out.println("入力が正しくないです");
}
}