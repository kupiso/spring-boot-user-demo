package com.example.spring_boot_user_demo;

import com.example.demo.repo.FakeRepoInterface;
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

class UserServiceTests {

    @Mock
    private FakeRepoInterface fakeRepo;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddUser() {
        // Set up mock to return the expected string from the repository
        when(fakeRepo.insertUser(anyLong(), eq("Yanga"), eq("Mokhoro")))
            .thenReturn("Yanga added");

        String result = userService.addUser("Yanga", "Mokhoro");

        // Verify the result matches what the service would return
        assertEquals("Yanga added", result);
        verify(fakeRepo, times(1)).insertUser(anyLong(), eq("Yanga"), eq("Mokhoro"));
    }

    @Test
    void testRemoveUser() {
        // Set up mock to return the expected string from the repository
        when(fakeRepo.deleteUser(1L)).thenReturn("Yanga removed");

        String result = userService.removeUser(1);
        assertEquals("Yanga removed", result);
        verify(fakeRepo, times(1)).deleteUser(1L);
    }

    @Test
    void testGetUser() {
        // Set up mock to return the expected string from the repository
        when(fakeRepo.findUserById(1L)).thenReturn("Yanga Mokhoro");

        String result = userService.getUser(1);
        assertEquals("Yanga Mokhoro", result);
        verify(fakeRepo, times(1)).findUserById(1L);
    }
}