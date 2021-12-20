package Week11;

public class ForLoop_01 {
    public static void main(String[] args) {
        // for (int count = 1; count <= 100; count++) {
        // System.out.println("รอบที่ " +count+"Java");
        // }
        int sum = 0;
        for (int number = 1; number <= 4; number++) {
            sum = sum + number;
            System.out.println("รวมเท่ากับ! " + sum);
        }
        // int count = 1; //ค่าเริ่มต้น
        // while (count <= 100) { //เงื่อนไข
        // System.out.println("รอบที่ " +count+"Java");//ค่าที่ต้องการแสดงผล
        // count++; //Update รอบ
        // }
    }
}