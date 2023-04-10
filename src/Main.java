public class Main {
    public static void main(String[] args) {
        System.out.println(School(12,23));
        System.out.println(School(23,-20));
        System.out.println(School(45,-20));
        System.out.println(School(19,18));
        System.out.println(School(16,-30));
    }
    public static String School (int age, int temperature){
        if (age >= 20 && age<= 45 && temperature >= -20 && temperature <= 30){
            return "можно идти гулять";
        }else if (age < 20 && temperature >= 0 && temperature <= 28){
            return "можно идти гулять";
        }else if (age > 45 && temperature >= -10 && temperature <= 25){
            return "оставайтесь дома";
        }else {
            return "оставайтесь дома";

        }
    }
}