package com.whitecape.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class Article {

        @Id
        @GeneratedValue
        @Column(name="ID")
        private Long id ;
        private String description;
        private String state;

    }

