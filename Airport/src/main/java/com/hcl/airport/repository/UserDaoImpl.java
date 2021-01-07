package com.hcl.airport.repository;

import org.hibernate.query.Query;
import java.sql.Connection;
import java.sql.DriverManager;
/*import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;*/
import java.util.List;
//import java.util.Scanner;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.sql.Insert;
import org.springframework.stereotype.Repository;

import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;
/*import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Manager;
import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;*/
import com.hcl.airport.model.User;
import com.hcl.airport.model.UserCredential;
import com.hcl.airport.util.HibernateUtil;

@Repository
public class UserDaoImpl implements UserDao {

	/*static Connection conn = null;
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");
		} catch (Exception e) {
			System.out.println("Error occured during connection creation " + e.getMessage());
		}
	}*/

	@Override
	public boolean registerUser(@Valid User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		int i = (Integer) session.save(user);
		session.getTransaction().commit();
		HibernateUtil.shutdown();

		if (i == 0) {
			return true;
		}
		return false;
	}

	

	@Override
	public boolean loginUser(@Valid UserCredential userCredential) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		boolean userFound = false;
		String SQL_QUERY = " from User as a where a.userId=?0 and a.password=?1";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0, userCredential.getUserId());
		query.setParameter(1, userCredential.getPassword());
		List list = ((org.hibernate.query.Query) query).list();

		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}

		// session.close();
		session.getTransaction().commit();
		HibernateUtil.shutdown();
		return userFound;
		// return false;
	}



	@Override
	public boolean addHangers(@Valid Hanger hanger) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		int i = (Integer) session.save(hanger);
		session.getTransaction().commit();
		HibernateUtil.shutdown();

		if (i == 0) {
			return true;
		}
		return false;
		
	}



	@Override
	public boolean addPilots(@Valid Pilot pilot) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		int i = (Integer) session.save(pilot);
		session.getTransaction().commit();
		HibernateUtil.shutdown();

		if (i == 0) {
			return true;
		}
		return false;
	}



	@Override
	public boolean addPlanes(@Valid Plane plane) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		int i = (Integer) session.save(plane);
		session.getTransaction().commit();
		HibernateUtil.shutdown();

		if (i == 0) {
			return true;
		}
		return false;
	}


}