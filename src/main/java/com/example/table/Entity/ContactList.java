package com.example.table.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contact_list")
public class ContactList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastname;
    private String email;
    @OneToMany(targetEntity = Address1234.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id", referencedColumnName = "id")
    private List<Address1234>address1234;

    @OneToMany(targetEntity = MedicalRecord.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "medial-id", referencedColumnName = "firstName")
    private List<MedicalRecord>medicalRecordList;

    @OneToMany(targetEntity = JobHistory.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Job-id", referencedColumnName = "firstName")
    private List<JobHistory>jobHistoryList;


}
