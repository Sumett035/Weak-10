package Week13;
public class StringMethod_StartEnd {
    public static void main(String[] args) {
        String fullname = "นาย สมชาย เข็มขัด";
        // หาตำแหน่งของค่า .startsWith()
        boolean result = fullname.startsWith("นาย");
        // System.out.println(result);

        if (result) {
            System.out.println(fullname + "เป็นเพศชาย");
        } else {
            System.out.println(fullname + "เป็นเพศหญิง");
        }
        // หาตำแหน่งของคำจากด้านหลัง .endsWitch
        String code = "356278TH";
        boolean result1 = code.endsWith("TH");
        if (result1) {
            System.out.println("สินค้า" + code + "มาจากประเทศไทย");
        } else {
            System.out.println("สินค้า" + code + "ไม่ได้มาจากประเทศไทย");
        }
    }
}