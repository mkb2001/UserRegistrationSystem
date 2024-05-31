package org.mkbservices;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// this is the implementation of the service class
public class UserServiceImplementation implements UserService {
    private final UserModel model;

    public UserServiceImplementation(UserModel model1) {
        this.model = model1;
    }

    // this is the implementation of the methods in the interface
    @Override
    public String getUserByUserName(String username) {
        UserModel user;
        for (UserModel u : model.users)
            if (u.getUsername().equalsIgnoreCase(username)) return new UserModel().toString();

        return "Not Found";
    }

    // this is the implementation of delete user by username function
    @Override
    public String deleteUserByUserName(String username) {
        Iterator<UserModel> iter = model.users.iterator();

        while (iter.hasNext()) {
            UserModel u = iter.next();
            if (u.getUsername().equalsIgnoreCase("username")) {
                iter.remove();
                return ("User with " + username + "removed");
            }
        }
        return "Not Found";
    }

    // this is the implementation of get all users function
    @Override
    public List<UserModel> getAlUsers() {
        return model.users;
    }

    // this is the implementation of exit system function
    @Override
    public void exitSystem() {
        System.exit(0);
    }

    // this is the implementation of add user function
    @Override
    public String addUser(String ln, String fn, String dob, String username) {
        UserModel.addUser(ln, fn, dob, username);
        return "add";
    }

    // this is the implementation of update user function
    @Override
    public String updateUser() {
        return "";
    }
}
