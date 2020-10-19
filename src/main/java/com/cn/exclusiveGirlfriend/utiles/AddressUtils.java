package com.cn.exclusiveGirlfriend.utiles;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * @program: up
 * @description: 获取ip地址
 * @author: Yang Fang Hong
 * @create: 2020-08-14 09:52
 */
public class AddressUtils {
    /**
     * 读取
     *
     * @param rd
     * @return
     * @throws IOException
     */
    public static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    /**
     * 创建链接
     *
     * @param url
     * @return
     * @throws IOException
     * @throws JSONException
     */
    public static JSONArray readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONArray json = JSONArray.parseArray(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    /**
    *@Description: 获取浏览器访问数据
    *@Param: [request]
    *@return: java.lang.String
    *@Author: Yang Fang Hong
    *@date: 2020/10/17
    */
    public static String browserTesting(HttpServletRequest request) {
        String userAgent = request.getHeader("user-agent").toLowerCase();
        String phoneType = "";
        if (userAgent.indexOf("micromessenger") != -1) {
            if (userAgent.indexOf("android") != -1) {
                phoneType = "安卓微信浏览器";
            } else {
                phoneType = "苹果微信浏览器";
            }
        } else if (userAgent.indexOf("android") != -1) {
            //安卓
            phoneType = "安卓浏览器";
        } else if (userAgent.indexOf("iphone") != -1 || userAgent.indexOf("ipad") != -1 || userAgent.indexOf("ipod") != -1) {
            //苹果
            phoneType = "苹果浏览器";
        } else {
            //电脑
            phoneType = "电脑浏览器";
        }
        return phoneType;
    }



    /**
     * 获取当前网络ip
     * @param request
     * @return
     */
    public static String getIpAddr1(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        System.out.println("x-forwarded-for ip: " + ip);
        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个ip值，第一个ip才是真实ip
            if( ip.indexOf(",")!=-1 ){
                ip = ip.split(",")[0];
            }
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
            System.out.println("Proxy-Client-IP ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
            System.out.println("WL-Proxy-Client-IP ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
            System.out.println("HTTP_CLIENT_IP ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            System.out.println("HTTP_X_FORWARDED_FOR ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("X-Real-IP");
            System.out.println("X-Real-IP ip: " + ip);
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
            System.out.println("getRemoteAddr ip: " + ip);
        }
        System.out.println("获取客户端ip: " + ip);
        return ip;
    }

    /**
     * 获取当前网络ip
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request){
        String ipAddress = request.getHeader("x-forwarded-for");
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
            if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){
                //根据网卡取本机配置的IP
                InetAddress inet=null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ipAddress= inet.getHostAddress();
            }
        }
        //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15
            if(ipAddress.indexOf(",")>0){
                ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));
            }
        }
        return ipAddress;
    }









    //----------------------------------------------------------------------------------------------------
    /**
     * unicode 转换成 中文
     *
     * @param theString
     * @return
     */
    public static String decodeUnicode(String theString) {
        char aChar;
        int len = theString.length();
        StringBuffer outBuffer = new StringBuffer(len);
        for (int x = 0; x < len; ) {
            aChar = theString.charAt(x++);
            if (aChar == '\\') {
                aChar = theString.charAt(x++);
                if (aChar == 'u') {
                    int value = 0;
                    for (int i = 0; i < 4; i++) {
                        aChar = theString.charAt(x++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed      encoding.");
                        }
                    }
                    outBuffer.append((char) value);
                }
                else {
                    if (aChar == 't') {
                        aChar = '\t';
                    }
                    else if (aChar == 'r') {
                        aChar = '\r';
                    }
                    else if (aChar == 'n') {
                        aChar = '\n';
                    }
                    else if (aChar == 'f') {
                        aChar = '\f';
                    }
                    outBuffer.append(aChar);
                }
            }
            else {
                outBuffer.append(aChar);
            }
        }
        return outBuffer.toString();
    }

    /**
    *@Description: 解析url地址传的数据
    *@Param: [address]
    *@return: java.util.List<java.lang.String>
    *@Author: Yang Fang Hong
    *@date: 2020/10/17
    */
    public static List<String> getURLCollection(String address){
        List<String> list = new LinkedList<String>();
        try{
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            conn.connect();
            InputStream in = conn.getInputStream();
            InputStreamReader input = new InputStreamReader(in, "UTF-8");
            BufferedReader buf = new BufferedReader(input);
            String nextLine = buf.readLine();

            while(nextLine != null){
                list.add(nextLine);
                nextLine = buf.readLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }


    /**
    *@Description: 通过ip获取归属地区           第一种
    *@Param: [address]
    *@return: java.lang.String
    *@Author: Yang Fang Hong
    *@date: 2020/10/17
    */
    public static String collectionaddress(String ip){
        JSONArray json = null;
        try {
            json = readJsonFromUrl("http://freeapi.ipip.net/"+ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String a1 = (String)json.get(0);
        String a2 = (String)json.get(1);
        String a3 = (String)json.get(2);
        Set set=new HashSet();
        if (a1!=null && a1.trim().length()>0){
            set.add(a1);
        }
        if (a2!=null && a2.trim().length()>0){
            set.add(a2);
        }
        if (a3!=null && a3.trim().length()>0){
            set.add(a3);
        }
        StringBuffer dq=new StringBuffer("");
        for (Object o : set) {
            dq.append(o);
            System.out.println(o);
        }
        return dq.toString();
    }



    /**
     *@Description: 通过ip获取归属地区           第二种
     *@Param: [address]
     *@return: java.lang.String
     *@Author: Yang Fang Hong
     *@date: 2020/10/17
     */
    public static String ipAddress(String ip){
        String address = "https://sp0.baidu.com/8aQDcjqpAAV3otqbppnN2DJv/api.php?query="+ip+"&resource_id=5809";
        List<String> list1 = new AddressUtils().getURLCollection(address);
        String dq= null;
        for (String s : list1) {
            Map maps = (Map) JSON.parse(s);
            JSONArray str= (JSONArray) maps.get("Result");
            com.alibaba.fastjson.JSONObject str1= (com.alibaba.fastjson.JSONObject) str.get(0);
            com.alibaba.fastjson.JSONObject ss= (com.alibaba.fastjson.JSONObject) str1.get("DisplayData");
            com.alibaba.fastjson.JSONObject str2= (com.alibaba.fastjson.JSONObject) ss.get("resultData");
            com.alibaba.fastjson.JSONObject ss1= (JSONObject) str2.get("tplData");
            dq= (String) ss1.get("location");
            if (dq!=null&&dq.trim().equals("保留地址")){
                dq="本机地址";
            }
            break;
        }
        return dq;
    }












//    -------------------------------------------------------------------------------------------------------------

}
