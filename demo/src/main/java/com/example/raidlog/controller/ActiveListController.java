package com.example.raidlog.controller;

import com.example.raidlog.entity.ActiveList;
import com.example.raidlog.service.ActiveListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/active-list")
public class ActiveListController {

    @Autowired
    private ActiveListService activeListService;

    @GetMapping
    public List<ActiveList> getAllActiveLists() {
        return activeListService.getAllActiveLists();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActiveList> getActiveListById(@PathVariable Long id) {
        ActiveList activeList = activeListService.getActiveListById(id);
        if (activeList != null) {
            return ResponseEntity.ok(activeList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ActiveList createActiveList(@RequestBody ActiveList activeList) {
        return activeListService.createActiveList(activeList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ActiveList> updateActiveList(@PathVariable Long id, @RequestBody ActiveList activeListDetails) {
        ActiveList updatedActiveList = activeListService.updateActiveList(id, activeListDetails);
        if (updatedActiveList != null) {
            return ResponseEntity.ok(updatedActiveList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteActiveList(@PathVariable Long id) {
        activeListService.deleteActiveList(id);
        return ResponseEntity.noContent().build();
    }
}
