package com.myapp.voiceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.voiceapp.models.Event;

/**
 * Created by Chris Bay
 */

public interface EventRepository extends JpaRepository<Event, Integer> {
}
