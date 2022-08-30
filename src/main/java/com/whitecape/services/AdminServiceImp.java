package com.whitecape.services;

import com.whitecape.entities.Admin;
import com.whitecape.reposities.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void deleteAdmin(Long adminId) {
            Optional<Admin> admin =adminRepository.findById(adminId);
            if (admin.isPresent()) {
                adminRepository.delete(admin.get());
            }
        }

    @Override
    public Admin updateAdmin(Admin admin, long adminId) {
        if (adminRepository.findById(adminId).isPresent()) {
          admin.setId(adminId);
          return adminRepository.save(admin);
        }
            return null;
        }
    }


