package com.dgmf.library.service;

import com.dgmf.library.dto.AdminDTO;
import com.dgmf.library.model.Admin;
import com.dgmf.library.repository.AdminRepository;
import com.dgmf.library.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;
    private final RoleRepository roleRepository;

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public Admin save(AdminDTO adminDTO) {
        Admin admin = Admin.builder()
                .firstName(adminDTO.getFirstName())
                .lastName(adminDTO.getLastName())
                .username(adminDTO.getUsername())
                .password(adminDTO.getPassword())
                .roles(Arrays.asList(roleRepository.findByName("ROLE_ADMIN")))
                .build();

        return adminRepository.save(admin);
    }
}
