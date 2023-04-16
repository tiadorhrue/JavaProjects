package GroupProject1;

public class task9Nine {
    public static void main(String[] args) {

        int[] array = {23, 65, 7, 344, 488, 4355, 22, 56, 123};

        int maximum = 0;
        int maximum2 = 0;

        for ( int nums : array) {
            if (nums > maximum ) {
                maximum2 = maximum;
            }if(nums > maximum2)
            {maximum=nums;}

        }
        System.out.println(maximum2);

    }
}
