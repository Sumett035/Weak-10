package Week15;

public class Array_ShowGender {
    public static void main(String[] args) {
        String[] name = { "นางประหยัด", "นายประยุท", "นางสมมุติ", "นายสมมัติ", "นายสมบัตร" };
        System.out.println("มีรายชื่อทั้งหมด" + name.length + "คน ประกอบด้วย");
        for (int i = 0; i < name.length; i++) {
            boolean check = name[i].startsWith("นาย");
            if (check) {
                System.out.println(name[i]);
                System.out.println("เพศชาย");
            } else {
                System.out.println(name[i]);
                System.out.println("เพศหญิง");
            }
        }
    }
}