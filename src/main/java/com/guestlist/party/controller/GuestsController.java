package com.guestlist.party.controller;

import com.guestlist.party.Guest;
import com.guestlist.party.Guests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/guests")
public class GuestsController {

    @Autowired
    private Guests guests;

    @GetMapping
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("GuestList");
        modelAndView.addObject(new Guest());
        modelAndView.addObject("guests", guests.findAll());
        return modelAndView;
    }

    @PostMapping
    public String save(Guest guest) {
        this.guests.save(guest);
        return "redirect:/guests";
    }


}
