package ru.javarush.java.core.level25.task10;

public class UserAccessService {
    protected final String validUser = "agent007";
    protected final String validPassword = "secret";

    public void authenticateUser(String username, String password) throws AuthenticationFailedException {
        if (!validUser.equals(username) || !validPassword.equals(password)) {
            throw new AuthenticationFailedException("неудачная попытка входа для пользователя '" + username + "'");
        }
    }
}
