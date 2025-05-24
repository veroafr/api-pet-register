package com.example.demo;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
class Pet {

  @Id
  @GeneratedValue
  private Long id;
  private String nome;
  private String tipo; // cachorro, gato
  private String raca;
  private int idade;
  private String dono;

  Pet() {}

  Pet(String nome, String tipo, String raca, int idade, String dono) {
    this.nome = nome;
    this.tipo = tipo;
    this.raca = raca;
    this.idade = idade;
    this.dono = dono;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }

  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }

  public String getTipo() { return tipo; }
  public void setTipo(String tipo) { this.tipo = tipo; }

  public String getRaca() { return raca; }
  public void setRaca(String raca) { this.raca = raca; }

  public int getIdade() { return idade; }
  public void setIdade(int idade) { this.idade = idade; }

  public String getDono() { return dono; }
  public void setDono(String dono) { this.dono = dono; }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Pet)) return false;
    Pet pet = (Pet) o;
    return idade == pet.idade && Objects.equals(id, pet.id) && Objects.equals(nome, pet.nome)
        && Objects.equals(tipo, pet.tipo) && Objects.equals(raca, pet.raca) && Objects.equals(dono, pet.dono);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, tipo, raca, idade, dono);
  }

  @Override
  public String toString() {
    return "Pet{" + "id=" + id + ", nome='" + nome + '\'' + ", tipo='" + tipo + '\'' +
           ", raca='" + raca + '\'' + ", idade=" + idade + ", dono='" + dono + '\'' + '}';
  }
}
