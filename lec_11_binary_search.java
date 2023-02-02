import java.util.Scanner;

public class lec_11_binary_search {
    public static int binarySearch(int find,int[] array) {
        int start=0;
        int end=array.length-1;
        while (start <= end) {
            if(array[start+(end-start)/2]==find){
                return start+(end-start)/2;
            }else if(array[start+(end-start)/2]>find) {
                end=(start+(end-start)/2)-1;
            }else{
                start=(start+(end-start)/2)+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // binary search algorithm
        /*
        suppose a SORTED array - >  { 1 , 2 , 3 , 4 , 5 }
         here we need to find the element 2
         so,
         we will look the element at the middle of that array , i.e. that is length/2 th element
         now the n/2 th element is 3 that is bigger then the element we are searching for
         now we will apply the above steps at the array that is in the right of the n/2 th element

         we will find in the array - > { 1 , 2 , 3 }
         here the n/2 the element is 2 itself , hence we find the element in just two steps ,
         this is very EFFICIENT
         O(log n)

         */
        int [] array = { 23,3445,6,567,8,0,1,2,3,4,5,6,7,8,9,23,345,56,7,789,8,943,5645,456,457567};
        System.out.println(binarySearch(3,array));
        // ORDER AGNOSTIC BINARY SEARCH
        /*
        this is the case where you don't know if the array is arranged in ascending or descending order


        here just check the first and the last element of the array and then find out whether it is an ascending order or descending order
         */

    }
}
