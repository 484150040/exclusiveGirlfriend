package com.cn.exclusiveGirlfriend.service.impl;/**
 * @ClassName RoleServiceimpl
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/16 13:41
 * @Hodified By:
 **/

import com.cn.exclusiveGirlfriend.mapper.RoleMapper;
import com.cn.exclusiveGirlfriend.pojo.Position;
import com.cn.exclusiveGirlfriend.pojo.Role;
import com.cn.exclusiveGirlfriend.pojo.RoleExample;
import com.cn.exclusiveGirlfriend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName RoleServiceimpl
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/16 13:41
 * @Hodified By:
 **/
@Service
@Transactional
public class RoleServiceimpl implements RoleService {
    @Autowired(required = false)
    private RoleMapper roleMapper;


    @Override
    public List<Role> findRoleByUser(Integer uid) {
        RoleExample roleExample=new RoleExample();
        RoleExample.Criteria cri = roleExample.createCriteria();
        if (uid!=null){if (roleExample != null)
            cri.andRoleidNotEqualTo(uid);
            List<Role> systemUserList = roleMapper.selectByExample(roleExample);
            return systemUserList;
        }
        return null;
    }
    /**
     * 根据角色查找对应的权限
     * @param roles
     * @return
     */
    public Set<String> getPermissionByRole(List<Role> roles) {
        if (roles.isEmpty() || roles == null){
            return null;
        }
        Set<String> sets = new HashSet<>();
        List<Integer> listRoleId = new ArrayList<>();
        for (Role role :roles) {
            listRoleId.add(role.getRoleid());
        }
        List<Position> permissionList = roleMapper.findPermissionByRoleId(listRoleId);
        if (permissionList == null || permissionList.isEmpty()){
            return null;
        }
        for (Position p : permissionList) {
            sets.add(p.getName());
        }
        return sets;
    }

    /**
     * 根据用户查找对应的角色
     * @param rolesList
     * @return
     */
    public Set<String> getRolesByUser(List<Role> rolesList) {
        if(rolesList != null || !rolesList.isEmpty()){
            Set<String> setRoles = new HashSet<>();
            for (Role r:rolesList) {
                setRoles.add(r.getRolename());
            }
            return setRoles;
        }
        return null;
    }
}
