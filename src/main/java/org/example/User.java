package org.example;

public class User {

    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {

        //RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String generatePassword = passwordGenerator.generatePassword();

        if(generatePassword.length() >= 8 || generatePassword.length() < 12) {
            this.password = generatePassword;
        }
    }


    public String getPassword() {
        return password;
    }
}
