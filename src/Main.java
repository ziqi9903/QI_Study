/**
 * @author: Administrator
 * @date: 2020/12/30 18:05
 * @description:
 */
import java.util.Scanner;
import java.lang.Math;
import java.lang.Number;
public class Main {
    public static void main(String[] args){
        int n;
        int i = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] test= new int[n];
        while(n > 0){
            double temp = minTest(input.nextInt());
            test[i] = (int)temp;
            i++;
            n--;
        }
        int t = 0;
        while(i != 0){
            System.out.println(test[t]);
            t++;
            i--;
        }
        
    }
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static double  minTest(int n){
        if(isPowerOfTwo(n)){
            return Math.log(n)/Math.log(2.0);
        }else{
            return Math.log(n)/Math.log(2.0) + 1;
        }
    }
}
