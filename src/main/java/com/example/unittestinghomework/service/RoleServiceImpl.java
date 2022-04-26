package com.example.unittestinghomework.service;

import com.example.unittestinghomework.model.Role;
import com.example.unittestinghomework.model.User;
import com.example.unittestinghomework.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role getRole(String name) {
        log.info("Fetching role {}", name);
        return roleRepository.findByName(name);
    }


}
