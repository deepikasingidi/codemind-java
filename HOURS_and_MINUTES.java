import java.util.Scanner;
public class Time{
    public static void main(String[] args){
        int a;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        System.out.println(a/60 + " Hour(s) " + a%60 + " Minute(s)");
    }
}