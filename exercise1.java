import java.util.*;

public class exercise1 {

    public static boolean exercise1A(int[] arr) {
        if (arr.length == 0) return false;
        else {
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = 0;
        }
        return true;
    }

    public static boolean exercise1B(int[] arr, int position, int key) {
        if (position > arr.length) return false;
        for (int i = arr.length-1; i >= position; i--) {
            arr[i] = arr[i-1];
        }
        arr[position] = key;
        return true;
    }

    public static int[] exercise1C(int[] arr) {
        int count = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        Set<Integer> mySet = new HashSet<>();
        for (Integer i : arr) {
            mySet.add(i);
            if (hash.containsKey(i)) {
                // neu da ton tai key
                hash.put(i, hash.get(i) + 1);
                if (hash.get(i) > 1) count++;
            } else {
                // chua ton tai thi khoi tao
                hash.put(i, 1);
            }
        }        
        int[] result = new int[count];
        int index = 0;

        for (Integer i : mySet) {
            if (hash.get(i) > 1) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }

    public static int[] exercise1D(int[] arr) {
        
        Set<Integer> mySet = new HashSet<>();
        for (Integer i : arr) {
            mySet.add(i);
        }
        int[] result = new int[mySet.size()];
        int index = 0;
        for (Integer i : mySet) {
            result[index] = i;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 3, 2, 4, 4};
        exercise1A(arr);
        exercise1B(arr, 2, 7);
        int[] result = exercise1C(arr);

        for (Integer i : result) {
            System.out.println(i);
        }

        arr = exercise1D(arr);
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
