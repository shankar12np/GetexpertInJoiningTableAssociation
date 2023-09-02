package com.example.table.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address_table")
public class Address1234 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aid;
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public void setContactList(ContactList contactList) {
    }


}
