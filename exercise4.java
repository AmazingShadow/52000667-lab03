public class exercise4 {

    public static int exercise4A(String str) {
        return str.length();
    }

    public static int exercise4B(String str) {
        return str.split("\\s+").length;
    }

    public static String exercise4C(String strOne, String strTwo) {
        return strOne.concat(strTwo);
    }

    public static boolean exercise4D(String str) {
        StringBuilder strReverse = new StringBuilder(str);
        strReverse.reverse();
        return str.equals(strReverse.toString()) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(exercise4A("nguyen van chien"));
        System.out.println(exercise4B("i     love      you hehe    draven"));
        System.out.println(exercise4C("Hello", "World"));
        boolean check = exercise4D("aabaa");
        if (check) {
            System.out.println("Day la chuoi doi xung");
        } else {
            System.out.println("Day khong phai chuoi doi xung");
        }
    }
}
