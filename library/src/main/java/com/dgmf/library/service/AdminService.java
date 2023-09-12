package com.dgmf.library.service;

import com.dgmf.library.dto.AdminDTO;
import com.dgmf.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);
    Admin save(AdminDTO adminDTO);
}
