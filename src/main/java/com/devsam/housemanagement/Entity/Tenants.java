package com.devsam.housemanagement.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Tenants {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private String idNumber;
        private String phoneNumber;
}
