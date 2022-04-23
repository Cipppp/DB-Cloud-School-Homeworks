package com.example.unittestinghomework.unit;


import com.example.unittestinghomework.model.User;
import com.example.unittestinghomework.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void whenCreateUser_ThenCheckNotNull() {
        User newUser = new User();
        Assertions.assertNotNull(newUser);
    }

    @Test
    public void giveEmptyList_WhenAddUsers_ThenUserListSizeMustBeThree() {
        User firstUser = new User();
        User secondUser = new User();
        User thirdUser = new User();

        userService.insertUser(firstUser);
        userService.insertUser(secondUser);
        userService.insertUser(thirdUser);

        Assertions.assertEquals(3, userService.getAllUsers().size());

        // TODO: operations with userService
    }
}
