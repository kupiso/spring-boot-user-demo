package com.example.demo.repo;

public interface FakeRepoInterface {
    String insertUser(long id, String name, String surname);
    String deleteUser(long id);
    String findUserById(long id);

}
