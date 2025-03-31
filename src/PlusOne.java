import java.lang.reflect.Array;

public class PlusOne {

    public static void main(String[] agrs){
        PlusOne plusOneObj = new PlusOne();
        plusOneObj.plusOne(new int[]{1, 2, 3});
        plusOneObj.plusOne(new int[]{9,8,7,6,5,4,3,2,1,9});
        plusOneObj.plusOne(new int[]{2,9,9});
        plusOneObj.plusOne(new int[]{9,9,9,9});
    }
    public int[] plusOne(int[] digits) {

        System.out.println("-----------------------------------");
        for(int i = digits.length -1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i] += 1;
                for(int j : digits) {
                    System.out.println(j);
                }
                return digits;
            }
            digits[i] = 0;
        }
        System.out.println("------------------2-----------------");
        int[] dg = new int[digits.length + 1];
        dg[0] = 1;
        for(int j : dg) {
            System.out.println(j);
        }
        return dg;
    }
}
