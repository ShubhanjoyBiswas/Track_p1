package com.axisbank.track_micro.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Analysis {
int id;
int customerIdWhoBought;
int productIdWhichHeBought;
public Analysis(int id, int customerIdWhoBought, int productIdWhichHeBought) {

	this.id = id;
	this.customerIdWhoBought = customerIdWhoBought;
	this.productIdWhichHeBought = productIdWhichHeBought;
}
public Analysis() {

}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCustomerIdWhoBought() {
	return customerIdWhoBought;
}
public void setCustomerIdWhoBought(int customerIdWhoBought) {
	this.customerIdWhoBought = customerIdWhoBought;
}
public int getProductIdWhichHeBought() {
	return productIdWhichHeBought;
}
public void setProductIdWhichHeBought(int productIdWhichHeBought) {
	this.productIdWhichHeBought = productIdWhichHeBought;
}
@Override
public String toString() {
	return "Analysis [id=" + id + ", customerIdWhoBought=" + customerIdWhoBought + ", productIdWhichHeBought="
			+ productIdWhichHeBought + "]";
}

}
