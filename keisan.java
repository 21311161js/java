class keisan{
public static void main(String args[])
{
System.out.println("�������L���������̏��Ԃɓ��͂��Ă�������");
// ����:2�̐��l�����
//String �ϐ� = new java.util.scanner(System.in).nextLine();
//int �ϐ� = new java.util.Scanner(System.in).nextInt();
int in0 = new java.util.Scanner(System.in).nextInt();
String kig = new java.util.Scanner(System.in).nextLine();
int in1 = new java.util.Scanner(System.in).nextInt();
//����:�����Z
int add = (in0 + in1);
//����:�����Z
int sub = (in0 - in1);
//����:�|���Z
int mul = (in0 * in1);
//����:����Z
int div = (in0 / in1);
//����:�]��
int mod = (in0 % in1);
//�v�Z���ʂ��o��
if (kig.equals("+")){
System.out.println("������"+ add +"�ł�");}
if (kig.equals("-")){
System.out.println("������"+ sub +"�ł�");}
if (kig.equals("*")){
System.out.println("������"+ mul +"�ł�");}
if (kig.equals("/")){
System.out.println("������"+ div +"�A�]���"+ mod +"�ł�");}
else
System.out.println("���͂��������Ȃ��ł�");
}
}