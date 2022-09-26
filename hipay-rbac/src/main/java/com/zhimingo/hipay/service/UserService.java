package com.zhimingo.hipay.service;

import com.zhimingo.hipay.dto.CreateUserForm;
import com.zhimingo.hipay.dto.SimpleUserVO;
import com.zhimingo.hipay.dto.UpdateUserForm;
import org.springframework.data.domain.Page;

/**
 * 用户相关服务
 */
public interface UserService {

    /**
     * 创建一个未被激活的用户
     * @param form 创建用户所需的信息
     * @return 用户ID
     */
    Long create(CreateUserForm form);

    /**
     * 通过用户ID更新用户信息
     * @param form 需要被更新的用户信息
     */
    void modify(UpdateUserForm form);

    /**
     * 根据用户ID逻辑删除用户信息
     * @param userId 用户ID
     */
    void delete(Long userId);

    /**
     * 分页查询用户信息
     * @return 分页用户信息列表
     */
    Page<SimpleUserVO> fetchUsers();

    /**
     * 通过用户ID查询用户信息
     * @param userId 用户ID
     * @return 用户信息
     */
    SimpleUserVO fetchUserById(Long userId);
}
