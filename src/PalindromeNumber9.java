public class PalindromeNumber9 {

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int n = x;
        int rev = 0;
        int reminder;
        while( n != 0){
            reminder = n % 10;
            rev = rev * 10 + reminder;
            n = n / 10;
        }
        return rev == x;
    }

    public static void main(String[] arg){
        PalindromeNumber9 palindromeNumber9 = new PalindromeNumber9();
        System.out.println("1234321 is a palindrome number : " + palindromeNumber9.isPalindrome(1234321));
        System.out.println("888 is a palindrome number : " + palindromeNumber9.isPalindrome(888));
        System.out.println("6784 is a palindrome number : " + palindromeNumber9.isPalindrome(6784));
    }
}
