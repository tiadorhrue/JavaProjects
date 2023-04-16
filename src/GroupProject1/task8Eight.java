package GroupProject1;

public class task8Eight {

    public static void main(String[] args) {

        int[] array = {40, 20, 8674, 30, 40, 59, 987, 3920};
        int maximum = 0;
        int minimum = array[0];




        for (int i = 0; i < array.length; i++) {

            if (array[i] < minimum)
            { minimum=array[i];
            }

            if (array[i] > maximum) {
                    maximum = array[i];

            }

        }

        System.out.println("The maximum number is "+maximum+" & the minimum number is "+minimum);
    }
}

