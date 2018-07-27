package com.myapp.voiceapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.myapp.voiceapp.models.Event;
import com.myapp.voiceapp.repositories.EventRepository;

import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
public class HomeController {

    @Autowired
    EventRepository eventRepository;

    @GetMapping(value = "/")
    public String index(Model model) {
        List<Event> allEvents = eventRepository.findAll();
        model.addAttribute("events", allEvents);
        return "events/list";
    }
}
