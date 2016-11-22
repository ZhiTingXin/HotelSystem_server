package PO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "systemanager")
public class SystemManagerPO {
	@Id
	private String managerID;
	private String managerName;
	
	
	public SystemManagerPO(String managerID, String managerName){
		this.managerID = managerID;
		this.managerName = managerName;
	}
	
	
	public String getId() {
		return managerID;
	}

	public void setId(String managerID) {
		this.managerID = managerID;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	
}
