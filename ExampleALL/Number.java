// package ExampleALL;
// import java.util.Scanner;
// public class Number {
//     public static void main(String[] args) {
//         Scanner kb = new Scanner(System.in); // รับค่าผ่านคียบอร์ด
//         System.out.print("Enter number = "); // แสดงคำว่า “Enter number”
//         int n = kb.nextInt(); //ใส่ค่า n ให้ที่พิมคียบอร์ดเป็นตัวเลข
//         int check = n % 2; // กำหนดให้ๆ n หาร 2 เพื่อจะหาค่าคู่คี่
//         if (check == 0){ //คำสั่งเลือกทำ
//             System.out.println(n + " is even number "); //แสดงผลเลขคู่
//         }else{
//             System.out.println(n + " is odd number "); //แสดงผลเลขคี่
//         }
//         System.out.println("End Program"); //แสดงคำว่า “End Program”
//         kb.close(); // จบการรับค่าจากคียบอร์ด
//     }
// }