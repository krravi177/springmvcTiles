package max;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regg1")
public class RegBean {
	@Id
	@GeneratedValue
	int rid;
	
private String stCode;
private String distCode;
private String name;
private String phone;


public int getRid() {
	return rid;
}
public void setRid(int rid) {
	this.rid = rid;
}
public String getStCode() {
	return stCode;
}
public void setStCode(String stCode) {
	this.stCode = stCode;
}
public String getDistCode() {
	return distCode;
}
public void setDistCode(String distCode) {
	this.distCode = distCode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}


}
