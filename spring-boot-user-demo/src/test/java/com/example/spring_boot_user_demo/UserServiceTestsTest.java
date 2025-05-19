package com.example.spring_boot_user_demo;

import com.example.demo.repo.FakeRepoClass;
import com.example.demo.service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class UserServiceTestsTest {

	@Mock
	private FakeRepoClass fakeRepo;

	@InjectMocks
	private UserServiceImpl userService;

	@BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

	@Test
    void testAddUser() {
        when(fakeRepo.insertUser(anyLong(), eq("Yanga"), eq("Mokhoro")))
            .thenReturn("Yanga added");
        assertEquals("Yanga added", userService.addUser("Yanga", "Mokhoro")); // Updated assertion
    }

    @Test
    void testRemoveUser() {
        when(fakeRepo.deleteUser(1L)).thenReturn("Yanga");
        assertEquals("Yanga", userService.removeUser(1)); // Updated assertion
    }

    @Test
    void testGetUser() {
        when(fakeRepo.findUserById(1L)).thenReturn("Yanga Mokhoro");
        assertEquals("Yanga Mokhoro", userService.getUser(1)); // Updated assertion
    }
}