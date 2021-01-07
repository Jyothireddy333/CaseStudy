package com.hcl.airport.repository;

 

//import java.util.List;

import javax.validation.Valid;

//import org.springframework.stereotype.Repository;

import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;
/*import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Manager;
import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;*/
import com.hcl.airport.model.User;
import com.hcl.airport.model.UserCredential;


public interface UserDao {
       
	boolean registerUser(@Valid User user);
	
	
	
	boolean loginUser(@Valid UserCredential userCredential);



	boolean addHangers(@Valid Hanger hanger);



	boolean addPilots(@Valid Pilot pilot);



	boolean addPlanes(@Valid Plane plane);

	

    }