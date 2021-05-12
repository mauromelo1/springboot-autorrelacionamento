package com.mauromelo1.autorrelacionamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mauromelo1.autorrelacionamento.dto.UserDTO;
import com.mauromelo1.autorrelacionamento.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}/following")
	public ResponseEntity<List<UserDTO>> getFollowing(@PathVariable Long id) {
		List<UserDTO> list = service.getFollowing(id);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}/followers")
	public ResponseEntity<List<UserDTO>> getFollowers(@PathVariable Long id) {
		List<UserDTO> list = service.getFollowers(id);
		return ResponseEntity.ok(list);
	}
}