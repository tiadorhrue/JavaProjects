package GroupProject2;

public class Task3Three {
    public static void main(String[] args) {

        String split="Hello, World";
        int counter=0;

        for (int i = 0; i < split.length(); i++) {

            if(split.charAt(i)==','||split.charAt(i)=='!'|| split.charAt(i)=='.'|| split.charAt(i)=='?'|| split.charAt(i)==' '){
                counter++;
            }
            }
        System.out.println(counter);
        }


    }

