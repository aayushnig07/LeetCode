package algorithm;


import java.util.HashMap;

//https://leetcode.com/problems/roman-to-integer/

/*
* Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000*/
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {
        // store the roman number and its equivalent integer number in a hashmap
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        //reverse iterate one by one
        int length=s.length();
        int sum=map.get(s.charAt(length-1));
        for(int i=length-2;i>=0;i--){
            int L = map.get(s.charAt(i));
            int R = map.get(s.charAt(i+1));
            if(L>=R)
                sum=sum+L;
            else
                sum=sum-L;
        }
        return sum;
    }
}
