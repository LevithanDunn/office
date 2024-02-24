package com.learning.service.impl;

import com.learning.entity.User;
import com.learning.mapper.UserMapper;
import com.learning.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kim
 * @since 2024-02-18
 */
@Service
public class UserServiceImp extends ServiceImpl<UserMapper, User> implements UserService {

}
