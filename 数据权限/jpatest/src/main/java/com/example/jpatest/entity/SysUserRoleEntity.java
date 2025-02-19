package com.example.jpatest.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_user_role", schema = "test", catalog = "")
public class SysUserRoleEntity {
  private long id;
  private long userId;
  private long roleId;
  
  @Id
  @Column(name = "id")
  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }
  
  @Basic
  @Column(name = "user_id")
  public long getUserId() {
    return userId;
  }
  
  public void setUserId(long userId) {
    this.userId = userId;
  }
  
  @Basic
  @Column(name = "role_id")
  public long getRoleId() {
    return roleId;
  }
  
  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SysUserRoleEntity that = (SysUserRoleEntity) o;
    return id == that.id &&
        userId == that.userId &&
        roleId == that.roleId;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(id, userId, roleId);
  }
}
