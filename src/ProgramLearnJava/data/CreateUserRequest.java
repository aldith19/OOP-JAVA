package ProgramLearnJava.data;

import ProgramLearnJava.annotation.NotBlank;

public class CreateUserRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    @NotBlank
    private String name;

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
