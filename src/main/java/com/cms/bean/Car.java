package com.cms.bean;

public class Car {

	private String CarNo;
	private String Manufacture;
	private String Model;
	private int KmsRun;
	private int PriceExpected;
	private int NoOfOwners;
	

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(String carNo, String manufacture, String model, int kmsRun, int priceExpected, int noOfOwners) {
		super();
		CarNo = carNo;
		Manufacture = manufacture;
		Model = model;
		KmsRun = kmsRun;
		PriceExpected = priceExpected;
		NoOfOwners = noOfOwners;
	}


	public String getCarNo() {
		return CarNo;
	}
	public void setCarNo(String carNo) {
		CarNo = carNo;
	}
	public String getManufacture() {
		return Manufacture;
	}
	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getKmsRun() {
		return KmsRun;
	}
	public void setKmsRun(int kmsRun) {
		KmsRun = kmsRun;
	}
	public int getPriceExpected() {
		return PriceExpected;
	}
	public void setPriceExpected(int priceExpected) {
		PriceExpected = priceExpected;
	}
	public int getNoOfOwners() {
		return NoOfOwners;
	}
	public void setNoOfOwners(int noOfOwners) {
		NoOfOwners = noOfOwners;
	}
	@Override
	public String toString() {
		return "Car [CarNo=" + CarNo + ", Manufacture=" + Manufacture + ", Model=" + Model + ", KmsRun=" + KmsRun
				+ ", PriceExpected=" + PriceExpected + ", NoOfOwners=" + NoOfOwners + "]";
	}
	
	
	
}


