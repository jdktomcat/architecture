package org.jdktomcat.spring.boot.caffeine.entry;

import lombok.Data;
import lombok.ToString;

/**
 * 用户信息实体
 */
@Data
@ToString
public class UserInfo {
    private String name;
    private Integer age;
}
