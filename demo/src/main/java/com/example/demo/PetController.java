package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
class PetController {

  private final PetRepository repository;

  PetController(PetRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/pets")
  List<Pet> all() {
    return repository.findAll();
  }

  @PostMapping("/pets")
  Pet newPet(@RequestBody Pet newPet) {
    return repository.save(newPet);
  }

  @GetMapping("/pets/{id}")
  Pet one(@PathVariable Long id) {
    return repository.findById(id)
      .orElseThrow(() -> new PetNotFoundException(id));
  }

  @PutMapping("/pets/{id}")
  Pet replacePet(@RequestBody Pet newPet, @PathVariable Long id) {
    return repository.findById(id)
      .map(pet -> {
        pet.setNome(newPet.getNome());
        pet.setTipo(newPet.getTipo());
        pet.setRaca(newPet.getRaca());
        pet.setIdade(newPet.getIdade());
        pet.setDono(newPet.getDono());
        return repository.save(pet);
      })
      .orElseGet(() -> {
        newPet.setId(id);
        return repository.save(newPet);
      });
  }

  @DeleteMapping("/pets/{id}")
  void deletePet(@PathVariable Long id) {
    repository.deleteById(id);
  }
}
