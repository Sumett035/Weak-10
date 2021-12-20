package Week10;
public class ifElse_Compare2Number {
    public static void main(String[] args) {
        // Number 1 มากกว่า Number 2
        // Number 1 น้อยกว่า Number 2
        // Number 1 เท่ากับ Number 2

        //  รับตัวเลขเข้ามา 2ตัว
        int number1 = 90, number2 = 33;
        
        // เปรีบเทียบตัวเลขทั้งสอง
        if (number1>number2) {
            System.err.println(number1 + "มากกว่า" + number2);
        } else if (number1<number2) {
            System.err.println(number1 + "น้อยกว่า" + number2);
        } else {
            System.err.println(number1 + "เท่ากับ" + number2);
        }
    
    }

}

