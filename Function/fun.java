

// 1. modularity function
// import java.util.*;

// class function{
//     public static int add(int a, int b){
//         return a+b;
//     }
//     public static void main(String[] args){
//         int result = add(10, 20);
//         System.out.println(result);
//     }
// }

// 2. abstraction function

import java.util.*;

public class fun {

     static int square(int a){
        return a*a;
     }
     static double cube(double a){
        return a * a*a;
     }

     public static void main(String [] args){
        int result1 = square(3);
        double result2=cube(3.0);
        System.out.println(result1 +" "+result2);
     }
}