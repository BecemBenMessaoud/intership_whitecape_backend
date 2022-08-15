package com.whitecape.services;

import com.whitecape.entities.Admin;
import com.whitecape.reposities.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImp implements AdminService {
    private final AdminRepository adminRepository;

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> listerAllAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public void deleteAdmin(Admin admin) {
      adminRepository.delete(admin);
    }
}
