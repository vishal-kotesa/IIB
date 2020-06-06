package sample.example.model;

public class WellsCustomerInput {	
	private String legalType;
	private String legalName;
	private String dbaName;
	private Integer icisClientId;
	public Integer getIcisClientId() {
		return icisClientId;
	}
	public void setIcisClientId(Integer icisClientId) {
		this.icisClientId = icisClientId;
	}
	public String getLegalName() {
		return legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}
	public String getLegalType() {
		return legalType;
	}
	public void setLegalType(String legalType) {
		this.legalType = legalType;
	}
	public String getDbaName() {
		return dbaName;
	}
	public void setDbaName(String dbaName) {
		this.dbaName = dbaName;
	}
	
	
}
