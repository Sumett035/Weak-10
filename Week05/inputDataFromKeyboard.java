package Week05;
import java.util.Scanner;
public class inputDataFromKeyboard {
    public static void main(String[] args) {
//nextByte nextShort nextInt nextLong nextFloat nextDouble
        Scanner kb = new Scanner(System.in);
        //=============================================
        System.out.print("กรุณาป้อนรหัสนักศึกษา : ");//USER ID
        String id = kb.nextLine();
        //=============================================
        System.out.println("กรุณาป้อนชื่อ-นามสกุล : ");//USER NAME
        String name = kb.nextLine();
        //=============================================
        System.out.println("กรุณาป้อนปีเกิด : ");//Age
        int year = kb.nextInt();
        //=============================================
        System.out.println("กรุณาป้อนเกรด : ");//GPA
        float gpa = kb.nextFloat();
        //=============================================

        int age = 2564-year;//คำนวนอายุ

        //=============================================
        System.out.println("===================");
        System.out.println("รหัสที่ป้อน คือ " +id);//ENTER USER ID
        System.out.println("ชื่อ-นามสกุล คือ " +name);//ENTER USER NAME
        System.out.println("อายุที่ป้อน คือ " +age);//ENTER Age
        System.out.println("เกรดที่ป้อน คือ " +gpa);//ENTER GPA
        kb.close();//ปิดการทำงาน
    }
}