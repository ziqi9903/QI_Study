
import java.util.Arrays;
import java.util.Random;
import java.math.*;
import java.util.Scanner;

    public class 红包分发 {
        public static long now_time;
        public static long seed;
        public static int[] get_red_packets(int money, int num) {
            Random random = new Random(seed);
            seed = random.nextLong();
            int[] res = new int[num];
            double[] temp=new double[num];
            double sum = 0;
            int sum2 = 0;
            for (int i = 0; i < num; i++) {
                temp[i] = random.nextDouble();
                sum += temp[i];
            }
            for (int i = 0; i < num; i++) {
                res[i] = 1+ (int)(temp[i] / sum * (money-num));
                sum2 += res[i]-1;
            }
            res[random.nextInt(num)]+=money-sum2-num;
            return res;
        }

        public static void show(int[] red_packet){
            System.out.println("红包 : " + Arrays.toString(red_packet));
        }

        public static void main(String[] args) {
            int num, money;
            Scanner scanner = new Scanner(System.in);
            now_time = System.currentTimeMillis();
            Random init_random = new Random(now_time);
            seed = init_random.nextLong();
            System.out.println("请输入要分发的红包数量:");
            num = scanner.nextInt();
            System.out.println("请输入要分发的红包总金额(分):");
            money = scanner.nextInt();
            int a[] = get_red_packets(money,num);
            show(a);
        }
    }
