package com.yanola.YanolaTetris.YanolaTetris.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
@Entity
@Component
public class Host {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HOST_ID")
    private String hostID;

    @Column(nullable=false)
    private String groupAdminId;

    @Column(nullable=false)
    private Group group;


    @Override
    public String toString() {
        return "Host [hostID=" + hostID + ", groupAdminId=" + groupAdminId + ", group=" + group + "]";
    }



}









