package org.example;

public class FixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "abcedfgh";
    }
}
