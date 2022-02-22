package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotBlank(message = "Username is required")
    @Size( min = 5, max = 15, message = "Name must be between 5 and 15 characters")
    private String username;

    @Email(message = "Invalid email. Try again.")
    private String email;

    @NotBlank(message = "Password is required")
    @Min(value = 6, message = "Password is must be at least 6 characters" )
    private String password;

    @NotBlank(message = "Verify Password")
    @NotNull(message = "Passwords do not match")
    private String verify;

    public User() {

    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
        checkPassword();
    }

    private void checkPassword() {
        if (password != null && verify != null && !password.equals(verify)) {
            verify = null;
        }
    }
}
