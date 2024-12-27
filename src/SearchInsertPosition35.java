public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args){
        SearchInsertPosition35 insertPosition35 = new SearchInsertPosition35();
        int[] a = new int[]{1,3,5,6};
        System.out.println("" + insertPosition35.searchInsert(a, 5));
        a = new int[]{1,3,5,6};
        System.out.println("" + insertPosition35.searchInsert(a, 2));
        a = new int[]{1,3,5,6};
        System.out.println("" + insertPosition35.searchInsert(a, 7));
    }
}
