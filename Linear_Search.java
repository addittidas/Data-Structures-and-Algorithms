public class Linear_Search{

    static int linearsearch(int[] arr, int element){
        if (arr.length == 0){
            return -1;
        }

        for (int ind = 0; ind < arr.length; ind++) {
            if (element == arr[ind]){
                return ind;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int[] nums = {11, 22, 33, 44, 55};
        int element = 12;
        int result = linearsearch(nums, element);
        System.out.println(result);
    }
}