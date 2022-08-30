package com.whitecape.services;

import com.whitecape.reposities.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImp implements UsersService{
    private final UsersRepository usersRepository;
    @Override
    public void deleteUser(long userId) {
      usersRepository.deleteById(userId);
    }
}
