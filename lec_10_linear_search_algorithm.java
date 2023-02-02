import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class lec_10_linear_search_algorithm {
    static ArrayList<int[]> search(int[][] array, int value){
        ArrayList<int[]> ans=new ArrayList<>();
        int pointer =0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]==value){
                    ans.add(new int[] {i,j});// this is initialisation of the return array

                }
            }
        }
        if(ans.size()==0){
            ans.add(new int[] {-1,-1});// this is initialisation of the return array

        }
        return ans;
    }
    public static void main(String[] args) {
        String y="123445";
        char[] x=y.toCharArray();              // converting a string to a array
        System.out.println(Arrays.toString(x));
        // ques - find a value in a 2d array
        int[][] array={
                {1,2,3,4},
                {3,4,5,6,7},
                {5,6,7,8,4,3,}
        };
//        ArrayList<int[]> u=search(array,4);
//        for (int i = 0; i < u.size(); i++) {
//            System.out.println(Arrays.toString(u.get(i))); // this is printing the arrays in the arraylist
//        }
        int ss=12334;
        String sss=Integer.toString(ss);
        System.out.println(sss.length());
    }

}
