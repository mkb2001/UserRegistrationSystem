package org.mkbservices;

import java.util.List;

public interface UserService {
    String getUserByUserName(String username);
    String deleteUserByUserName(String username);
    List<UserModel> getAlUsers();
    void exitSystem();


    String addUser(String ln, String fn, String dob, String username);

    String updateUser();

}
