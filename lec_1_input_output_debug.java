/*
collection of different types of data is class and its instance is object
 java is a procedural and object oriented language .
 python is a procedural,functional and object oriented language.



static language                                    dynamic language

> this type of language needs variable             > this type of language decides itself the value of the variable
  type to be defined
> here the user has more control                   > there is no need to define the datatypes
> perform type checking at the time                > perform type checking at the time of runtime
  of compilation


  variables are store in stack and Object (the values assigned to variables)  are stored in heap.

              if the object is changed by a reference variables then the change will be for all the other reference
              variable

              garbage collection destroy the object that has no reference variable

     JAVA compiler
        it compiles the code into byte code first (extension is .class)  (whole file at 1 go)
                                    byte code needs java virtual machine JVM to run this
        JVM then interprets this byte code into machine code (line by line)

           THIS IS THE REASON JAVA IS PLATFORM INDEPENDENT
   > this byte code file can run on any platform

   JVM is platform dependent





 */

import java.util.Scanner;

public class lec_1_input_output_debug {
    public static void main(String[] args) {
        // TYPE CONVERSION AND CASTING :-

        // type conversion
        // when one type of data is converted into other type of data after meeting some type of condition is type casting
        // for eg
//        Scanner sc = new Scanner(System.in);
//        Float a=sc.nextFloat();
//        System.out.println(a);
        // this takes int as input and print it as float
        // condition for type conversion are
        //  1. the two data type should be comparable
        //  2. the destination type should be greater then the source type  for eg. the int data is converted into the float but vice versa is not possible by
        //                                                                                                                                       default

        // type casting
        // converting the bigger data type into a smaller data type (not by default)
        //for eg
//        int n= (int)(345.54f);  // this will take the int value of the float no.
//        int b = 257;
//        byte c=(byte)(b);
//        // now byte can only store the data upto 256 so c will be now the 257 % 256 that is 1
//        // AUTOMATIC TYPE PROMOTION
//        byte d=20,e=30,f=40;
//        int g=d*e/f;  // here the type of data of d e and f gets automatically converted into int or larger then byte , this is promotion
        // java works on unicode values
        Scanner sc=new Scanner(System.in);
        int aa=sc.nextInt() ;
        while(aa>=0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c = Math.min(a,b);
            if(a<b){
                System.out.println(b-a);
            }else{
                System.out.println(b);
            }
            aa--;
        }

    }
}
