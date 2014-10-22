class keisan{
public static void main(String args[])
{
System.out.println("”š¨‹L†¨”š‚Ì‡”Ô‚É“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
// “ü—Í:2‚Â‚Ì”’l‚ğ“ü—Í
//String •Ï” = new java.util.scanner(System.in).nextLine();
//int •Ï” = new java.util.Scanner(System.in).nextInt();
int in0 = new java.util.Scanner(System.in).nextInt();
String kig = new java.util.Scanner(System.in).nextLine();
int in1 = new java.util.Scanner(System.in).nextInt();
//ˆ—:‘«‚µZ
int add = (in0 + in1);
//ˆ—:ˆø‚«Z
int sub = (in0 - in1);
//ˆ—:Š|‚¯Z
int mul = (in0 * in1);
//ˆ—:Š„‚èZ
int div = (in0 / in1);
//ˆ—:—]‚è
int mod = (in0 % in1);
//ŒvZŒ‹‰Ê‚ğo—Í
if (kig.equals("+")){
System.out.println("“š‚¦‚Í"+ add +"‚Å‚·");}
if (kig.equals("-")){
System.out.println("“š‚¦‚Í"+ sub +"‚Å‚·");}
if (kig.equals("*")){
System.out.println("“š‚¦‚Í"+ mul +"‚Å‚·");}
if (kig.equals("/")){
System.out.println("“š‚¦‚Í"+ div +"A—]‚è‚Í"+ mod +"‚Å‚·");}
else
System.out.println("“ü—Í‚ª³‚µ‚­‚È‚¢‚Å‚·");
}
}