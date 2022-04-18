package svalyavakilia.projects.vacationplanningapp.model;

import java.util.HashMap;
import java.util.Map;

public class User {
    private static int nextUserId = 0;
    private static final Map<Integer, User> USERS = new HashMap<>();

    private String login;
    private String email;
    private String hashedPassword;
    private String refreshToken;

    {
        USERS.put((nextUserId)++, this);
    }

    public User(final String login,
                final String email,
                final String hashedPassword) {
        this.login = login;
        this.email = email;
        this.hashedPassword = hashedPassword;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setHashedPassword(final String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getHashedPassword() {
        return this.hashedPassword;
    }

    public void setRefreshToken(final String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }
}