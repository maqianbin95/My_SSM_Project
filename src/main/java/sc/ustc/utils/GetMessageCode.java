package sc.ustc.utils;


import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONObject;

public class GetMessageCode {
    private static final String QUERY_PATH = "https://api.miaodiyun.com/20150822/industrySMS/sendSMS";
    private static final String ACCOUNT_SID = "01ace47b96764aac9df4e24aa131adc";
    private static final String AUTH_TOKEN = "68447c044502490bb6e04e7e06607061";


    // ������Ӧ���ֻ��ŷ�����֤��
    public static String getCode(String phone) {
        String rod = smsCode();
        String timestamp = getTimestamp();
        String sig = getMD5(ACCOUNT_SID, AUTH_TOKEN, timestamp);
        String tamp = "������������¼��֤�룺"+rod+"����Ǳ��˲���������Դ˶��š�";
        OutputStreamWriter out = null;
        BufferedReader br = null;
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL(QUERY_PATH);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoInput(true);// �����Ƿ���������д��
            connection.setDoOutput(true);// �����Ƿ���������������
            connection.setConnectTimeout(5000);// ����������Ӧʱ��
            connection.setReadTimeout(10000);// ���ò�����ȡʱ��
            connection.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            // �ύ����
            out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            String args = getQueryArgs(ACCOUNT_SID, tamp, phone, timestamp, sig, "JSON");
            System.out.println(args);
            out.write(args);
            out.flush();
            // ��ȡ���ز���

            br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String temp = "";
            while ((temp = br.readLine()) != null) {
                result.append(temp);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        JSONObject json = new JSONObject(result.toString());
        String respCode = json.getString("respCode");
        String defaultRespCode = "00000";
        if (defaultRespCode.equals(respCode)) {
            return rod;
        } else {
            return defaultRespCode;
        }
    }

    

    //���Թ���
  public static void main(String[] args) {
     String result = getCode("");
 }


    // ����һ���������ƴ�ӷ���
    public static String getQueryArgs(String accountSid, String smsContent, String to, String timestamp, String sig,
                                      String respDataType) {
        return "accountSid=" + accountSid + "&smsContent=" + smsContent + "&to=" + to + "��tamp=" + timestamp
                + "&sig=" + sig + "&respDataType=" + respDataType;
    }

    // ��ȡʱ���
    public static String getTimestamp() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    }

    // singǩ��
    public static String getMD5(String sid, String token, String timestamp) {

        StringBuilder result = new StringBuilder();
        String source = sid + token + timestamp;
        // ��ȡĳ�����ʵ��
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            // Ҫ���м��ܵĶ���
            byte[] bytes = digest.digest(source.getBytes());
            for (byte b : bytes) {
                String hex = Integer.toHexString(b & 0xff);
                if (hex.length() == 1) {
                    result.append("0" + hex);
                } else {
                    result.append(hex);
                }
            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result.toString();
    }

    // ������֤��
    public static String smsCode() {
        String random = (int) ((Math.random() * 9 + 1) * 100000) + "";
        return random;
    }
}
