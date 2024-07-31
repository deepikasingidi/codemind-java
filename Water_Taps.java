import java.util.Scanner;
public class rate{
    public static void main(String[] args){
        int a,b,c;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        c = a*b/(a+b);
        System.out.print(c);
    }
}