package com.learning.converter;

import com.learning.entity.User;
import com.learning.entity.UserVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/**
 * @author Jinawei
 * @created 2024-03-03
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserConverter {
    UserVo toUserVo(User user);
}
