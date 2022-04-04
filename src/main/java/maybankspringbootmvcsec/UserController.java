package maybankspringbootmvcsec;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//	@RequestMapping("/")
//	public ModelAndView defaultHome() {
//		return new ModelAndView("user/home");
//	}
//
//	@RequestMapping("/login")
//	@ResponseBody
//	public ModelAndView login() {
//		return new ModelAndView("user/login");
//	}
//}

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class UserController {

	@RequestMapping("/")
	public ModelAndView defaultHome() {
		return new ModelAndView("login");
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("user/login");
	}

	@RequestMapping("/dashboard")
	public ModelAndView userDashboard() {
		return new ModelAndView("user/home");
	}

	@RequestMapping("/accessdenied")
	public ModelAndView userAccessError() {
		return new ModelAndView("accessdenied");
	}
	
	@RequestMapping("/admin/")
	public ModelAndView admin() {
		return new ModelAndView("admin/login");
	}

	@RequestMapping("/admin/login")
	public ModelAndView adminlogin() {
		return new ModelAndView("admin/login");
	}

	@RequestMapping("/admin/dashboard")
	public ModelAndView admindashboard() {
		return new ModelAndView("admin/home");
	}

	@RequestMapping("/admin/accessdenied")
	public ModelAndView adminAccessError() {
		return new ModelAndView("admin/accessdenied");
	}
}