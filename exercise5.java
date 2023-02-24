import java.util.*;

public class exercise5 {

    public static String checkStr(String str) {
        String result = str;
        for (int i = 0; i < str.length(); i++) {
            if (((char)result.charAt(i) >= 'a' && (char)result.charAt(i) <= 'z') || ((char)result.charAt(i) >= 'A' && (char)result.charAt(i) <= 'Z') || ((char)result.charAt(i) >= '0'&& (char)result.charAt(i) <= '9')) {
                continue;
            } else {
                result = result.replace(result.charAt(i), ' ');
            }
        }

        return result.trim();
    }

    public static void exercise5A(String name) {
        HashMap<String, Integer> hash = new HashMap<>();
        String[] temp = name.split("\\s+");
        Set<String> tmp = new HashSet<>();
        String check = "";
        for (int i = 0; i < temp.length; i++) {
            check = temp[i].replace(temp[i].charAt(0), (char)(temp[i].charAt(0) - 32));
            if (tmp.contains(check)) {
                continue;
            } else {
                tmp.add(checkStr(temp[i]));
            }
        }

        for (int i = 0; i < temp.length; i++) {
            temp[i] = checkStr(temp[i]);
            temp[i] = temp[i].toLowerCase();

            if (hash.get(temp[i]) == null) {
                hash.put(temp[i], 1);
            } else {
                hash.put(temp[i], hash.get(temp[i]) + 1);
            }
        }

        for (String str : tmp) {
            System.out.println(str + ": " + hash.get(str.toLowerCase()) + ",");
        }
        
    }

    public static void main(String[] args) {
        String test = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.";
        exercise5A(test);
    }
} 
