package com.zhimingo.hipay.rbac.service;

import com.zhimingo.hipay.rbac.dto.form.CreateUserForm;
import com.zhimingo.hipay.rbac.entity.User;

/**
 * 用户信息相关服务
 */
public interface UserService {

    /**
     * 创建用户
     * @return 用户id
     */
    Long createUser(CreateUserForm form);

    /**
     * 创建一个等待激活的用户
     * @return 用户id
     */
    Long createInActiveUser(CreateUserForm form);

    /**
     * 根据用户ID查询用户信息
     * @param userId 用户ID
     * @return 用户详细信息
     */
    User getUserDetails(Long userId);

    /**
     * 激活用户
     */
    void activeUser(Long userId);

    /**
     * 锁定用户
     * @param userId 用户ID
     */
    void lockUser(Long userId);

    /**
     * 解锁用户
     * @param userId 用户ID
     */
    void unlockUser(Long userId);

    /**
     * 用户注销
     * @param userId 用户ID
     */
    void deleteUser(Long userId);
}
