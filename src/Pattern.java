import java.util.*;

// 1.Square fill pattern
//public class Pattern {
//    public static void main() {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//------------------------------------------------------------------
// 2. right Half pyramid
//public class Pattern {
//    public static void main() {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//               System.out.print("*");
//           }
//            System.out.println();
//        }
//    }
//}
//-------------------------------------------------------------------------
// 3.Number increasing pattern
//public class Pattern {
//    public static void main() {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}
//------------------------------------------------------------------
//4. reverse right Half pyramid
//public class Pattern{
//    public static void main(){
//        for ( int i= 5; i >= 1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");  ///if you use println here you will not get the correct output///
//            }
//            System.out.println();
//        }
//
//    }
//}
//------------------------------------------------------------------------
//5. Number increasing reverse pattern
//public class Pattern{
//    public static void main(){
//        for ( int i= 5; i >= 1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print(j);  ///if you use println here you will not get the correct output///
//            }
//            System.out.println();
//        }
//
//    }
//}
//--------------------------------------------------------------------------
//6.Triangle star pyramid
//public class Pattern {
//    public static void main(){
//        int n=5;
//        for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= 2*i-1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//----------------------------------------------------------------------
//7. reverse triangle star pyramid
//public class Pattern {
//    public static void main() {
//        int n = 5;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 0; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for  (int k = 1; k <= (2*i -1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//----------------------------------------------------------------------
//8.diamond pattern
//public class Pattern {
//    public static void main(){
//        int n=5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print(" ");
//            }
//            for(int k = 1; k <=(2*i -1); k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n; i >= 1; i--) {
//            for (int j = 0; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for  (int k = 1; k <= (2*i -1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//------------------------------------------------------------------
//9.half diamond
/// public class Pattern {
//    public static void main(){
//        int n=5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("");
//            }
//            for(int k = 1; k <=(2*i -1); k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n; i >= 1; i--) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("");
//            }
//            for  (int k = 1; k <= (2*i -1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//---------------------------------------------------------------------------------
// 10.one -zero triangle
//public class Pattern {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= 5; i++) {
//            int num = i% i; // 1 for odd place and 0 for even place
//            for (int j = 1; j <=i; j++) {
//                num = 1-num;
//                System.out.print(num+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//-------------------------------------------------------------------------------------
//11.zero-one triangle
//public class Pattern {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= 5; i++) {
//            int num = i% 2; // o for odd place and 1 for even place
//            for (int j = 1; j <=i; j++) {
//                num = 1-num;
//                System.out.print(num+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//-----------------------------------------------------------------------------------------
// 12.increasing decrease number pattern simulatenously

    //*****good question & trick question ***********

//public class Pattern {
//    public static void main(String[] args) {
//        int n = 5; // Total number of rows
//
//        for (int i = 1; i <= n; i++) {
//            // 1. Print increasing numbers
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//
//            // 2. Print spaces
//            // The gap width is 2 * (n - i)
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//
//            // 3. Print decreasing numbers
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//
//            // Move to the next line
//            System.out.println();
//        }
//    }
//}
//---------------------------------------------------------------------------------------------
//13. number changing pyramid
public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}