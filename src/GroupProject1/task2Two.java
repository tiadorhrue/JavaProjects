package GroupProject1;

public class task2Two {
    public static void main(String[] args) {

        int [] matrix = {70,10, 34, 45, 90, 13};
        int sum=0;

        for (int i = 0; i < matrix.length; i++) {
            sum=matrix[i]+sum;

        }
        System.out.println(sum);

    }

}
