package com.home;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
        MyQueque users = new MyQueque(5);
        users.offerUser("Nastya");
        users.peekUser("Nastya");
        users.pollUser();
        users.userElement();
    }
}