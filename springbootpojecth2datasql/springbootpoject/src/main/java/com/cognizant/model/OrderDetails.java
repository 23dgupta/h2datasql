package com.cognizant.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    private String customerName;
    private String orderName;
    private Double price;
    private String band;
    
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetails(Integer orderId, String customerName, String orderName, Double price, String band) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderName = orderName;
		this.price = price;
		this.band = band;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", customerName=" + customerName + ", orderName=" + orderName
				+ ", price=" + price + ", band=" + band + "]";
	}
    
}
