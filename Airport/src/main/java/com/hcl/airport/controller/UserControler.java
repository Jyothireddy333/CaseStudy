package com.hcl.airport.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Manager;*/
import com.hcl.airport.model.UserCredential;
import com.hcl.airport.model.Hanger;
import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;
/*import com.hcl.airport.model.Pilot;
import com.hcl.airport.model.Plane;*/
import com.hcl.airport.model.User;
import com.hcl.airport.service.UserService;


@Controller
@RequestMapping("/user")
public class UserControler {
	@Autowired
	UserService userService;

	@RequestMapping("/homepage")
	public ModelAndView addHome() {
		return new ModelAndView("homepage");

	}

	/**
	 * @return ModelAndView
	 */
	@RequestMapping("/userRegistration")
	public ModelAndView addAdminRegister() {
		return new ModelAndView("userRegistration", "user", new User());

	}

	/**
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/userRegistration", method = RequestMethod.POST)
	public ModelAndView addAdmin(@ModelAttribute("user") @Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("userRegistration");
		} else {
			
			if (userService.registerUser(user))
				return new ModelAndView("registerSuccess");
			else
				return new ModelAndView("registerFailed");
		}
	}

	/**
	 * @return ModelAndView
	 */
	@RequestMapping("/userLogin")
	public ModelAndView addUserLogin() {
		return new ModelAndView("userLogin", "userCredential", new UserCredential());

	}

	/**
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("userCredential") @Valid UserCredential userCredential,
			BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("userLogin");
		} else {
			if (userService.loginUser(userCredential))
				return new ModelAndView("adminPage");
			else
				return new ModelAndView("loginFailed");
		}
	}

	

	/**
	 * @return ModelAndView
	 */
	@RequestMapping("/adminPage")
	public ModelAndView addadminPage() {
		return new ModelAndView("adminPage");

	}
	/**
	 * @return ModelAndView
	 */
	@RequestMapping("/addPlanes")
	public ModelAndView addPlanes() {
		return new ModelAndView("addPlanes", "plane", new Plane());

	}

	/**
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/addPlanes", method = RequestMethod.POST)
	public ModelAndView addAdminPlanes(@ModelAttribute("plane") @Valid Plane plane, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("addPlanes");
		} else {
			
			if (userService.addPlanes(plane))
				return new ModelAndView("success");
			else
				return new ModelAndView("failed");
		}
	}
	@RequestMapping("/addPilots")
	public ModelAndView addPilots() {
		return new ModelAndView("addPilots", "pilot", new Pilot());

	}

	/**
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/addPilots", method = RequestMethod.POST)
	public ModelAndView addAdminPilots(@ModelAttribute("pilot") @Valid Pilot pilot, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("addPilots");
		} else {
			
			if (userService.addPilots(pilot))
				return new ModelAndView("succes");
			else
				return new ModelAndView("failed");
		}
	}
	@RequestMapping("/addHangers")
	public ModelAndView addHangers() {
		return new ModelAndView("addHangers", "hanger", new Hanger());

	}

	/**
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/addHangers", method = RequestMethod.POST)
	public ModelAndView addAdminHangers(@ModelAttribute("hanger") @Valid Hanger hanger, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("addPilots");
		} else {
			
			if (userService.addHangers(hanger))
				return new ModelAndView("success");
			else
				return new ModelAndView("failed");
		}
	}

}
