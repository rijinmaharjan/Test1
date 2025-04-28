import java.util.Scanner;
public class Ques1{
    public static void main(String[] args) {
        Scanner op= new Scanner(System.in);
        System.out.print("Enter a number");
        int num= op.nextInt();
        if (num==1 || num==0){
            System.out.print("THe number is a perfect square.");
            return;
        }
        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num) {
                 System.out.print("THe number is a perfect square.");
                return;
            }
    }
    System.out.print("THe number is not a perfect square.");

    }
}