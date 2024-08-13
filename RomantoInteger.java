import java.util.*;

public class RomantoInteger {
    public static void main(String[] args) {
        String roman = "IX";
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = roman.length();

        int result = map.get(roman.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            if (map.get(roman.charAt(i)) < map.get(roman.charAt(i + 1))) {
                result -= map.get(roman.charAt(i));
            } else {
                result += map.get(roman.charAt(i));
            }
        }

        System.out.println(result);
    }
}
