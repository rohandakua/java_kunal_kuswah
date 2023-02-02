import java.util.Scanner;

public class ques1_kodeathon_2nd_year {
    public static int hcf(int a , int b ){  // this will return the hcf of two no.
        int hcff=1;
        for(int i =2;i<=Math.min(a,b);i++){
            if(Math.max(a,b)%i==0){
                hcff=hcff*i;
            }
        }
        return hcff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int[] array1=new int[total];
        int[] array2=new int[total];
        for(int i =0;i<total;i++){
            array1[i]=sc.nextInt();
        }
        for(int i =0;i<total;i++){
            array2[i]=sc.nextInt();
        }
        // taken all the input from the user
        int minHCF=Integer.MAX_VALUE, pairno=1;
        for(int u = 0;u<total;u++){
            if(minHCF>hcf(array1[u],array2[u])){
                minHCF=hcf(array1[u],array2[u]);
                pairno=u+1;
            }
        }
        System.out.println(pairno);
    }
}
