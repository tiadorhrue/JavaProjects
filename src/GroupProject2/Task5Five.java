package GroupProject2;

public class Task5Five {
    public static void main(String[] args) {
        String str= "abracadabra";

        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeating char: " + c);
                break;

            }
        }
    }
}

