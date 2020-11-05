package com.cn.exclusiveGirlfriend.utiles;
import java.util.Random;

import javax.mail.*;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
public class Email {
	static Emailutil emailutil=new Emailutil();
	private static String authCode=emailutil.achieveCode();
	public  void sendAuthCodeEmail(String email) {
		try {
			//实例化
			SimpleEmail mail = new SimpleEmail();
			mail.setHostName("smtp.qq.com");//发送邮件的服务器
			mail.setAuthentication("484150040@qq.com", "svxftoktsiqgbhhd");//登录账号，SMTP的密码
			mail.setFrom("484150040@qq.com",email);  //发送邮件的邮箱和发件人
			mail.setSSLOnConnect(true); //使用安全链接
			mail.addTo(email);//接收的邮箱
			mail.setSubject("验证码");//设置邮件的主题
			mail.setMsg("尊敬的用户:你好!\n\t 您的验证码是："+ authCode+"。请不要把验证码泄露给其他人。     (有效期为一分钟)");//设置邮件的内容
			mail.send();//发送
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @return the authcode
	 */
	public static String getAuthcode() {
		return authCode;
	}



}