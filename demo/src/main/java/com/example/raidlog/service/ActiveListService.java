package com.example.raidlog.service;

import com.example.raidlog.entity.ActiveList;
import com.example.raidlog.repository.ActiveListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActiveListService {

    @Autowired
    private ActiveListRepository activeListRepository;

    public List<ActiveList> getAllActiveLists() {
        return activeListRepository.findAll();
    }

    public ActiveList getActiveListById(Long id) {
        return activeListRepository.findById(id).orElse(null);
    }

    public ActiveList createActiveList(ActiveList activeList) {
        return activeListRepository.save(activeList);
    }

    public ActiveList updateActiveList(Long id, ActiveList activeListDetails) {
        ActiveList activeList = activeListRepository.findById(id).orElse(null);

        if (activeList != null) {
            activeList.setPriority(activeListDetails.getPriority());
            activeList.setRanktype(activeListDetails.getRanktype());
            activeList.setItemNo(activeListDetails.getItemNo());
            activeList.setItemType(activeListDetails.getItemType());
            activeList.setArea(activeListDetails.getArea());
            activeList.setSubarea(activeListDetails.getSubarea());
            activeList.setName(activeListDetails.getName());
            activeList.setItemDescription(activeListDetails.getItemDescription());
            activeList.setTacticalAndStrategicActions(activeListDetails.getTacticalAndStrategicActions());
            activeList.setTaskOwner(activeListDetails.getTaskOwner());
            activeList.setLiaison(activeListDetails.getLiaison());
            activeList.setLastUpdateDate(activeListDetails.getLastUpdateDate());
            activeList.setNextUpdateDate(activeListDetails.getNextUpdateDate());
            activeList.setDueDate(activeListDetails.getDueDate());
            activeList.setStatus(activeListDetails.getStatus());
            activeList.setStatusNotes(activeListDetails.getStatusNotes());
            activeList.setRaisedBy(activeListDetails.getRaisedBy());
            activeList.setSubmittedBy(activeListDetails.getSubmittedBy());
            activeList.setDateCreated(activeListDetails.getDateCreated());
            activeList.setJiraNo(activeListDetails.getJiraNo());
            activeList.setMonitoringFollowUpComments(activeListDetails.getMonitoringFollowUpComments());
            return activeListRepository.save(activeList);
        } else {
            return null;
        }
    }

    public void deleteActiveList(Long id) {
        activeListRepository.deleteById(id);
    }
}
