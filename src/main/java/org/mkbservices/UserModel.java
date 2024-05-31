package org.mkbservices;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

//this is the model class
public class UserModel {
    // these are the fields
    private String firstName;
    private String lastName;
    private String DOB;
    private String username;
    private Integer age;
    public static List<UserModel> users = new ArrayList<>();

    // this is the constructor
    public UserModel(String firstName, String lastName, String DOB, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime localDateTime = LocalDateTime.parse(this.DOB, formatter);
        int year = localDateTime.getYear();
        this.age = LocalDateTime.now().getYear() - year;
    }

    // this is the method that will add the user to the list
    public static void addUser(String firstName, String lastName, String DOB, String username) {
        UserModel user = new UserModel(firstName, lastName, DOB, username);
        users.add(user);
    }

    @Override
    public java.lang.String toString() {
        return "UserModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(firstName, userModel.firstName) && Objects.equals(lastName, userModel.lastName) && Objects.equals(DOB, userModel.DOB) && Objects.equals(username, userModel.username) && Objects.equals(age, userModel.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, DOB, username, age);
    }
}
