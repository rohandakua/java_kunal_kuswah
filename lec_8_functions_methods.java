public class lec_8_functions_methods {
    static int x=100;  // explaining shadowing , this value of x will be shadowed if again it is initialised
    public static void main(String[] args) {
        // function and methods in java are same things
        // coding main principle is DRY (don't repeat your self)
    // syntax
        /*access_modifier static return_type name(arguments){
            functions
            return statement
        }

         */
        System.out.println(x);
        int x = 34;          // the value of x is shadowed here, 100 is now hidden
        System.out.println(x);
        varArgs(5,6,7,34,3,45,5,6,7);              // this will be stored in a array
        varArgs(5,6,7,34,3,45,5,6,7,4,65,7676,66);
        varArgs(43,43,23,4,45,5,34);
        // there can be two function with same name , but there parameters must be different - FUNCTION OVERLOADING
    }
    static void varArgs(int ...v){
        // this will take as many no. of int as you want;
    }
}
