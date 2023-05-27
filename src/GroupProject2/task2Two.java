package GroupProject2;

public class task2Two {
    String rev = "";
    boolean ans = false;

    public boolean isAns(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
}
class TaskTester{
    public static void main(String[] args) {

        task2Two obj=new task2Two();
        boolean isPalidrome= obj.isAns("madaam");
        System.out.println(isPalidrome);



    }
}
