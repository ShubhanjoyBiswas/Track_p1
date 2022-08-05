package com.axisbank.track_micro.entities;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Track {
@Id
int id;
ArrayList<Integer> arr;
public Track(int id, ArrayList<Integer> arr) {

	this.id = id;
	this.arr = arr;
}
public Track() {

}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public ArrayList<Integer> getArr() {
	return arr;
}
public void setArr(ArrayList<Integer> arr) {
	this.arr = arr;
}
@Override
public String toString() {
	return "Track [id=" + id + ", arr=" + arr + "]";
}
}
