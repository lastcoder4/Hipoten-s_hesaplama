import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    int a,b;
    double c;
    Scanner kenar1 = new Scanner(System.in);
    System.out.print("Lutfen a keanrı ıcın deger gırınız: ");
    a =kenar1.nextInt();
    System.out.print("lutfen 2. kenar ıcın degr gırınız: ");
    b = kenar1.nextInt();
    c = Math.sqrt(a*a +b*b);
    System.out.print("olusturdugunuz ucge nun hıpotenus uzunlugu : "+ c);



    }
}