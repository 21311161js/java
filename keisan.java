class keisan{
public static void main(String args[])
{
System.out.println("hello world");
// ����:2�̐��l�����
//String �ϐ� = new java.util.scanner(System.in).nextLine();
//int �ϐ� = new java.util.Scanner(System.in).nextInt();
int in0 = new java.util.Scanner(System.in).nextInt();
int in1 = new java.util.Scanner(System.in).nextInt();
//����:�����Z
int add = (in0+in1);
//����:�����Z
int add = (in0-in1);
//����:�|���Z
int add = (in0*in1);
//����:����Z
int add = (in0/in1);
//����:�]��
int add = (in0%in1);

//�v�Z���ʂ��o��
System.out.println("�����Z"+add);
}
}