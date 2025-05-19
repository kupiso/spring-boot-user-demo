package com.example.demo.service;

import com.example.demo.repo.FakeRepoInterface;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final FakeRepoInterface fakeRepo;


    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public String addUser(String name, String surname) {
        return fakeRepo.insertUser(1, name, surname);
    }

    @Override
    public String removeUser(long id) {
        return fakeRepo.deleteUser(id);
    }

    @Override
    public String getUser(long id) {
        return fakeRepo.findUserById(id);
    }

}
