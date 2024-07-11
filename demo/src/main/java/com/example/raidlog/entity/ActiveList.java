package com.example.raidlog.entity;

import lombok.Data;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
public class ActiveList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String priority;
    private int ranktype;
    private int itemNo;
    private String itemType;
    private String area;
    private String subarea;
    private String name;
    private String itemDescription;
    private String tacticalAndStrategicActions;
    private String taskOwner;
    private String liaison;
    private Date lastUpdateDate;
    private Date nextUpdateDate;
    private Date dueDate;
    private String status;
    private String statusNotes;
    private String raisedBy;
    private String submittedBy;
    private Date dateCreated;
    private String jiraNo;
    private String monitoringFollowUpComments;
}
