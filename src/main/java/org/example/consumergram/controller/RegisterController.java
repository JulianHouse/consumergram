package org.example.consumergram.controller;

import org.example.consumergram.model.Consumer;
import org.example.consumergram.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RegisterController {

    ConsumerRepository consumerRepository;


    @Autowired
    public RegisterController(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    @GetMapping("/consumers/{id}")
    public Optional<Consumer> getUserById(@PathVariable Long id) {
        return consumerRepository.findById(id);
    }

    }



