package Week11;

public class WhileTrue_01 {
    public static void main(String[] args) {
        
        int count = 1; //ค่าเริ่มต้น
        while (true) { //เงื่อนไข
            System.out.println("รอบที่ " +count+"Java");//ค่าที่ต้องการแสดงผล
            count++;   //Update รอบ
            if (count == 1000) {
                break;
                
            }
        }
    }    
}