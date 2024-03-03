package com.learning.entity;

import lombok.Data;

/**
 * @author Jinawei
 * @created 2024-03-03
 */
@Data
public class UserVo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;
}
