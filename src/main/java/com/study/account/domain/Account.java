package com.study.account.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id; // PK

    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

}
