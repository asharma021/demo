package com.example.raidlog.service;

import com.example.raidlog.entity.DoneList;
import com.example.raidlog.repository.DoneListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoneListService {

    @Autowired
    private DoneListRepository doneListRepository;

    public List<DoneList> getAllDoneLists() {
        return doneListRepository.findAll();
    }

    public DoneList getDoneListById(Long id) {
        return doneListRepository.findById(id).orElse(null);
    }

    public DoneList createDoneList(DoneList doneList) {
        return doneListRepository.save(doneList);
    }

    public DoneList updateDoneList(Long id, DoneList doneListDetails) {
        DoneList doneList = doneListRepository.findById(id).orElse(null);

        if (doneList != null) {
            doneList.setPriority(doneListDetails.getPriority());
            doneList.setRanktype(doneListDetails.getRanktype());
            doneList.setItemNo(doneListDetails.getItemNo());
            doneList.setItemType(doneListDetails.getItemType());
            doneList.setArea(doneListDetails.getArea());
            doneList.setSubarea(doneListDetails.getSubarea());
            doneList.setCategoryName(doneListDetails.getCategoryName());
            doneList.setItemDescription(doneListDetails.getItemDescription());
            doneList.setActions(doneListDetails.getActions());
            doneList.setTaskOwner(doneListDetails.getTaskOwner());
            doneList.setLiaison(doneListDetails.getLiaison());
            doneList.setLastUpdateDate(doneListDetails.getLastUpdateDate());
            doneList.setNextUpdateDate(doneListDetails.getNextUpdateDate());
            doneList.setDueDate(doneListDetails.getDueDate());
            doneList.setStatus(doneListDetails.getStatus());
            doneList.setStatusNotes(doneListDetails.getStatusNotes());
            doneList.setRaisedBy(doneListDetails.getRaisedBy());
            doneList.setSubmittedBy(doneListDetails.getSubmittedBy());
            doneList.setDateCreated(doneListDetails.getDateCreated());
            doneList.setJiraNo(doneListDetails.getJiraNo());
            doneList.setArchivedDate(doneListDetails.getArchivedDate());
            doneList.setDaysDuration(doneListDetails.getDaysDuration());
            return doneListRepository.save(doneList);
        } else {
            return null;
        }
    }

    public void deleteDoneList(Long id) {
        doneListRepository.deleteById(id);
    }
}
