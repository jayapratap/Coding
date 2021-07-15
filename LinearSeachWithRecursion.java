public class LinearSeachWithRecursion {
    public static void main(String[] args) {
        int[] arr = { 3, 9, 4, 1, 45, -2, 45, 32, 14};
        System.out.println(linearSearch(arr, -2, 0));
    }

    private static int linearSearch(int[] arr, int i, int index) {
        if(index >= arr.length) return -1;
        if(arr[index] == i) return index;
        
        return linearSearch(arr, i, index+1);
    }
}
