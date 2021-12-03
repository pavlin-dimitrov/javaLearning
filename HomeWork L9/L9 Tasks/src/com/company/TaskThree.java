public class TaskThree {
    public static void main(String[] args) {
        // New array with even elements on even indexes from arrayOne and odd elements on odd indexes from arrayTwo
        int[] arrayOne= {3, 5, 8, 9, 4, 5};
        int[] arrayTwo= {11, 22, 33, 44, 55, 66};
        int [] result = new int[(arrayOne.length / 2) + 1 + arrayTwo.length / 2];
        for(int i = 0; i < 6; i++){
            if((i % 2) == 0){
                result[i] = arrayOne[i];
            } else {
                result[i] = arrayTwo[i];
            }
            System.out.print (result[i] + ", ");
        }
    }
}
