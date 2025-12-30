package com.example.eventmanagement.service;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    // Create / Add Event
    public Event addEvent(Event event) {
        return repository.save(event);
    }

    // Read / Get all events
    public List<Event> getAllEvents() {
        return repository.findAll();
    }

    // Update event
    public Event updateEvent(Long id, Event eventDetails) {
        Event event = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id " + id));

        event.setEventName(eventDetails.getEventName());
        event.setEventDate(eventDetails.getEventDate());
        return repository.save(event);
    }

    // Delete event
    public void deleteEvent(Long id) {
        repository.deleteById(id);
    }

    // Optional: Get event by ID
    public Optional<Event> getEventById(Long id) {
        return repository.findById(id);
    }
}
