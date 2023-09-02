package com.example.table.Repository;

import com.example.table.Entity.ContactList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactListRepo extends JpaRepository<ContactList, Long> {
}
