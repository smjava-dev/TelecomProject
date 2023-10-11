package com.telecom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DataBooster")
public class DataBooster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String mobileNumber;
	private String operator;
	private String totalAmount;
	private String totalData;
	private String dataSpeed;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalData() {
		return totalData;
	}
	public void setTotalData(String totalData) {
		this.totalData = totalData;
	}
	public String getDataSpeed() {
		return dataSpeed;
	}
	public void setDataSpeed(String dataSpeed) {
		this.dataSpeed = dataSpeed;
	}
	@Override
	public String toString() {
		return "DataBooster [id=" + id + ", mobileNumber=" + mobileNumber + ", operator=" + operator + ", totalAmount="
				+ totalAmount + ", totalData=" + totalData + ", dataSpeed=" + dataSpeed + "]";
	}
	
	
}
