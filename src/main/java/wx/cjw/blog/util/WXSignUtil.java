package wx.cjw.blog.util;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

@Log4j2
@Component
public class WXSignUtil {
    final public static String token = "123123";

    public boolean checkSignature(String signature, String timestamp, String nonce) {
        String[] arr = new String[]{token, timestamp, nonce};
        // 将token 、 timestamp 、 nonce 三个参数进行字典序排序

        Arrays.sort(arr);
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }
        log.info("拼接后：" + content.toString());
        MessageDigest md = null;
        String tmpStr = null;
        try {
            //闯将 MessageDigest对象，Message Digest 通过getInstance系列静态函数来进行实例化和初始化
            md = MessageDigest.getInstance("SHA-1");
            // 将三个参数字符串拼接成一个字符串进行sha- 加密

            byte[] digest = md.digest(content.toString().getBytes());

            tmpStr = byteToString(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        log.info("执行微信加密认证");
        content = null;
        log.info(tmpStr);
        log.info(signature.toUpperCase());

        return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
    }

    private static String byteToString(byte[] bytes) {
        if (null == bytes || bytes.length == 0) {
            return "";
        }
        String strContent = "";
        try {
            strContent = new String(bytes, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return strContent;
    }

    public String byte2hex(byte[] b) //二行制转字符串
    {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) hs = hs + "0" + stmp;
            else hs = hs + stmp;
            if (n < b.length - 1) hs = hs + ":";
        }
        return hs.toUpperCase();
    }
}
