package com.whitecape.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id ;
    private String email;
    private String address;
    private String password;
}
