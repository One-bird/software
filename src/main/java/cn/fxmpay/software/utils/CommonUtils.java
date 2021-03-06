package cn.fxmpay.software.utils;
import java.security.MessageDigest;

/**
 * 通用工具类
 * @author OneBird
 * @date 2022/5/20 9:21
 **/
public class CommonUtils {

    /**
     * MD5工具类
     * @param data
     * @return
     */
    public static String MD5(String data) {
        try {
            java.security.MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(data.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte item : array) {
                sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString().toUpperCase();
        } catch (Exception exception) {
        }
        return null;
    }

}
