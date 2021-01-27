import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.sql.PreparedStatement;
import java.util.Random;

/**
 * @author: Administrator
 * @date: 2021/1/25 14:51
 * @description:
 */
public class RandomNumber {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        /*SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        int i = 50;
        while(i > 0){
            System.out.println((int)(20+ random.nextInt(155-20+1)));
            i--;
        }*/
       /* System.out.println((int)((Math.random()*9+1)*100000));
        System.out.println((int)((SecureRandom.getInstance("SHA1PRNG").nextFloat()*9+1)*100000));
        System.out.println(SecureRandom.getInstance("SHA1PRNG").nextInt(1000000));
        System.out.println(SecureRandom.getInstance("SHA1PRNG").nextFloat()*100000);*/

        System.out.println((int)(Math.random()*10000));
        System.out.println((int)(SecureRandom.getInstance("SHA1PRNG").nextFloat()*10000));
        Random r = new Random();
        System.out.println(r.nextInt(10));
        System.out.println((int)(SecureRandom.getInstance("SHA1PRNG").nextLong()));

        System.out.println((int)(Math.floor(Math.random()*99+1)));
        System.out.println( (int)(Math.floor(SecureRandom.getInstance("SHA1PRNG").nextFloat()*99+1)));

    }
}
