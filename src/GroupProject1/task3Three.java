package GroupProject1;

public class task3Three {

    public static void main(String[] args) {

        int [][] matrix={
                {5, 10, 15, 20},
                {2, 4 , 6 , 8},
                {3 , 9 , 12 , 15},
                {4 , 8 , 16 , 20}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]%2==0)
                {
                    System.out.print(matrix[i][j]+" ");
                }

            }

        }
    }
}
