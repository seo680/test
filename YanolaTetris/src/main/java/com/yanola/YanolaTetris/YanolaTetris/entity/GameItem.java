package com.yanola.YanolaTetris.YanolaTetris.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor @AllArgsConstructor
@Setter @Getter
@Entity
@Component
public class GameItem {

    @Id
    @Column(name = "ITEM_ID")
    private int id;

    @Column
    private String category;

    @Column
    private int price;
    private boolean itemUsage;



    @Override
    public String toString() {
        return "GameItem [category=" + category + ", price=" + price + ", itemUsage=" + itemUsage + "]";
    }



}