package com.yanola.YanolaTetris.YanolaTetris.controller;

import com.yanola.YanolaTetris.YanolaTetris.entity.Group;
import com.yanola.YanolaTetris.YanolaTetris.repository.GroupRepository;
import com.yanola.YanolaTetris.YanolaTetris.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
    @RequestMapping("/group")
    @CrossOrigin(origins = "*")
    public class GroupController {

        @Autowired
        private GroupService groupService;

        @Autowired
        private GroupRepository groupRepository;



        /** Java Doc 작성용 주석

         *  해당 메서드에 대한 간단한 동작 서술 -> "모든 Group list를 반환한다"

         *

         *  @return List<Group>

         *  @author SEO2317

         */


//    @GetMapping // 'GET' http://localhost:8090/users 요청 시 호출되는 메서드(핸들러)
//    public List<Group.Response> getGroups() {
//            System.out.println("GET: getUsers() of  GroupController called");
//        List<Group> groups = groupService.findAllGroups();
//        List<Group.Response> response = Group.Response.toResponseList(groups);
//        return response;
//    }

        @PostMapping("auth")
        public ResponseEntity<Group.Response> registerGroup(@RequestBody @Valid Group.Request request) {

            Group group = Group.Request.toEntity(request);

            Group savedGroup = groupService.saveGroup(group);

            Group.Response response = Group.Response.toResponse(savedGroup); // ResponseEntity로 반환하는 방식
            return ResponseEntity.status(HttpStatus.CREATED).body(response);

        }

        @PostMapping("auth/sign-in")
        public ResponseEntity<Group.Response> signIn(@RequestBody Group.Request request) {
            Group group = groupService.loginGroup(request);
            Group.Response response = Group.Response.toResponse(group);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        }
    }
