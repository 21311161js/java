//java double 桁落ち
import java.math.*;
class suuretu{
public static void main(String args[])
{
BigInteger ryuka = new BigInteger("0");
BigInteger fibo = new BigInteger("0");
BigInteger [] f = new BigInteger[1System.out.println(fibo);
01];
hai[0] = new BigInteger("0");
fibo[0] = new BigInteger("0");
ryuka[0] = new BigIntger("0")
System.out.println("フィボナッチ数列");
for (int i=0 ; i<=100 ; i++){
if (i == 0){
hai[0] = new BigInteger("0");
hai[0]= hai.add(0)
fibo = fibo.add(hai[0])
}
if (i == 1){
hai[1] = new BigInteger("1");
hai[1]= hai.add(1)
fibo = fibo.add(hai[1])
}
if (i >= 2){
hai[i] = hai[i-1] + hai[i-2];
hai[i] = hai[i-i].add([i-2]);
fibo = fibo.add(hai[i]);
}
System.out.println(fibo);
}
hai[0] = new BigInteger("0");
System.out.println("リュカ数列");
for (int i=0 ; i<=100 ; i++){
if (i == 0){
hai[0] = new BigInteger("2");
hai[0]= hai.add(2)
System.out.println(f[0]);
}
if (i == 1){
hai[1] = new BigInteger("1");
hai[1]= hai.add(1)
System.out.println(f[1]);
}
if (i >= 2){
hai[i] = hai[i-1] + hai[i-2];
hai[i] = hai[i-i].add([i-2]);
ryuka = ryuka.add(hai[i]);
}
System.out.println(ryuka);
}
}
}