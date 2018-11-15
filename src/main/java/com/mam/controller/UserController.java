
package com.mam.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mam.exception.ResourceNotFoundException;
import com.mam.model.Actor;
import com.mam.repository.ActorRepository;

@RestController
public class UserController {

	// Get All actor
	@GetMapping("/actors")
	public List<Actor> getAllNotes() {
		return actorRepository.findAll();
	}

	// Create a new actor
	@PostMapping("/actor")
	public Actor createNote(@Valid @RequestBody Actor actor) {
		return actorRepository.save(actor);
	}

	// Get a Single Note
	@GetMapping("/notes/{id}")
	public Actor getNoteById(@PathVariable(value = "id") Long actorId) {
		return actorRepository.findById(actorId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", actorId));
	}

	// Update a actor
	@PutMapping("/actor/{id}")
	public Actor updateNote(@PathVariable(value = "id") Long actorId, @Valid @RequestBody Actor actorDetails) {
		Actor actor = actorRepository.findById(actorId)
				.orElseThrow(() -> new ResourceNotFoundException("Actor", "id", actorId));
		actor.setAct_fname(actorDetails.getAct_fname());
		actor.setAct_lname(actorDetails.getAct_lname());
		actor.setAct_gender(actorDetails.getAct_gender());
		Actor updatedActor = actorRepository.save(actor);
		return updatedActor;
	}

	// Delete a actor
	@DeleteMapping("/actor/{id}")
	public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long actorId) {
		Actor actor = actorRepository.findById(actorId)
				.orElseThrow(() -> new ResourceNotFoundException("Actor", "id", actorId));
		actorRepository.delete(actor);
		return ResponseEntity.ok().build();
	}

	@Autowired
	private ActorRepository actorRepository;

}
