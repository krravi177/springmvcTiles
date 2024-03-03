package location;

import java.io.Serializable;
import java.util.List;

import max.RegBean;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LocationDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public List<StateBean> getStateList()
	{
		Session s = sessionFactory.openSession();
		 Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(StateBean.class);
		 cr.addOrder(Order.asc("stName"));
		
		List<StateBean> list= cr.list();
		 tx.commit();
		return list;
	}
	
	public int saveReg(RegBean regBean)
	{
		Session s = sessionFactory.openSession();
		 Transaction tx = s.beginTransaction();
		 Integer i =(Integer) s.save(regBean);
		 tx.commit();
		 return i;
	}
	
	public List<DistBean> getDistList(String stCode)
	{
		Session s = sessionFactory.openSession();
		 Transaction tx = s.beginTransaction();
		Criteria cr = s.createCriteria(DistBean.class);
		cr.add(Restrictions.eq("stCode", stCode.length()==1?"0"+stCode:stCode));
		 cr.addOrder(Order.asc("distName"));
		
		List<DistBean> list= cr.list();
		 tx.commit();
		return list;
	}

}
