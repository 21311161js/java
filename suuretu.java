class suuretu{
public static void main(String args[])
{
int [] f = new int[101];
f[0] = 0;
System.out.println("�t�B�{�i�b�`����");
for (int i=0 ; i<=100 ; i++){
if (i == 0){
f[0] = 0;
System.out.println(f[0]);
}
if (i == 1){
f[1] = 1;
System.out.println(f[1]);
}
if (i >= 2){
f[i] = f[i-1] + f[i-2];
System.out.println(f[i]);
}
}
f[0] = 0;
System.out.println("�����J����");
for (int i=0 ; i<=100 ; i++){
if (i == 0){
f[0] = 2;
System.out.println(f[0]);
}
if (i == 1){
f[1] = 1;
System.out.println(f[1]);
}
if (i >= 2){
f[i] = f[i-1] + f[i-2];
System.out.println(f[i]);
}
}
}
}