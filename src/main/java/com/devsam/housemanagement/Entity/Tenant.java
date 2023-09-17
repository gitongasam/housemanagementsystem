package com.devsam.housemanagement.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String secondname;
    private String lastname;
    @Column(unique = true)
    private String email;
    private Date leaseStartDate;


}
