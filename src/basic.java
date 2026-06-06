//import java .util.Scanner;

//1.printNumber which takes an integer input from the user and prints it on the screen
//public class basic{
//   public static void main(String[] args){
//       Scanner input = new Scanner(System.in);;
//       int num = input.nextInt();
//        System.out.println(num);
//    }
//}
//--------------------------------------------------------------------
//2. Given marks of a student
//public class basic{
//   public static void main() {
//      Scanner input = new Scanner(System.in);
//      int marks = input.nextInt();
//       if(marks >= 90){
//           System.out.println("A grade");
//       }
//       else if( marks< 90 && marks >= 70){
//            System.out.println("B grade");
//        }
//        else if( marks< 70 && marks >= 50){
//            System.out.println("C grade");
//        }
//        else if (marks< 50 && marks >= 30){
//            System.out.println("D grade");
//        }
//        else{
//            System.out.println("fail");
//       }
//   }
//}
//--------------------------------------------------------------------------------
//3. day denoting the day number, print on the screen which day of the week
//public class basic{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//    }
//       int marks = input.nextInt();
//       switch (marks){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//               break;
//                case 3:
//                    break;
//                    case 4:
//                        System.out.println("Thursday");
//                       break;
//                       case 5:
//                            System.out.println("Friday");
//                            break;
//                            case 6:
//                           System.out.println("Saturday");
//                           break;
//                           case 7:
//                                System.out.println("Sunday");
//            default:
//                                   System.out.println("invalid number");
//        }
//    }
//}
//--------------------------------------------------------------------------------------------------
//
////4. two integers low and high, return the sum of all integers from low to high inclusive.
//public class basic{
//   public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       int low = input.nextInt();
//        int high = input.nextInt();
//       int sum = 0;
//       for (int i = low; i <= high; i++) {
//           sum += i;
//       }
//        System.out.println(sum);
//    }
//}
//----------------------------------------------------------------------------------------------------
//
// 5.Given a digit d (0 to 9), find the sum of the first 50 positive integers  that end with digit d.
//public class basic{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int d = input.nextInt();
//       int first;
//        if(d==0){
//            first = 10;
//        }
//        else{
//            first = d;
//        }
//        int last = d +(50-1)*10;
//        int sum = 50* (first + last)/2;
//        System.out.println(sum);
//    }
//}
//--------------------------------------------------------------------------------------------------------------
//
//6.Given an array arr of n elements. The task is to reverse the given array.
//public class basic {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr= new int[n];
//         for (int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int st = 0;
//         int end = n-1;
//         // reverse the number
//        while(st<end){
//            int temp=arr[st];
//            arr[st]=arr[end];
//            arr[end]=temp;
//            st++;
//            end--;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}
//-----------------------------------------------------------------------

