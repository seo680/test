package com.yanola.YanolaTetris.YanolaTetris.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="GROUP")
@Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Entity
@Component
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GROUP_ID")
    @ManyToOne
    @JoinColumn(name = "HOST_ID")
    private String groupId;

    @Column(nullable = false)
    private int groupRank;

    @Column(nullable = false)
    private int groupMileage;

    @Column
    private Date purchaseDateOfItem;

    @Column
    private Date usedDateOfItem;

    @Column(nullable = false)
    private int groupScore;


    @Override
    public String toString() {
        return "Group [groupId=" + groupId + ", groupRank=" + groupRank + ", groupMileage=" + groupMileage
                + ", purchaseDateOfItem=" + purchaseDateOfItem + ", usedDateOfItem=" + usedDateOfItem + ", groupScore="
                + groupScore + "]";
    }


    @ToString
    @Builder
    @Getter @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request{


        private String groupId;

        private int groupRank;

        private int groupScore;


        public static Group toEntity(final Request request) {
            return Group.builder()
                    .groupId(request.getGroupId())
                    .groupRank(request.getGroupRank())
                    .groupScore(request.getGroupScore())
                    .build();
        }




    }
    @ToString
    @Builder
    @Getter @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {

        private String groupId;

        private int groupRank;

        private int groupScore;


        public static Group.Response toResponse(final Group group) {
            return Response.builder()
                    .groupId(group.getGroupId())
                    .groupRank(group.getGroupRank())
                    .groupScore(group.getGroupScore())
                    .build();

        }





    }




}








