public class exercise3 {

    public static String exercise3A(String name) {
        String[] temp = name.split(" ");
        String result = temp[0] + " " + temp[temp.length-1];
        return result;
    }

    public static String exercise3B(String name) {
        String[] temp = name.split(" ");
        String result = "";
        for (int i = 1; i < temp.length-1; i++) {
            result += temp[i] + " ";
        }
        return result.trim();
    }

    public static String exercise3C(String name) {
        String[] temp = name.split(" ");
        String result = "";
        String tmp = "";
        for (int i = 0; i < temp.length; i++) {
            tmp = (char)(temp[i].charAt(0) - 32) + temp[i].substring(1, temp[i].length());
            result += tmp + " ";
        }
        return result.trim();
    }

    public static char upperCase(char c) {
        char result = c;
        switch(c) {
            case 'u':
                result = 'U';
                break;
            case 'o':
                result = 'O';
                break;
            case 'e':
                result = 'E';
                break;
            case 'a':
                result = 'A';
                break;
            case 'i':
                result = 'I';
                break;
        }
        return result;
    }

    public static String exercise3D(String name) {
        String[] temp = name.split(" ");
        String result = "";
        String tmp = "";
        String preTmp = "";
        for (int i = 0; i < temp.length; i++) {
            preTmp = "";
            for (int j = 0; j < temp[i].length(); j++) {
                if (preTmp.equals("")) {
                    tmp = temp[i].replace(temp[i].charAt(j), upperCase(temp[i].charAt(j)));
                } else {
                    tmp = preTmp.replace(preTmp.charAt(j), upperCase(preTmp.charAt(j)));
                }
                preTmp = tmp;
            }
            result += preTmp + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(exercise3A("Nguyen Van Chien"));
        System.out.println(exercise3B("Nguyen Thi Thu Thao"));
        System.out.println(exercise3C("nguyen van chien"));
        System.out.println(exercise3D("nguyen van chien"));
    }
} 
