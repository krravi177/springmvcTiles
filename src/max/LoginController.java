package max;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	LoginBean loginBean;
	
	@RequestMapping(value="logn", method=RequestMethod.GET)
	public ModelAndView login()
	{
		return new ModelAndView("login","log",loginBean);
	}
	
	@RequestMapping(value="verifyLogin", method=RequestMethod.POST)
	public String verifyLogin(@ModelAttribute("log")LoginBean loginBean,HttpServletRequest req)
	{
		String uid = loginBean.getUid();
		String pass = loginBean.getPass();
		if(uid.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin"))
		{
			HttpSession s = req.getSession();
			 s.setAttribute("admin", uid.toUpperCase());
			return "admin";
		}
		else
		{
			HttpSession s = req.getSession();
			 s.setAttribute("user", uid.toUpperCase());
			return "user";
		}
		
	}
}
