public class StringReverser {


    public static String reverseString(String input) {
        String reversed = ""; 
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); 
        }
        return reversed; 
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original); 
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}

