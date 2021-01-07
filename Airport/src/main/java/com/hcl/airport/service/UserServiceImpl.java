package com.hcl.airport.service;

 
import org.hibernate.SessionFactory;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;
/*import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Manager;
import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;*/
import com.hcl.airport.model.User;
import com.hcl.airport.model.UserCredential;
import com.hcl.airport.repository.UserDao;

 
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;
   
	@Override
	public boolean registerUser(@Valid User user) {
		// TODO Auto-generated method stub
		 if(userDao.registerUser(user)) {
	        	return true;
	        }
		return false;
	}


	

	@Override
	public boolean loginUser( UserCredential userCredential) {
		if(userDao.loginUser(userCredential)) {
        	return true;
        }
		return false;
	}




	@Override
	public boolean addPlanes(@Valid Plane plane) {
		// TODO Auto-generated method stub
		if(userDao.addPlanes(plane)) {
        	return true;
        }
		return false;
	}




	@Override
	public boolean addPilots(@Valid Pilot pilot) {
		// TODO Auto-generated method stub
		if(userDao.addPilots(pilot)) {
        	return true;
        }
		return false;
	}




	@Override
	public boolean addHangers(@Valid Hanger hanger) {
		// TODO Auto-generated method stub
		if(userDao.addHangers(hanger)) {
        	return true;
        }
		return false;
	}

	
    

 

}