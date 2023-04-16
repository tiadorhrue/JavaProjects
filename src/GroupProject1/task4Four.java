package GroupProject1;

public class task4Four {

    public static void main(String[] args) {

        int[][] matrix = {
                {5, 10, 15, 20},
                {2, 4, 6, 8},
                {3, 9, 12, 15},
                {4, 8, 16, 20}
        };

        int sume = 0;
        int sumo = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sume = sume + matrix[i][j];}
                    if (matrix[i][j] % 2 != 0) {
                        sumo = sumo + matrix[i][j];

                    }
                }

            }

        System.out.println(sume);
        System.out.println(sumo);
    }
}