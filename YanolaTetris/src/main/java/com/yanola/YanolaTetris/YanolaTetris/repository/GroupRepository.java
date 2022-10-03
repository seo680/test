package com.yanola.YanolaTetris.YanolaTetris.repository;

import com.yanola.YanolaTetris.YanolaTetris.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByGroupId(String id);
}
