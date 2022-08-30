package com.whitecape.controllers;

import com.whitecape.entities.Admin;
import com.whitecape.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
@PostMapping
    public Admin addAdmin(@RequestBody Admin admin){
    return adminService.addAdmin(admin);
}
@GetMapping
    public List<Admin> getAllAdmin() {
    return adminService.listerAllAdmin();
}
    @DeleteMapping("/delete/{id}")
    public void deleteAdmin(@PathVariable long id){
      adminService.deleteAdmin(id);
    }
    @PutMapping("/update/{adminId}")
    Admin update(@RequestBody Admin admin,@PathVariable long adminId){
        return adminService.updateAdmin(admin,adminId);
    }
}
