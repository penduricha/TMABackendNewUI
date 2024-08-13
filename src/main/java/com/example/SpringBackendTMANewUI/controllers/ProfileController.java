package com.example.SpringBackendTMANewUI.controllers;

import com.example.SpringBackendTMANewUI.models.*;
import com.example.SpringBackendTMANewUI.services.impl.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
    private final ProfileService profileService;
    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }
    @GetMapping
    public List<Profile> getAllProfiles() throws JpaSystemException {
        return profileService.getAllProfiles();
    }
    @PostMapping
    public Profile saveProfile(@RequestBody Profile profile) throws JpaSystemException{
        return profileService.saveProfile(profile);
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<Profile> getProfileByEmail(@PathVariable String email) throws JpaSystemException {
        Profile profile = profileService.findProfileByEmail(email);
        return ResponseEntity.ok(profile);
    }
    @GetMapping("/phoneNumber/{phoneNumber}")
    public ResponseEntity<Profile> getProfileByPhoneNumber(@PathVariable String phoneNumber) throws JpaSystemException {
        Profile profile = profileService.findProfileByPhoneNumber(phoneNumber);
        return ResponseEntity.ok(profile);
    }
}
