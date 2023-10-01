package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @DisplayName("패스워드 초기화한다.")
    @Test
    void passwordTEst() {
        User user = new User();

        //user.initPassword(new RandomPasswordGenerator());
        user.initPassword(new FixedPasswordGenerator());

        assertThat(user.getPassword())
                .isNotNull();
    }
}
