import java.util.Arrays;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 2) return strs[0];

        String result = getPrefix(strs[0],strs[1]);
        for(int i =2;i<strs.length;i++){
            result = getPrefix(result, strs[i]);
            if(result.isEmpty()) break;
        }
        return result;
    }


    private String getPrefix(String a, String b){
        int i =0;
        while(i < a.length() && i< b.length()) {
            if(a.charAt(i) != b.charAt(i)) break;
            i++;
        }
        return a.substring(0,i);
    }

    public static void main(String[] str){
        LongestCommonPrefix14 longestCommonPrefix14 = new LongestCommonPrefix14();
        String[] s = new String[]{"Flower", "Flow", "Flight"};
        System.out.println("Longest Common Prefix for " + Arrays.toString(s) + " is : "
                + longestCommonPrefix14.longestCommonPrefix(s));

        String[] s1 = new String[]{"Man", "Mango", "Major"};
        System.out.println("Longest Common Prefix for " + Arrays.toString(s1) + " is : "
                + longestCommonPrefix14.longestCommonPrefix(s1));
    }
}
