package com.branch.api.franchise.infrastructure.controller;

import com.branch.api.franchise.domain.BranchDto;
import com.branch.api.franchise.infrastructure.adapter.BranchServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/branch")
public class BranchController {
    private final BranchServiceImpl branchService;

    @GetMapping
    public ResponseEntity<?> getBranches() {
        return ResponseEntity.ok(branchService.getAllBranches());
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getBranch(@PathVariable int id) {
        return ResponseEntity.ok(branchService.getBranch(id));
    }
    @PostMapping
    public ResponseEntity<?> createBranch(@RequestBody BranchDto branchDto) {
        return ResponseEntity.ok(branchService.createBranch(branchDto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBranch(@PathVariable int id) {
        branchService.deleteBranch(id);
        return ResponseEntity.ok().body(HttpStatus.OK);
    }
}
