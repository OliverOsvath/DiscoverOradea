package com.sda.discover.oradea.controller;

import com.sda.discover.oradea.model.Guest;
import com.sda.discover.oradea.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GuestController {

    @Autowired
    private final GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @PostMapping("/saveGuest")
    public void save(Guest guest) {
        guestService.save(guest);
    }
}
