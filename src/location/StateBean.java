package location;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mst_state")
public class StateBean {
	@Id
	@Column(name="state_code")
private  int stCode;
	@Column(name="state_name")
String stName;
	@Column(name="state_short_name")
String shortName;
public int getStCode() {
	return stCode;
}
public void setStCode(int stCode) {
	this.stCode = stCode;
}
public String getStName() {
	return stName;
}
public void setStName(String stName) {
	this.stName = stName;
}
public String getShortName() {
	return shortName;
}
public void setShortName(String shortName) {
	this.shortName = shortName;
}

}
