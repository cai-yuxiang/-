package com.cyx.service;

import com.cyx.pojo.People;

import java.util.List;

public interface resumeService {
    People selectResumeByID(int id);
    int deletePeopleByID(int id);
    int updatePeopleResume(People people);
    int addPeopleResume(People people);
    List<People> selectAll();
}
