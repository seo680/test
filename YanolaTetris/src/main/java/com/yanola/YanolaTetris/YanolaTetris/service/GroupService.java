package com.yanola.YanolaTetris.YanolaTetris.service;

import com.yanola.YanolaTetris.YanolaTetris.entity.Group;

import java.util.List;



public interface GroupService {

// List<Group> findAllGroups(); //그룹 전체 조회

    Group findGroupById(String id); //그룹 id로 하나의 그룹 조회

    Group saveGroup(Group newGroup); //그룹 저장

    Group loginGroup(Group.Request request);
}
