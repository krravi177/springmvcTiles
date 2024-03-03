package max;

import java.util.List;

import location.LocationDAO;
import location.StateBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegController {
	@Autowired
	RegBean regBean;
	@Autowired
	LocationDAO locationDAO;
@RequestMapping(value="registration", method=RequestMethod.GET)
	public ModelAndView regJSP()
	{
	  
	       
		return new ModelAndView("regist","r",regBean);
		
	}

@RequestMapping(value="regSave", method=RequestMethod.POST)
public ModelAndView regSave(@ModelAttribute("r")RegBean regBean)
{
	int i = locationDAO.saveReg(regBean);
	if(i>0)
	return new ModelAndView("S");
	else
	return new ModelAndView("E");
	
}
@ModelAttribute("modi")
public  List<StateBean> getState()
{
	 List<StateBean> list = locationDAO.getStateList();
	 return list;
}

}
