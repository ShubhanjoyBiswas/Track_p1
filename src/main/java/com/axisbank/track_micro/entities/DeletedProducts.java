package com.axisbank.track_micro.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DeletedProducts {
String id;//productId-merchantId
Product deletedProduct;
public DeletedProducts(String id, Product deletedProduct) {

	this.id = id;
	this.deletedProduct = deletedProduct;
}
public DeletedProducts() {

}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Product getDeletedProduct() {
	return deletedProduct;
}
public void setDeletedProduct(Product deletedProduct) {
	this.deletedProduct = deletedProduct;
}
@Override
public String toString() {
	return "DeletedProducts [id=" + id + ", deletedProduct=" + deletedProduct + "]";
}

}
