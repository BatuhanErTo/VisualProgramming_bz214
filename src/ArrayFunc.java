import java.util.Arrays;

public class ArrayFunc {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 12, 18, 24, 26, 42};
        System.out.println(binarySearch(numbers,13));
        int[] numbers2 = {4, 7, 1, 18, 19, 27, 2, 12, 6};
        System.out.println(Arrays.toString(selectionSort(numbers2)));
    }
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(key < list[mid]){
                high = mid - 1;
            }else if(key > list[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -low-1;
    }

    public static int[] selectionSort(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            int curMin = list[i];
            int curMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < curMin){
                    curMin = list[j];
                    curMinIndex = j;
                }
            }
            if (curMinIndex != i){
                list[curMinIndex] = list[i];
                list[i] = curMin;
            }
        }
        return list;
    }
}
