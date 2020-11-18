package com.mega.mvc05;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Aspect
@Service("mail")
public class MailService {

	@Autowired
	private JavaMailSender mailSender;
	
	public void mailSend2(JoinPoint joinPoint, Throwable ex) {
		Signature signature = joinPoint.getSignature();
		System.out.println(signature.getName());
		System.out.println(signature.toString());
		
		System.out.println("��������:" + ex.getMessage());
		System.out.println("������ �߻��Ͽ� mailSend2�޼��尡 ȣ���");
		String body = signature.toString()+ "\n" + "��������:" + ex.getMessage();
		try {
			//MIMEMessage��ü ����
			MimeMessage message = mailSender.createMimeMessage();
			//message�ȿ� ���� �־�� �ϴµ� vo���� Ŭ���� ��ü�� ����
			//���� �־��ֵ��� ����.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			messageHelper.setFrom("krdut1@gmail.com");
			messageHelper.setTo("samdori96@nate.com");
			messageHelper.setSubject(signature.getName() + "�޼��� ȣ��� ������ ���� �߻�.");
			messageHelper.setText("���� �߻�!"+ body);
			mailSender.send(message);	
			System.out.println("������ ���½��ϴ�=========");
		} catch (Exception e) {
			System.out.println("���� ������ �� ���� �߻�.>>" + e);
		}
		
	}
	
	
	public void mailSend(HttpServletRequest request) {
		System.out.println(request.getParameter("tomail"));
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("content"));
		//System.out.println(mailSender);
		
		try {
			//MIMEMessage��ü ����
			MimeMessage message = mailSender.createMimeMessage();
			//message�ȿ� ���� �־�� �ϴµ� vo���� Ŭ���� ��ü�� ����
			//���� �־��ֵ��� ����.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
			messageHelper.setFrom("krdut1@gmail.com");
			messageHelper.setTo(request.getParameter("tomail"));
			messageHelper.setSubject(request.getParameter("title"));
			messageHelper.setText(request.getParameter("content"));
			mailSender.send(message);	
			System.out.println("������ ���½��ϴ�=========");
		} catch (Exception e) {
			System.out.println("���� ������ �� ���� �߻�.>>" + e);
		}
		
	}
	
}
