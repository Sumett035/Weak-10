package Week17;

public class Method_ex03 {
    // method แบบที่3 ไม่มีการรับค่าเข้ามาจาก main program แต่ลูกส่งค่าออกคืนแม่
    public static void main(String[] args) {
        int phone = getPhoneNumber();
        int lucky = 999;
        int newphone = phone+lucky;
        System.out.println(newphone);
    }
    static int getPhoneNumber(){
        return 982466872;

    }
}