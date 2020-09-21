package com.cn.exclusiveGirlfriend.service;/**
 * @ClassName RoleService
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/16 13:40
 * @Hodified By:
 **/

import com.cn.exclusiveGirlfriend.pojo.Role;

import java.util.List;
import java.util.Set;

/**
 * @ClassName RoleService
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/16 13:40
 * @Hodified By:
 **/
public interface RoleService {
    List<Role> findRoleByUser(Integer uid);

    public Set<String> getPermissionByRole(List<Role> roles);

    public Set<String> getRolesByUser(List<Role> rolesList);
}
