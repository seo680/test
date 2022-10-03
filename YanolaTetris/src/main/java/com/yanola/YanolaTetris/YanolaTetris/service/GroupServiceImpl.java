package com.yanola.YanolaTetris.YanolaTetris.service;

import com.yanola.YanolaTetris.YanolaTetris.entity.Group;
import com.yanola.YanolaTetris.YanolaTetris.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupServiceImpl implements GroupService{
    @Autowired
    private GroupRepository groupRepository;

// @Override
// public List<Group> findAllGroups() {
//    return groupRepository.findAll();
// }

    @Override
    public Group findGroupById(String id) {
//    System.out.println("ID로 그룹 검색");
        Group foundGroup = groupRepository.findByGroupId(id);
//          .orElseThrow(() -> new RuntimeException(String.format("%s에 해당하는 User가 존재하지 않습니다.", id)));
        return foundGroup;
    }

    @Override
    public Group saveGroup(Group newGroup) {
        return groupRepository.save(newGroup);
    }

    @Override
    public Group loginGroup(Group.Request request) {
        return groupRepository.findByGroupId(request.getGroupId());
    }


}
