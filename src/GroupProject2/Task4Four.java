package GroupProject2;

public class Task4Four {

    public boolean checkAnagram (String str, String str1){

        char[] charsOfFirst = str.toLowerCase().toCharArray();
        char[] charsOfSecond = str1.toLowerCase().toCharArray();

        if (charsOfFirst.length != charsOfSecond.length) {
            return false;
        }

        int[] alphabet =new int[26];

        for (int i = 0; i < charsOfFirst.length; i++) {
            alphabet[charsOfFirst[i] - 'a']++;
            alphabet[charsOfSecond[i] - 'a']--;
        }

        for (int frequency : alphabet) {
            if (frequency != 0) return false;
        }

        return true;
    }
}
class AnagramTester{
    public static void main(String[] args) {
        Task4Four obj=new Task4Four();
        boolean isAnagram = obj.checkAnagram("listen","silent");
        System.out.println("These two words are anagrams: "+isAnagram);

        
    }
}

