package max;

import java.io.IOException;
import java.util.List;

import location.DistBean;
import location.LocationDAO;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DistController {
	@Autowired
	LocationDAO locationDAO;
@RequestMapping(value="dist",method=RequestMethod.GET)
	public @ResponseBody String getDistList(@RequestParam("stCode") String stCode) throws JsonGenerationException, JsonMappingException, IOException
	{
	System.out.println("stcode "+stCode);
	   List<DistBean> list = locationDAO.getDistList(stCode);
	   ObjectMapper m = new ObjectMapper();
	  String jstring = m.writeValueAsString(list);
	  System.out.println("jstring "+jstring);
	  return jstring;
	}
}
