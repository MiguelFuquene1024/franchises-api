package com.branch.api.franchise.infrastructure.controller;

import com.branch.api.franchise.application.service.FranchiseService;
import com.branch.api.franchise.domain.FranchiseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/franchise")
public class FranchiseController {
    private final FranchiseService franchiseService;

    @PostMapping
    public ResponseEntity<?> createFranchise(@RequestBody FranchiseDto franchiseDto) {
        return ResponseEntity.ok(franchiseService.createFranchise(franchiseDto));
    }
}
