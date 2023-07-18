import java.util.Arrays;

public class Main {

    public static int[] countSort(int[] array){
        int maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
        for (int values : array){
            minValue = Math.min(minValue, values);
            maxValue = Math.max(maxValue, values);
        }
        int countArray[] = new int[maxValue + 1];
        for (int elements : array){
            countArray[elements]++;
        }
        int index = 0;
        for (int iterator = minValue ; iterator <= maxValue ; iterator++){
            int temp = countArray[iterator] ;
            while (temp > 0){
                array[index] = iterator;
                index++;
                temp--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countSort(new int[]{1,3,1})));
    }
}