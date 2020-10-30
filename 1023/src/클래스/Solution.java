package Å¬·¡½º;

import java.util.Random;
import java.util.Scanner;

class Solution {
    public static long[] solution(int x, int n) {
        
        long[] answer = {};
        
        int sum = 0 ;
        for(int i = 1 ; i<=n ; i++){
            sum += x*i;
            answer[i-1]=sum;
            System.out.print("[");
            System.out.print(answer[i-1]+",");
            System.out.print("]");
        }
        
        
        
        return answer;
    }
    
    public static void main(String[] args){
    	solution(2,5);
    }
}
