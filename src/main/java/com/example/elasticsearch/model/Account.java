package com.example.elasticsearch.model;

import java.math.BigDecimal;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "bank", createIndex = false)
public class Account {

  @Id
  @Field(type = FieldType.Long, name = "account_number")
  private Long accountNumber;

  @Field(type = FieldType.Auto, name = "balance")
  private BigDecimal balance;

  @Field(type = FieldType.Text, name = "firstname")
  private String firstName;

  @Field(type = FieldType.Text, name = "lastname")
  private String lastName;

  @Field(type = FieldType.Short, name = "age")
  private Short age;

  @Field(type = FieldType.Text, name = "gender")
  private String gender;

  @Field(type = FieldType.Text, name = "address")
  private String address;

  @Field(type = FieldType.Text, name = "employer")
  private String employer;

  @Field(type = FieldType.Text, name = "email")
  private String email;

  @Field(type = FieldType.Text, name = "city")
  private String city;

  @Field(type = FieldType.Text, name = "state")
  private String state;

  public Long getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Short getAge() {
    return age;
  }

  public void setAge(Short age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmployer() {
    return employer;
  }

  public void setEmployer(String employer) {
    this.employer = employer;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
