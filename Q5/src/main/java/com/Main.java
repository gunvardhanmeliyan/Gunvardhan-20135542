package com;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Customer e=new Customer();
		
		System.out.println("Enter customer id: ");
		int id=sc.nextInt();
		e.setCid(id);
		
		System.out.println("Enter customer name: ");
		String name=sc.next();
		e.setCname(name);
		
		System.out.println("Enter customer place: ");
		String place=sc.next();
		e.setPlace(place);
		
		System.out.println("Enter customer pan number: ");
		String pan=sc.next();
		e.setPan(pan);
		
		session.save(e);
		tx.commit();
		System.out.println("data inserted successfully...!!");

	}

}
