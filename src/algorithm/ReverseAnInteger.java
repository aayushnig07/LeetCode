package algorithm;

//https://leetcode.com/problems/reverse-integer/
//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0

public class ReverseAnInteger {
    public static void main(String[] args) {
        System.out.println(reverse(10));
    }

    public static int reverse(int n){
        if(n==0)
            return 0;
        boolean isPositive;
        if(n<0)
            isPositive=false;
        else
            isPositive=true;

        StringBuilder sb = new StringBuilder();
        String reveredNumber = sb.append(Math.abs(n)).reverse().toString();
        try{
            return (isPositive)?Integer.parseInt(reveredNumber):Integer.parseInt(reveredNumber)*-1;
        }catch(Exception e){
            return 0;
        }
    }
}
