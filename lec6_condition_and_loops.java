import java.math.*;
import java.util.Scanner;

public class lec6_condition_and_loops {
    public static void main(String[] args) {
        int m=98,n=67;
        Scanner sc =new Scanner(System.in);
        // Math.max returns the max value of the two input
        System.out.println(Math.max(m,n));
        // .trim removes all the extra space at your input
        // for ex if you entered   ____rohan
        //    then input will be   rohan
        System.out.println("enter two string");
        String o=sc.nextLine().trim();  // this will trim all the extra space at the starting and the ending
        char p=sc.next().trim().charAt(0); // this will take the char at the index 0 in the input

        // fibonacci no. series
        int a =0,b=1;
        int c=sc.nextInt();
        System.out.print(0+"  1");
        while (c>1){
            int temo=b;
            b=a+b;
            a=temo;
            System.out.print(" "+b);
            c--;
        }


    }
}
