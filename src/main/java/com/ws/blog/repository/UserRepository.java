package com.ws.blog.repository;

import com.ws.blog.models.User;

import java.util.List;

/**
 * User Repository接口
 */
public interface UserRepository {
    /**
     * 创建或者修改用户
     * @param user
     * @return User
     */
    User saveOrUpdateUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据id查询用户
     * @param id
     * @return User
     */
    User getUserById(Long id);

    /**
     * 查询所有用户
     * @return User
     */
    List<User> listUsers();
}
