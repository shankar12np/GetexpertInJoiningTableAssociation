package com.example.table.Service;

import com.example.table.Entity.Address1234;
import com.example.table.Entity.ContactList;
import com.example.table.Entity.JobHistory;
import com.example.table.Entity.MedicalRecord;
import com.example.table.Repository.ContactListRepo;
import com.example.table.Repository.JobHistoryRepo;
import com.example.table.Repository.MedicalRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactListService {
    @Autowired
    ContactListRepo contactListRepo;
    @Autowired
    MedicalRecordRepo medicalRecordRepo;
    @Autowired
    JobHistoryRepo jobHistoryRepo;

    public void addContact(ContactList contactList) {
        for (Address1234 address : contactList.getAddress1234()) {
            address.setContactList(contactList);
        }

        for (MedicalRecord medicalRecord : contactList.getMedicalRecordList()) {
            medicalRecord.setContactList(contactList);
        }

        for (JobHistory jobHistory: contactList.getJobHistoryList()){
            jobHistory.setContactList(contactList);
        }

        contactListRepo.save(contactList);
    }

    public List<ContactList> getAllContactLists() {
        return contactListRepo.findAll();
    }
}