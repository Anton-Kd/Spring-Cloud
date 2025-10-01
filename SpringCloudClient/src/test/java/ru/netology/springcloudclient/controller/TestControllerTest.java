package ru.netology.springcloudclient.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("dev")
class TestControllerTest {
    @Autowired
    private TestController testController;

    @Test
    public void TestMassageDev() {
        String message = testController.get();
        assertEquals("Now version is development", message);
    }
}