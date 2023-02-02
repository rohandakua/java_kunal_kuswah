import java.util.Scanner;

public class ques2_kodeathon_2nd_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0){
            float a= sc.nextFloat();
            float b= sc.nextFloat();
            float r=sc.nextFloat();
            if(((a*100)+(b*75))<=r){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
