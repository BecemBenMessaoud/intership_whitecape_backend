package com.whitecape.services;

import com.whitecape.entities.Admin;

import java.util.List;

public interface AdminService {
    Admin addAdmin(Admin admin);
    List<Admin> listerAllAdmin();
    void deleteAdmin(Admin admin);
}
