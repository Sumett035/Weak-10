package Week15;

public class Array_Insert_1to1000 {
    public static void main(String[] args) {
        //เพิ่มข้อมูล
        int [] m = new int[1000];
        //System.out.println(m.length);
        //1-1000
        for (int i = 0; i < m.length; i++) {
            m[i] = i+1;
        }
        //แสดงผล
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }
}