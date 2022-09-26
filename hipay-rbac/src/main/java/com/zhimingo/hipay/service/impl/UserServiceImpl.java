package com.zhimingo.hipay.service.impl;

import com.zhimingo.hipay.dto.CreateUserForm;
import com.zhimingo.hipay.dto.SimpleUserVO;
import com.zhimingo.hipay.dto.UpdateUserForm;
import com.zhimingo.hipay.repository.UserRepository;
import com.zhimingo.hipay.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Long create(CreateUserForm form) {
        return null;
    }

    @Override
    public void modify(UpdateUserForm form) {

    }

    @Override
    public void delete(Long userId) {

    }

    @Override
    public Page<SimpleUserVO> fetchUsers() {
        return null;
    }

    @Override
    public SimpleUserVO fetchUserById(Long userId) {
        return null;
    }
}
