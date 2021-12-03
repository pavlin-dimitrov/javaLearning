public class TaskTwo {
    public static void main(String[] args) {
        // New array with only common elements from two arrays (with equal length).
        int[] arrayOne= {1, 2, 3, 4, 5, 1};
        int[] arrayTwo= {4, 10, 2, 6, 20};
        int n = 0;

        for(int i = 0; i < arrayOne.length; i++){
            for(int j = 0; j < arrayTwo.length; j++){
                if (arrayOne[i] == arrayTwo[j]){
                    n++;
                }
            }
        }

        int[] result = new int[n];              //New array length;
        int counter = 0;                        // Counter that return the position of
        for(int a = 0; a < arrayOne.length; a++){
            for(int b = 0; b < arrayTwo.length; b++){
                if (arrayOne[a] == arrayTwo[b]){
                    //System.out.print(arrayOne[a] + ", " ); //Така работи...
                        result[counter] = arrayOne[a];
                        counter++;
                }
            }
        }
        for (int c = 0; c < counter; c++) {
            System.out.print(result[c] + " "); //NOT WORKING
        }
    }
}