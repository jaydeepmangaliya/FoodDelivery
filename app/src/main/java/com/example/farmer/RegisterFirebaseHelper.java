package com.example.farmer;

public class RegisterFirebaseHelper {


    private  String Username , password,email;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RegisterFirebaseHelper(String username, String password, String email) {
        Username = username;
        this.password = password;
        this.email = email;
    }

    public RegisterFirebaseHelper() {
    }
}
