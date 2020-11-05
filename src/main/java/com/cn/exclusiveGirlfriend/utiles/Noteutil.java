package com.cn.exclusiveGirlfriend.utiles;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Document;
import org.dom4j.DocumentException;

public class Noteutil {

	//随机验证码生成
	private static final Integer mobile_code=(int)((Math.random()*9+1)*100000);
	//请求地址
	private static String Url="http://106.ihuyi.cn/webservice/sms.php?method=Submit";
	public static void note(String mobile1){
		//实例化客户端
		HttpClient client=new HttpClient();
		//实例化主方法
		PostMethod method=new PostMethod(Url);

		//在头文件中设置转码
		client.getParams().setContentCharset("GBK");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=GBK");

		//签名:短信发送的内容
		String sent=new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");
		//提交信息
		NameValuePair [] data={
				new NameValuePair("account", "C25464606"),//用户名ID
				new NameValuePair("password", "f87a3481cc327dbb4e58adb9a589a1a0"),//用户名密码的MD5,KEY
				new NameValuePair("mobile", mobile1), //获取手机号码手机
				new NameValuePair("content", sent),//获取签名(短信消息)
		};
		//增加到主方法中
		method.setRequestBody(data);

		try {
			//实行主方法
			client.executeMethod(method);
			//响应主方法
			String SubmitResult=method.getResponseBodyAsString();
			//记录主方法所返回的值
			Document doc = DocumentHelper.parseText(SubmitResult);
			//把元素增加到根项目方法中
			Element root = doc.getRootElement();
			//增加成分
			String code = root.elementText("code");
			String msg = root.elementText("msg");
			String smsid = root.elementText("smsid");
			//输出
			/*System.out.println(code);
			System.out.println(msg);
			System.out.println(smsid);*/
			//提示提交成功
			/*if("2".equals(code)){
				System.out.println("短信提交成功");
			}*/
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 * @return the mobileCode
	 */
	public static Integer getMobileCode() {
		return mobile_code;
	}
}
