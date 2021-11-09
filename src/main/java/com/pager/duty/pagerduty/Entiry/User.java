package com.pager.duty.pagerduty.Entiry;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    @Column(columnDefinition = "phone_number")
    private String phoneNumber;
}
