package com.cyx.mapper;

import com.cyx.pojo.People;

import java.util.List;

public interface resumeMapper {
    People selectResumeByID(int id);
    int deletePeopleByID(int id);
    int updatePeopleResume(People people);
    int addPeopleResume(People people);
    List<People> selectAll();

}
