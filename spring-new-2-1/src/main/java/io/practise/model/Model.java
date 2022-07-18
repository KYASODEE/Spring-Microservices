package io.practise.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Details")
public class Model {
	
	@Id
	private String orderId;
	private String itemNo;
	private String name;
	
	
	public Model() {}


	public Model(String orderId, String itemNo, String name) {
		super();
		this.orderId = orderId;
		this.itemNo = itemNo;
		this.name = name;
	}


	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public String getItemNo() {
		return itemNo;
	}


	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}