package GroupProject1;

public class task1One {
    public static void main(String[] args) {

        int[] temp = {70, 48, 50, 67, 70, 80, 99};
        int highest=0;
        int low=temp[0];


        for (int i = 0; i < temp.length; i++) {{
                if (temp[i] > highest) {
                    highest = temp[i];}

                if (temp[i]<low){
                    low=temp[i];
                }

            }

        }
        System.out.println("Hightest ="+highest+" Lowest = "+low);


    }

    }

