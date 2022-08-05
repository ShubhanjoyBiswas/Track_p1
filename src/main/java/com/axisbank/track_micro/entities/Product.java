package com.axisbank.track_micro.entities;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

int id;
String name;
String imageLink;
int price;
String description;
String colour;
String category;
int uploadedBy;
int nos;
public Product(int id, String name, String imageLink, int price, String description, String colour, String category,
		int uploadedBy, int nos) {
	
	this.id = id;
	this.name = name;
	this.imageLink = imageLink;
	this.price = price;
	this.description = description;
	this.colour = colour;
	this.category = category;
	this.uploadedBy = uploadedBy;
	this.nos = nos;
}
public Product() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getImageLink() {
	return imageLink;
}
public void setImageLink(String imageLink) {
	this.imageLink = imageLink;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getUploadedBy() {
	return uploadedBy;
}
public void setUploadedBy(int uploadedBy) {
	this.uploadedBy = uploadedBy;
}
public int getNos() {
	return nos;
}
public void setNos(int nos) {
	this.nos = nos;
}
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return id == other.id;
}
}
