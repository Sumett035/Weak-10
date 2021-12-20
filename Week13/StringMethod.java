package Week13;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Sumett";
        String city = new String("Banpong");
        System.out.println(name);
        System.out.println(city);
        // การต่อสตริง Concatenation = .concat()
        System.out.println(name + city);
        String result = name + city;
        System.out.println(result);
        String result2 = name + city + ".com";
        System.out.println(result2);
        System.out.println(result2.concat(".ac.th"));
        System.out.println(result2 + ".ac.th");
        // หาความยาวของสตริง .Length()
        System.out.println(name.length());
        int count = (name.length());
        System.out.println(count);
        // หาตำแหน่งตัวอักษรในข้อความ .charAt()
        System.out.println(name.charAt(0));
        char Character = (name.charAt(0));
        System.out.println(Character);
    }
}