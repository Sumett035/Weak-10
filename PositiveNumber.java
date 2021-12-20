package Week10;

public class PositiveNumber {
    public static void main(String[] args) {
        // ให้รับค่าตัวเลข แล้วบอกให้ได้ว่าตัวเลขนั้นเป็นจำนวนเต็มบวกหรือไม่
        int number = -5;
        String result = "";
        // การเขียนแบบ IF-Else
        if (number > 0) { // กรณีของตรวจสอบจำนวนเต็มบวก
            result = number + " เป็นจำนวนเต็มบวก";
        } else if (number < 0) { // กรณีของตรวจสอบจำนวนเต็มลบ
            result = number + " เป็นจำนวนเต็มลบ";
        } else { // กรณีของตรวจสอบจำนวนเต็มศูนย์
            result = number + " เป็นจำนวนเต็มศูนย์";
        }
        System.out.println(result);
        // ============================================//
        // ======การเขียนแบบ IF อย่างเดียว======
        // if (number>0) {
        // System.out.println("เป็นจำนวนเต็มบวก");
        // }
        // //กรณีของตรวจสอบจำนวนเต็มลบ
        // if (number<0) {
        // System.out.println("เป็นจำนวนเต็มบวก");
        // }
        // //กรณีของตรวจสอบจำนวนเต็มศูนย์
        // if (number==0) {
        // System.out.println("เป็นจำนวนเต็มศูนย์");
        // }
    }
}