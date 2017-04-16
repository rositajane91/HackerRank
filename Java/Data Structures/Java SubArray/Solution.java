import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            int index=i;
            int sum=0;
            while(index>=0){
                sum += arr[index];
                if(sum<0)count++;
                index--;
            }
        }
        System.out.println(count);
    }
}