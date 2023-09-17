package com.devsam.housemanagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Tenant")
@Getter
@Setter
public class Tenant {
    private String firstname;
    private String secondname;
    private String lastname;
    @Column(unique = true)
    private String email;
    private Date leaseStartDate;


}
