package com.zhimingo.hipay.rbac.service.impl;

import com.zhimingo.hipay.rbac.dto.form.CreateUserForm;
import com.zhimingo.hipay.rbac.entity.User;
import com.zhimingo.hipay.rbac.repository.UserRepository;
import com.zhimingo.hipay.rbac.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Long createUser(CreateUserForm form) {
        return null;
    }

    @Override
    public Long createInActiveUser(CreateUserForm form) {
        return null;
    }

    @Override
    public User getUserDetails(Long userId) {
        return null;
    }

    @Override
    public void activeUser(Long userId) {

    }

    @Override
    public void lockUser(Long userId) {

    }

    @Override
    public void unlockUser(Long userId) {

    }

    @Override
    public void deleteUser(Long userId) {

    }
}
