public class lec_12_binary_search_ques_1d_array {
    // finding the peak value in a array
    public static int binarySearch(int find,int[] array,int start,int end) {
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
    public static int ceilingOfNo(int [] array,int find){
        int start = 0,m=0;
        int end=array.length-1;
        if(array[0]<array[array.length-1]) {
            while (start <= end) {
                m = start + (end - start) / 2;
                if (array[m] == find) {
                    return array[m];
                } else if (array[m] < find) {  // check in the right
                    start = m + 1;
                } else {                    // check in the left
                    end = m - 1;
                }
            }
            if(start==array.length){
                return Integer.MIN_VALUE;
            }
            return array[start];

        }else{
            while(start<=end){
                m = start+(end-start)/2;
                if(array[m]==find){
                    return array[m];
                }else if(array[m]>find){  // check in the right
                    start=m+1;
                }else{                    // check in the left
                    end=m-1;
                }
            }
            if(end<0){
                return Integer.MIN_VALUE;
            }

            return array[end];
        }

    }
    public static int floorOfNo(int [] array,int find){
        int start = 0,m=0;
        int end=array.length-1;
        if(array[0]<array[array.length-1]) {
            while (start <= end) {
                m = start + (end - start) / 2;
                if (array[m] == find) {
                    return array[m];
                } else if (array[m] < find) {  // check in the right
                    start = m + 1;
                } else {                    // check in the left
                    end = m - 1;
                }
            }
            if(end<0){
                return Integer.MAX_VALUE;
            }
            return array[end];

        }else{
            while(start<=end){
                m = start+(end-start)/2;
                if(array[m]==find){
                    return array[m];
                }else if(array[m]>find){  // check in the right
                    start=m+1;
                }else{                    // check in the left
                    end=m-1;
                }
            }
            if(start>=array.length){
                return Integer.MAX_VALUE;
            }

            return array[start];
        }

    }
    public static int peakValue(int[]array){
        // here a mountain array is given
        // applying binary search
        int start =0,end =array.length-1,largest=Integer.MIN_VALUE;
        while(start<=end){
            int m = start +(end-start)/2;
            if(array[m]>array[m+1]){        //check the left side of the array
                end =m-1;
                if(largest < array[m]){
                    largest = array[m];
                }
            }else if(array[m]<array[m+1]){
                start=m+1;
                if(largest < array[m]){
                    largest = array[m];
                }
            }
        }
        return largest;
    }
    public static int peakValueIndex(int[]array){
        // here a mountain array is given
        // applying binary search
        int start =0,end =array.length-1,largest=Integer.MIN_VALUE,index=-1;
        while(start<=end){
            int m = start +(end-start)/2;
            if(array[m]>array[m+1]){        //check the left side of the array
                end =m-1;
                if(largest < array[m]){
                    largest = array[m];
                    index=m;
                }
            }else if(array[m]<array[m+1]){
                start=m+1;
                if(largest < array[m]){
                    largest = array[m];
                    index=m;
                }
            }
        }
        return index;
    }
    // ques - find the target element index in a mountain array
    public static int findInMountain(int []array,int target ) {
        int start = 0, end , index = -1 , largest=Integer.MIN_VALUE,maxIndex=peakValueIndex(array);

        end=maxIndex;
        System.out.println(end+"\n");
        while (start <= end) {    // checking the left side of the max value   ASCENDING
            int m = start + (-start + end) / 2;
            if (array[m] > target) {
                end = m - 1;
            } else if (array[m] < target) {
                start=m+1;
            }else{
                index=m;
            }
        }// if this loop ends and the value of the index is still -1 then the value was not found in the left so checking the right
        if(index==-1){
            start=maxIndex;
            end=array.length-1;
            while (start <= end) {    // checking the right side of the max value   DESCENDING
                int m = start + (-start + end) / 2;
                if (array[m] > target) {
                    start = m + 1;
                } else if (array[m] < target) {
                    end=m-1;
                }else{
                    index=m;
                }
            }
        }
        return index;
    }
    // ques - find the target element in the rotated array
    // rotated array is like this - (12,14,3,4,6,7,8)
    public static int rotatedArray(int[]array,int found){
        int start =0,end =array.length-1,largest=Integer.MIN_VALUE,index=-1;
        while(start<=end){   // for checking the pivot
            int m = start +(end-start)/2;
            if(array[m]<array[m+1]){        //check the left side of the array
                end =m-1;
            }else{
                index=m;
            }
        }
        // got the index
        // now finding the element





        int indexOfFind=-1;
        indexOfFind=binarySearch(found,array,0,index);
        if(indexOfFind==-1){
            indexOfFind=binarySearch(found,array,index,array.length-1);
        }
        return indexOfFind;
    }

    public static void main(String[] args) {
        // ques no. 1 - ceiling of a number
        // meaning , find the no. in the array that is just greater then or equal to the target no.
        int[] array1={11,9,7,5,3,1};
        System.out.println(ceilingOfNo(array1,13));
        // ques no. 2 - floor of a number
        // meaning , find the no. in the array that is just smaller then or equal to the target no.
        int[] array2={11,9,7,5,3,1};
        System.out.println(floorOfNo(array2,-2));
        //ques no. 3 find the peak value in a mountain array
        // i.e.  mountain array is 2 3 4 5 6 7 5 3 2 1
        int[] array22={3,5,6,11,19,31,34,12,8,7,5,3,1};
        int[] array3={10,12,14,1,2,3,4,5,6,7,8};
        System.out.println(peakValue(array22)+" \n"+findInMountain(array22,5)+" \n"+rotatedArray(array3,12));



    }
}
