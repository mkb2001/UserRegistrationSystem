package org.mkbservices;

import java.util.Iterator;
import java.util.List;

public class UserServiceImplementation implements UserService{
    private final UserModel model;
    public UserServiceImplementation(UserModel model1) {
        this.model = model1;
    }

    @Override
    public String getUserByUserName(String username) {
        UserModel user;
        for (UserModel u: model.users)
            if (u.getUsername().equalsIgnoreCase(username))
                return new UserModel().toString();

        return "Not Found";
    }

    @Override
    public String deleteUserByUserName(String username) {
        Iterator<UserModel> iter = model.users.iterator();

        while (iter.hasNext())
        {
            UserModel u = iter.next();
            if (u.getUsername().equalsIgnoreCase("username"))
            {
                iter.remove();
                return ("User with " + username + "removed");
            }
        }
        return "Not Found";
    }

    @Override
    public List<UserModel> getAlUsers() {
        return model.users;
    }

    @Override
    public void exitSystem() {
        System.exit(0);
    }

    @Override
    public String addUser(String ln, String fn, String dob, String username) {
        UserModel.addUser(ln, fn, dob, username);
        return "add";
    }

    @Override
    public String updateUser() {
        return "";
    }
}
