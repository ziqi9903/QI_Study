import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int n = in.nextInt();
            int [] an = new int[n];

            for (int i = 0; i < n; i++){

                int a = in.nextInt();
                int b = in.nextInt();

                int [][] num = new int[a][b];

                for(int k = 0; k < a; k++){
                    for(int j = 0; j < b; j++){
                        num[k][j] = in.nextInt();
                    }
                }


                for(int j = 0; j < b; j++)
                    for(int k = 0; k < a/2; k++){
                        if ( num[k][j] != num[a - k - 1][j]){
                            int p= (num[k][j] + num[a - k - 1][j])/2;
                            if (p - num[a - k - 1][j] > 0){
                                an[i] += p - num[a - k - 1][j];
                                num[a - k - 1][j] = p;
                            }else {
                                an[i] +=  num[a - k - 1][j] - p;
                                num[a - k - 1][j] = p;
                            }
                            if(p - num[k][j] > 0){
                                an[i] += p - num[k][j];
                                num[k][j] = p;
                            }else {
                                an[i] +=  num[k][j] - p;
                                num[k][j] = p;
                            }
                        }
                    }

                for(int j = 0; j < b/2; j++)
                    for(int k = 0; k < a; k++){
                        if ( num[k][j] != num[k][b - j - 1]){
                            int p= (num[k][j] + num[k][b - j - 1])/2;
                            if (p - num[k][b - j - 1] > 0){
                                an[i] +=p - num[k][b - j - 1];
                                num[k][b - j - 1] = p;
                            }else {
                                an[i] +=  num[k][b - j - 1] - p;
                                num[k][b - j - 1] = p;
                            }
                            if(p - num[k][j] > 0){
                                an[i] += p - num[k][j];
                                num[k][j] = p;
                            }else {
                                an[i] +=  num[k][j] - p;
                                num[k][j] = p;
                            }
                        }
                    }


            }
            for(int i = 0; i < n; i++){
                System.out.println(an[i]);
            }
        }
    }
}