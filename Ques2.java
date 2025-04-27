import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter a number");
        int num= op.nextInt();
        int prod=1;
        while(num>0){
            int digit= num%10;
            prod*=digit;
            num= num/10;

        }
        System.out.print("The product of digits is:"+prod);
    }
}
