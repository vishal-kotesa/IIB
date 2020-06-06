package sample.example.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUST_ID", updatable = true)
	private Integer custId;

	@Column(name = "CUST_NAME", updatable = true)
	private String custName;
	
	@Column(name = "CUST_AGE")
	private Integer custAge;
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "CUST_ID")
	 */
	/*
	 * @ManyToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "Customer_Identity", joinColumns = @JoinColumn(name =
	 * "custId", referencedColumnName = "CUST_ID"), inverseJoinColumns
	 * = @JoinColumn(name = "addressId", referencedColumnName = "ADDRESS_ID"))
	 * private List<Address> addressList;
	 * 
	 * public List<Address> getAddressList() { return addressList; }
	 * 
	 * public void setAddressList(List<Address> addressList) { this.addressList =
	 * addressList; }
	 */

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getCustAge() {
		return custAge;
	}

	public void setCustAge(Integer custAge) {
		this.custAge = custAge;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + "]";
	}

	
}
