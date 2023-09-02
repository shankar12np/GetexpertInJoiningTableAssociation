package com.example.table.Controller;

import com.example.table.Entity.ContactList;
import com.example.table.Repository.Address1234Repo;
import com.example.table.Service.ContactListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/contact-list")
public class ContactListController {

    @Autowired
    ContactListService contactListService;
    @Autowired
    Address1234Repo address1234Repo;


@PostMapping("/add")
    public ResponseEntity<String>addContact(@RequestBody ContactList contactList){
        contactListService.addContact(contactList);
       return ok("New Contact added");
    }

    @GetMapping
    public ResponseEntity<List<ContactList>> getContactList() {
        System.out.println("Hello From GetMapping test");
        List<ContactList> allSavedContactList = contactListService.getAllContactLists();
        return ResponseEntity.ok(allSavedContactList);
           }


}
