package com.myapp.voiceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.voiceapp.models.Volunteer;

/**
 * Created by Chris Bay
 */
public interface VolunteerRepository extends JpaRepository<Volunteer, Integer> {
}
