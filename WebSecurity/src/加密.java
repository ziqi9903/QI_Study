/**
 * @author: Administrator
 * @date: 2021/1/26 12:35
 * @description:
 */
public class 加密 {
    public static void main(String[] args) {
        System.out.println(encrypt("df#aq1sw2"));
    }
    public static String encrypt(String strpasswd) {
        StringBuffer ls_decrypt = new StringBuffer();
        //String ls_seed = "ZXT10LSZTESOFTRESMASTER";
        // 2010-05-21 modified by wanggp 密钥加长到64位，支持64位数据加密
        String ls_seed = "ZXT10LSZTESOFTRESMASTERBUSINESSOPERATIONSUPPORTSYSTEMRESMASTER30";
        for (int i = 0; i < strpasswd.length(); i++) {
            int j = strpasswd.charAt(i) + ls_seed.charAt(i) - 64;
            if (j >= 95) {
                j = j - 95;
            }
            ls_decrypt.append(String.valueOf((char) (j + 32)));
        }
        return ls_decrypt.toString();
    }

    /**解密函数
     *
     * @author
     * @get()
     * @return String
     *
     */
    public static String decrypt(String strpasswd) {
        StringBuffer ls_decrypt = new StringBuffer();
        //String ls_seed = "ZXT10LSZTESOFTRESMASTER";
        String ls_seed = "ZXT10LSZTESOFTRESMASTERBUSINESSOPERATIONSUPPORTSYSTEMRESMASTER30"; // 2010-05-21 modified by wanggp 密钥加长到64位，支持64位数据加密
        for (int i = 0; i < strpasswd.length(); i++) {
            int j = strpasswd.charAt(i) - ls_seed.charAt(i) + 95;
            if (j >= 95) {
                j = j - 95;
            }
            ls_decrypt.append(String.valueOf((char) (j + 32)));
        }
        return ls_decrypt.toString();
    }
}
