class keisan{
public static void main(String args[])
{
System.out.println("hello world");
// 入力:2つの数値を入力
//String 変数 = new java.util.scanner(System.in).nextLine();
//int 変数 = new java.util.Scanner(System.in).nextInt();
int in0 = new java.util.Scanner(System.in).nextInt();
int in1 = new java.util.Scanner(System.in).nextInt();
//処理:足し算
int add = (in0+in1);
//処理:引き算
int add = (in0-in1);
//処理:掛け算
int add = (in0*in1);
//処理:割り算
int add = (in0/in1);
//処理:余り
int add = (in0%in1);

//計算結果を出力
System.out.println("足し算"+add);
}
}