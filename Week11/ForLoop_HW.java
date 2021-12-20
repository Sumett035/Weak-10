// package Week11;

// public class ForLoop_HW {
//     public static void main(String[] args) {
//         int i, Fact = 1, num = 4;   // ค่าเริ่มต้น

//         System.out.print(num + "!มีค่าเท่ากับ ");   //จะได้ว่า num+"!มีค่าเท่ากับ" คือ 5!มีค่าเท่ากับ
//         for (i = num; i >= 1; i--) {    // เงื่อนไข ให้ i=num คือ 5 และถ้า i มีค่ามากกว่าหรือเท่ากับ 1 ให้ลดค่า i  ลง 1 จำนวน
//             System.out.print(i + "*");  // ค่าที่ต้องการแสดงผล คือ i +"*" i ตามด้วยเครื่องหมาย * ที่เป็นข้อความ
//             Fact = Fact * i; // ให้ Fact เท่ากับ Fact คูณด้วย i
//         } 
//         System.out.println(" = " + Fact);   // ค่าที่ต้องการแสดงผล คือ ข้อความว่า = + ค่า Fact ที่คูณมาจาก i บรรทัดที่ 10
//         Fact = 1;
//     }

// }