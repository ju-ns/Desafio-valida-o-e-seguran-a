package com.devsuperior.bds04.dto;

import com.devsuperior.bds04.entities.Role;
import com.devsuperior.bds04.entities.User;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {

    private Long id;
    private String userName;
    private String password;
    private Set<RoleDTO> roles = new HashSet<>();

    public UserDTO(){}

    public UserDTO(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public UserDTO(User entity){
        id = entity.getId();
        userName = entity.getUserName();
        password = entity.getPassword();
    }

    public UserDTO(User entity, Set<Role> roles){
        this(entity);
        roles.forEach((x) -> this.roles.add(new RoleDTO(x)));
    }
}
