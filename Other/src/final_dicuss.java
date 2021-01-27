/**
 * @author: Administrator
 * @date: 2021/1/6 17:43
 * @description:
 */
public class final_dicuss {

    public static void main(String[] args) {
        final int a = 10;
        final Te te = new Te("qi",18);
        te.name="zi";
    }
}
class Te{
    public Te(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String name;
    int age;
}
