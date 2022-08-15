package com.whitecape.controllers;

import com.whitecape.entities.Admin;
import com.whitecape.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

@PostMapping
    public Admin addAdmin(Admin admin){
    return adminService.addAdmin(admin);
}

@GetMapping
    public List<Admin> getAllAdmin(){
      return adminService.listerAllAdmin();
    }

}
