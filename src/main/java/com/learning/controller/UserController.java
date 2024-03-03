package com.learning.controller;

import com.learning.converter.UserConverter;
import com.learning.entity.User;
import com.learning.entity.UserVo;
import com.learning.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Kim
 * @since 2024-02-18
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserConverter userConverter;

    @GetMapping(value = "query/{userId}")
    public ResponseEntity<UserVo> queryById(@PathVariable("userId") Long id) {
        User user = userService.getById(id);
        UserVo userVo = userConverter.toUserVo(user);
        return ResponseEntity.ok().body(userVo);
    }

}
