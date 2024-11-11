package com.amalvadkar.jia.challenges;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetUserTest {

    @Test
    void greetPage() {
        assertThat(GreetUser.greetPage("Abhi"))
                .isEqualTo(
                        """
                                <html>
                                 <head><title>Welcome</title></head>
                                 <body>
                                 <h1>Hello, Abhi!</h1>
                                 <hr>
                                 <p>Welcome to our web-site</p>
                                 </body>
                                </html>
                                """
                );
    }
}