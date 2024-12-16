package com.branch.api.franchise.infrastructure.controller;

import com.branch.api.franchise.application.service.FranchiseService;
import com.branch.api.franchise.domain.FranchiseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/franchise")
public class FranchiseController {
    private final FranchiseService franchiseService;

    @GetMapping
    public ResponseEntity<?> getAllFranchises() {
        return ResponseEntity.ok(franchiseService.getFranchises());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getFranchise(@PathVariable int id) {
        return ResponseEntity.ok(franchiseService.getFranchise(id));
    }
    @PostMapping
    public ResponseEntity<?> createFranchise(@RequestBody FranchiseDto franchiseDto) {
        return ResponseEntity.ok(franchiseService.createFranchise(franchiseDto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteFranchise(@PathVariable int id) {
        franchiseService.deleteFranchise(id);
        return ResponseEntity.ok().body(HttpStatus.OK);
    }
}
