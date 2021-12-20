// package Week12;
// import java.util.Scanner;
// public class ConvertYear {
//   public static void main(String[] args) {
//     Scanner kb = new Scanner(System.in);
//     while (true) {
//       System.out.println("กด 1 เลือกแปลง พ.ศ เป็น ค.ศ");
//       System.out.println("กด 0 เพื่อจบการทำงาน");
//       int number = kb.nextInt();
//       if (number == 1) {
//         while (true) {
//           System.out.println("กรุณากรอกปี พุทธศักราช");
//           int mc = kb.nextInt();
//           if (mc == 0) {
//             System.out.println("จบการทำงาน");
//             break;
//           } else {
//             System.out.println("ปีคริสต์ศักราช คือ " + (mc - 543));
//           }
//         }
//       }
//       if (number == 0) {
//         break;
//       }
//       kb.close();
//     }
//   }
// }