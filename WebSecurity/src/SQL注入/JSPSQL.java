package SQL注入;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import static com.sun.javafx.util.Utils.split;

/**
 * @author: Administrator
 * @date: 2021/1/25 14:51
 * @description:
 */
public class JSPSQL {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String sql = "select * from User and 1 or 1 = 1";
        System.out.println(sql_inj(sql));
    }

    public static boolean sql_inj(String str)

    {
        String inj_str = "'|and|exec|insert|select|delete|update|count|*|%|chr|mid|master|truncate|char|declare|;|or|-|+|,";

        String inj_stra[] = split(inj_str,"|");

        for (int i=0 ; i < inj_stra.length ; i++ )

        {
            if (str.indexOf(inj_stra[i])>=0)

            {
                System.out.println(str);
                return true;

            }

        }
        System.out.println(str);
        return false;
    }


        protected static boolean sqlValidate(String str) {
                 str = str.toLowerCase();//统一转为小写
                 //String badStr = "and|exec";
                 //String badStr = "'|and|exec|execute|insert|select|delete|update|count|drop|chr|mid|master|truncate|char|declare|sitename|net user|xp_cmdshell|or|like";
                 String badStr = "'|and|exec|execute|insert|create|drop|table|from|grant|use|group_concat|column_name|" +
                "information_schema.columns|table_schema|union|where|select|delete|update|order|by|count|*|" +
                "chr|mid|master|truncate|char|declare|or|;|-|--|+|,|like|//|/|%|#";        //过滤掉的sql关键字，可以手动添加
                 String[] badStrs = badStr.split("\\|");
               for (int i = 0; i < badStrs.length; i++) {
                     if (str.indexOf(badStrs[i]) !=-1) {
                System.out.println("匹配到："+badStrs[i]);
                return true;
            }
                     }
               return false;
    }
}
