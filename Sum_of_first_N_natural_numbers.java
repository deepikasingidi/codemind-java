import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        int a;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        System.out.println((a*(a+1))/2);
    }
}