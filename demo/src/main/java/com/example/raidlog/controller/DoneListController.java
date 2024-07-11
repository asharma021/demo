package com.example.raidlog.controller;

import com.example.raidlog.entity.DoneList;
import com.example.raidlog.service.DoneListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/done-list")
public class DoneListController {

    @Autowired
    private DoneListService doneListService;

    @GetMapping
    public List<DoneList> getAllDoneLists() {
        return doneListService.getAllDoneLists();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DoneList> getDoneListById(@PathVariable Long id) {
        DoneList doneList = doneListService.getDoneListById(id);
        if (doneList != null) {
            return ResponseEntity.ok(doneList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public DoneList createDoneList(@RequestBody DoneList doneList) {
        return doneListService.createDoneList(doneList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DoneList> updateDoneList(@PathVariable Long id, @RequestBody DoneList doneListDetails) {
        DoneList updatedDoneList = doneListService.updateDoneList(id, doneListDetails);
        if (updatedDoneList != null) {
            return ResponseEntity.ok(updatedDoneList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoneList(@PathVariable Long id) {
        doneListService.deleteDoneList(id);
        return ResponseEntity.noContent().build();
    }
}
