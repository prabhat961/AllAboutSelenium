package array;

public class chkElement {
    public static boolean isPresent(int[] arr, int m){
        for(int i = 0; i <= arr.length - 1; i++){
            if (arr[i] == m)
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {11, 19, 25,32, 89};
        System.out.println("The searched element is present in the array:"+isPresent(arr, 89));
    }
}
