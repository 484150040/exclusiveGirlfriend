package com.cn.exclusiveGirlfriend.utiles;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import sun.net.www.protocol.http.HttpURLConnection;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName IdentifyImageUtile
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/11/4 11:51
 * @Hodified By:
 **/
public class IdentifyImageUtile {

    public static String getImgtext(String img) throws Exception {
        String args1="&image_url="+img+"&image=&type=commontext&detect_direction=false";
        OutputStreamWriter out = null;
        BufferedReader in = null;
        StringBuilder result = new StringBuilder();
        try {
            URL realUrl = new URL("https://cloud.baidu.com/aidemo");
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置通用的请求头属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行   否则会抛异常（java.net.ProtocolException: cannot write to a URLConnection if doOutput=false - call setDoOutput(true)）
            conn.setDoOutput(true);
            conn.setDoInput(true);
            //获取URLConnection对象对应的输出流并开始发送参数
            out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            //添加参数
            out.write(args1);
            out.flush();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {// 使用finally块来关闭输出流、输入流
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result.toString();


}
    public static String getWords(String img){
        try {
            //解析图片
            String s=getImgtext(img);
            System.out.println(s);
            //图片路径或者文件找不到
            if (s.contains("302")==false){
                Map maps = (Map) JSON.parse(s);
                JSONObject str=null;
                Integer integer= (Integer) maps.get("errno");
                if (integer!=null&&integer==0){
                    str= (JSONObject) maps.get("data");
                }
                JSONArray str1=null;
                if (str!=null){
                    str1 = (JSONArray) str.get("words_result");
                }
                StringBuffer stringBuffer=new StringBuffer();
                if (str1!=null){
                    for (int i = 0; i <str1.size() ; i++) {
                        JSONObject jsonArray= (JSONObject) str1.get(i);
                        String aa= (String) jsonArray.get("words");
                        if (i==(str1.size()-1)){
                            stringBuffer.append(aa);
                        }else {
                            stringBuffer.append(aa);
                            stringBuffer.append(",");
                        }
                    }

                }
                System.out.println(stringBuffer);
                return stringBuffer.toString();
            }
            return "302";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    public static void main(String[] args) {
        try {
            String s=getWords("http://pic1.win4000.com/wallpaper/b/539ffc58af34e.jpg");
            System.out.println(s.length());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
