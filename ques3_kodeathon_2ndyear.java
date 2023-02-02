import java.util.Scanner;

public class ques3_kodeathon_2ndyear {
    static int[] help(int [] aa){
        // writing the code for printing the max subarray
        int leftsum=0,leftmax=0,start=0,end=0;
        int a = aa.length;
        for(int i=0;i<a;i++){

            leftsum=leftsum+aa[i];
            if(leftsum<0){
                start=i+1;
                leftsum=0;
            }
            if(leftsum>leftmax){
                leftmax=leftsum;
                end=i;
            }
        }

        int[] ans = {leftmax,start,end};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] aa=new int[a];
        for(int i =0;i<a;i++){
            aa[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int[] bb=new int[b];
        for(int i =0;i<b;i++){
            bb[i]=sc.nextInt();
        }
        int[] cc = new int[a+b];
        // adding all the positive no. from array bb to left and negative to right
        int counter =0;
        for (int i = 0; i < b; i++) {
            if(bb[i]>0){
                cc[counter++]=bb[i];
            }
        }
        for(int i = 0;i<a;i++){
            cc[counter++]=aa[i];
        }
        for (int i = 0; i < b; i++) {
            if(bb[i]<=0){
                cc[counter++]=bb[i];
            }
        }
        // adding all the pos no. in the right and the negative no. in the left
        int[] ccc = new int[a+b];

        int counter1 =0;
        for (int i = 0; i < b; i++) {
            if(bb[i]<=0){
                ccc[counter1++]=bb[i];
            }
        }
        for(int i = 0;i<a;i++){
            ccc[counter1++]=aa[i];
        }
        for (int i = 0; i < b; i++) {
            if(bb[i]>0){
                ccc[counter1++]=bb[i];
            }
        }
        int[] ccans=help(cc);
        int[] cccans=help(ccc);
        if(ccans[0]>cccans[0]){
            for (int i = ccans[1]; i <=ccans[2] ; i++) {
                System.out.print(cc[i]+" ");
            }

        }else{
            for (int i = cccans[1]; i <=cccans[2] ; i++) {
                System.out.print(ccc[i]+" ");
            }

        }


    }
}
