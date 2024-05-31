package org.mkbservices.models;

import java.util.Date;
import java.util.Objects;

//this is the model class
public class UserModel {
    // these are the fields
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String username;
    private Integer age;

    // this is the constructor
    public UserModel(String firstName, String lastName, Date dateOfBirth, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
    }

    // this is the default constructor
    public UserModel() {

    }

    // these are the getters and setters
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    // this is the setter for the age
    public void setAge(Integer age) {
            this.age = age;
    }

    @Override
    public java.lang.String toString() {
        return "UserModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(firstName, userModel.firstName) && Objects.equals(lastName, userModel.lastName) && Objects.equals(dateOfBirth, userModel.dateOfBirth) && Objects.equals(username, userModel.username) && Objects.equals(age, userModel.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, username, age);
    }
}
