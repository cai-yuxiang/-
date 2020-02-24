package com.cyx.service;

import com.cyx.pojo.People;
import com.cyx.mapper.*;

import java.util.List;

public class resumeServiceImpl implements resumeService {
    private resumeMapper mapper;
    public People selectResumeByID(int id) {
        return mapper.selectResumeByID(id);
    }

    public int deletePeopleByID(int id) {
        return mapper.deletePeopleByID(id);
    }

    public int updatePeopleResume(People people) {
        return mapper.updatePeopleResume(people);
    }

    public int addPeopleResume(People people) {
        return mapper.addPeopleResume(people);
    }

    public List<People> selectAll() {
        return mapper.selectAll();
    }

    public void setMapper(resumeMapper mapper) {
        this.mapper=mapper;
    }
}
