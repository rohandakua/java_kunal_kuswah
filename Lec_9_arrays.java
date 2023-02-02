import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lec_9_arrays {
    public static int[] reverse(int[] array){
        for(int i = 0;i<array.length/2;i++){
            int x=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=x;
        }
        return array;
    }
    public static void main(String[] args) {
        /*
        int[] array= new int[6];-> this happens at run time
        ^ this happens at compile time
                                  Dynamic runtime - memory allocation during runtime
            1. arrays object are stored in heap memory
            2. in heap ,everything is stored in non continous form
            3. new is used to create an object
            4. primitive is stored in stack memory in java and everything else is stored in heap
            5. all reference variable are pointing to null
         */
        int [] array1 = {1,2,3,4,5};
        //now to print the array we can make use of the following
        System.out.println(Arrays.toString(array1));// this is a method to print the array in java
                                                     // it basicly converts the array into string and prints it
                                                    // it will print like [1,2,3,4,5]
        //                 ARRAYLIST
        // syntax
        // ArrayList<data type> name = new ArrayList<data type // not mandatory>(default size // not mandatory);
        //           all the data types used here cant be primitive , they must be wrapper classes of the data

        // in arraylist we can add as many values as we want without worrying about the size
        // even you specified the size still you can input as many values as you want

        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(45);
        arraylist.add(2342);
        arraylist.add(4532);
        arraylist.add(434);
        arraylist.add(445345);
        arraylist.add(334434335);
        System.out.println(arraylist);
        System.out.println(arraylist.contains(445345)); // to check if it is there or not

        // arraylist size is initially fixed but but but
         // when the arraylist is filled to a certain amount then
         // a new arraylist is created of some size bigger then the original array
         // all the items are copied in the new arraylist and the old arraylist is deleted


        // for making multi dimension arraylist
        ArrayList<ArrayList<Integer>> arraylist2 = new ArrayList<>();
        // here we have to first initialize the arraylist inside the arraylist 
        for (int i = 0; i < 3; i++) {
            arraylist2.add(new ArrayList<>());
            // this is to initialize the arraylist inside the arraylist
        }
        Scanner sc = new Scanner(System.in);
//        for (int j = 0; j < 3; j++) {
//            for (int k = 0; k <3 ; k++) {
//                arraylist2.get(j).add(sc.nextInt());  // going to the arraylist at the index j and then adding the values
//            }
//        }
//
        // ques - swap a array
        int[] array11={1,2,3,4,5,6,7,8};
        array11=reverse(array11);
        System.out.println(Arrays.toString(array11));

        }
}
