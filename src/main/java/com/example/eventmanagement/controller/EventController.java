package com.example.eventmanagement.controller;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.repository.EventRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventRepository repository;

    public EventController(EventRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return repository.save(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event eventDetails) {
        Event event = repository.findById(id).orElseThrow();
        event.setEventName(eventDetails.getEventName());
        event.setEventDate(eventDetails.getEventDate());
        return repository.save(event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
