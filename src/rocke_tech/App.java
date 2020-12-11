package rocke_tech;

import java.util.LinkedHashMap;
import java.util.Map;

public class App{
    static void printCountSymb(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.containsKey(c) ? (map.get(c) + 1) : 1);
        }
        map.forEach((c, i) -> System.out.printf("%s%d", c, i));
    }

    static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++){
            if (str.charAt(i) != str.charAt((str.length() - 1) - i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        printCountSymb("EEADDDDDFFFVVVVBBBBBBBBBBBBBC");
        System.out.println();
        System.out.println(isPalindrome("EEADDDDDFFFVVVVBBBBBBBBBBBBBC"));
    }
}

