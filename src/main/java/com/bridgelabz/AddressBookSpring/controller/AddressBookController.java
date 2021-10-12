package com.bridgelabz.AddressBookSpring.controller;

import com.bridgelabz.AddressBookSpring.dto.AddressBookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

public class AddressBookController {
    @GetMapping("/get")
    public ResponseEntity<String> getAllContact() {
        return new ResponseEntity<>("Get call Succeed", HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<String> getContactById(@PathVariable int contactId) {
        return new ResponseEntity<>("Get call Succeed for id : " + contactId,
                HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addContact(@RequestBody AddressBookDto contactDTO) {
        return new ResponseEntity<>("Created Contact Data for : " +
                contactDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<String> updateContact(@PathVariable int contactId, @RequestBody AddressBookDto contactDTO) {
        return new ResponseEntity<>("Updated Contact Data for : " + contactId ,
                HttpStatus.OK);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<String> deleteContact(@PathVariable int contactId) {
        return new ResponseEntity<>("Deleted Contact Data for : " + contactId,
                HttpStatus.OK);
    }
}
