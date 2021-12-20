package Week15;

public class Array_Gender_HW {
    public static void main(String[] args) {
        String [] name = {"นาย สมชาย เข็มขัด","นางสาว สมหญิง เข็มขัด","นาย สมบูรณ์ เข็มขัด","นาง สมใจ เข็มขัด","นาย สมนึก เข็มขัด"};
        System.out.println("มีรายชื่อทั้งหมด " + name.length + " คน ประกอบด้วย" );
        for (int i = 0; i < name.length; i++) {
            boolean check = name [i] .startsWith("นาย");
            if (check) {
                System.out.println((i+1)+". "+ name[i] + " ==> เพศชาย");
            } else {
                System.out.println((i+1)+". "+ name[i] + " ==> เพศหญิง");
            }            
        }
    }
}