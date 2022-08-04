import java.util.HashMap;
import java.util.Scanner;

class Test{
    public static void checkRepetition(String chars) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length(); i++) {
            if (map.containsKey(chars.charAt(i))) {
                int count = map.get(chars.charAt(i));
                map.put(chars.charAt(i), count + 1);
            } else {
                map.put(chars.charAt(i), 1);
            }
        }

        for (int i = 0; i < chars.length(); i++) {
            int count = map.get(chars.charAt(i));
            if (count == 1) {
                System.out.println("First non-repeating char is " + chars.charAt(i));
                return;
            }
        }
        System.out.println("There is no unique character");
    }

    public static void main(String[] args) {

        System.out.println("Enter String to check repetition");

        Scanner input = new Scanner(System.in);
        String chars = input.nextLine();
        input.close();

        checkRepetition(chars);
        
    }
}