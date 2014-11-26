//java double 桁落ち
import java.math.*;
class suuretu{
public static void main(String args[])
{
BigInteger ryuka = new BigInteger("0");
BigInteger fibo = new BigInteger("0");
BigInteger [] f = new BigInteger[101];
f[0] = new BigInteger("0");
System.out.println("フィボナッチ数列");
for (int i=0 ; i<=100 ; i++){
if (i == 0){
f[0] = new BigInteger("0");
System.out.println(f[0]);
}
if (i == 1){
f[1] = new BigInteger("1");
System.out.println(f[1]);
}
if (i >= 2){
f[i] = f[i-1] + f[i-2];
System.out.println(f[i]);
}
}
f[0] = new BigInteger("0");
System.out.println("リュカ数列");
for (int i=0 ; i<=100 ; i++){
if (i == 0){
f[0] = new BigInteger("2");
System.out.println(f[0]);
}
if (i == 1){
f[1] = new BigInteger("1");
System.out.println(f[1]);
}
if (i >= 2){
f[i] = f[i-1] + f[i-2];
System.out.println(f[i]);
}
}
}
}