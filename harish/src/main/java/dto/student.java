package dto;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class student 
{
@Id
@GeneratedValue(strategy=GenerationType.TABLE)
int id;
String name;
String gender;
long mobile;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
}
