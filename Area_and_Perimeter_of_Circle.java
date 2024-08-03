import java.util.Scanner;
public class Areperi{
    public static void main(String[] args){
        int a;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        double b = 3.14*a*a, c = 2*3.14*a;
        System.out.println(String.format("%.2f",b));
        System.out.print(String.format("%.2f",c));
    }
}