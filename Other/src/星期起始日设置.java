import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * https://blog.csdn.net/weixin_42845682/article/details/110407379
 */

public class 星期起始日设置 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        c.set(2020, 0, 1);
        System.out.println( sdf.format( c.getTime() ) );

        // 先看一下2020-01-01是一年中的第几周
        System.out.println( c.get( Calendar.WEEK_OF_YEAR) );

        System.out.println("--------------------------------- ");
        // 在不修改为周一的情况下，2019-11-29 周日 仍然是 2020年的第一周
        // 而 2020-01-05 周日 是2020年的第二周
        c.set(2019, 11, 29);
        System.out.println( c.get( Calendar.WEEK_OF_YEAR) ); // 输出1，第一周
        c.set(2020, 0, 5);
        System.out.println( c.get( Calendar.WEEK_OF_YEAR) ); // 输出2，第二周

        System.out.println("--------------------------------- ");
        // 修改周的起始日期，则周的起止变为： 周一到周日
        // 2019-11-29 周日，变为 2019年的最后1周； 2020-01-05 周日 是2020年的第1周
        c.setFirstDayOfWeek( Calendar.MONDAY );
        c.set(2019, 11, 29);
        System.out.println( c.get( Calendar.WEEK_OF_YEAR) ); // 输出52，2019年的最后一周
        c.set(2020, 0, 5);
        System.out.println( c.get( Calendar.WEEK_OF_YEAR) ); // 输出1，第一周
    }
}

