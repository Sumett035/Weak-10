package Week15;

public class Array_Basic01 {
    public static void main(String[] args) {
        //การประกาศตัวแปรแบบ array
        //แบบที่ 1 : ประกาศแบบกำหนดสมาชิก
        int [] number = {1,2,3,44,55,66,77,88,99};
        int size = number.length;
        System.out.println(size);
        System.out.println(number.length);  //หาความยาวของอาเรย์
        System.out.println(number[3]);  //การเข้าถึงตำแหน่งของตัวแปร
        number[3] = 38; // การเปลี่ยนค่าข้อมูลในตัวแปร
        System.out.println(number[3]);
        // แบบที่ 2 : ประกาศแบบกำหนดขนาด
        //char [] alphabet;   //ประกาศอาเรย์
        //alphabet = new char[26];//สร้างอาเรย์
        char[] alphabet = new char[26];
        alphabet[0] ='a';
        alphabet[1] ='b';
        alphabet[2] ='c';
        alphabet[3] ='d';
        alphabet[4] ='e';
        alphabet[5] ='f';
        alphabet[6] ='g';
        alphabet[7] ='h';
        alphabet[8] ='i';
        alphabet[9] ='j';
        alphabet[10] ='k';
        alphabet[11] ='l';
        alphabet[12] ='m';
        alphabet[13] ='n';
        alphabet[14] ='o';
        alphabet[15] ='p';
        alphabet[16] ='q';
        alphabet[17] ='r';
        alphabet[17] ='s';
        alphabet[19] ='t';
        alphabet[20] ='u';
        alphabet[21] ='v';
        alphabet[22] ='w';
        alphabet[23] ='x';
        alphabet[24] ='y';
        alphabet[25] ='z';
        System.out.println(alphabet[10]);
        System.out.println(alphabet[25]);
        System.out.println(alphabet.length);
        int[]num = new int [10];
        System.out.println(num[9]);
    }
}