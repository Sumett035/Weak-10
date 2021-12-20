package Week06;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("โปรดระบุน้ำหนัก(Kg) = "); //ระบุน้ำหนัก
        double weight = kb.nextDouble();
        System.out.print("โปรดระบุส่วนสูง(M) = "); //ระบุส่วนสูง
        double height = kb.nextDouble();
        
                        //จบการกรอกข้อมูล//
        
        System.out.println("weight = " + weight); //แสดงผลน้ำหนัก
        System.out.println("height = " + height); //แสดงผลส่วนสูง
                        //จบการสแดงผลข้อมูล//

        System.out.println("ค่าดัชนีมวลกาย(BMI) คือ = " + weight/(height*height));
        kb.close();//จบการรับค่าจากคีย์บอร์ด

    }
}