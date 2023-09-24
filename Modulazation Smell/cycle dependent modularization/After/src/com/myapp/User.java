package com.myapp;
import java.util.ArrayList;
import java.util.List;


public class User {
 private String name;
 private List<userRole> userRoles;

 public User(String name) {
     this.name = name;
     roles = new ArrayList<>();
 }

 public void addUserRole(userRole UserRole) {
     userRoles.add(UserRole);
 }

 public List<userRole> getUserRoles() {
     return userRoles;
 }

 public String getName() {
     return name;
 }
}
