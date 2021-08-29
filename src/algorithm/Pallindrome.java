package algorithm;

//https://leetcode.com/problems/palindrome-number/
//
public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome(-121));
    }

    public static boolean isPallindrome(int n){
        if(n==0)
            return true;
        if(n<0)
            return false;

        String originalNumber = new StringBuilder().append(n).toString();
        String reverseNumber = new StringBuilder().append(n).reverse().toString();
        return (originalNumber.equals(reverseNumber))?true:false;
    }
}
