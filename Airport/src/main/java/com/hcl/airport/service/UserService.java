 package com.hcl.airport.service;

 

import java.util.List;

import javax.validation.Valid;

import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;
/*import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Manager;
import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;*/
import com.hcl.airport.model.User;
import com.hcl.airport.model.UserCredential;


public interface UserService {
    boolean registerUser(@Valid User user);
	
	boolean loginUser(@Valid UserCredential userCredential);

	boolean addPlanes(@Valid Plane plane);

	boolean addPilots(@Valid Pilot pilot);

	boolean addHangers(@Valid Hanger hanger);
	
	
    }