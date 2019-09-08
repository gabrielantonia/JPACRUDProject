package com.skilldistillery.pokemon.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pokedex_number")
	private int pokedexNumber;
	
	@NotNull
	private String name;
	
	
	@Column(name="type")
	private String type1;
	
	@Column(name="type_2")
	private String type2;
	
	@NotNull
	private int hp;
	
	@NotNull
	private int attack;
	
	@NotNull
	private int defense;
	
	@NotNull
	@Column(name="sp_attack")
	private  int specialAttack;
	
	@NotNull
	@Column(name="sp_defense")
	private  int specialDefense;
	
	@NotNull
	private int speed;
	
	private String abilities;
	
	private String classification;
	
	private Double height;
	
	@Column(name="weight_kg")
	private Double weight;
	
	
	public Pokemon() {
		// TODO Auto-generated constructor stub
	}


	public Pokemon(int pokedexNumber, String name, String type1, String type2, int hp, int attack, int defense,
			int specialAttack, int specialDefense, int speed, String abilities, String classification, Double height,
			Double weight) {
		super();
		this.pokedexNumber = pokedexNumber;
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.speed = speed;
		this.abilities = abilities;
		this.classification = classification;
		this.height = height;
		this.weight = weight;
	}


	public int getPokedexNumber() {
		return pokedexNumber;
	}


	public void setPokedexNumber(int pokedexNumber) {
		this.pokedexNumber = pokedexNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType1() {
		return type1;
	}


	public void setType1(String type1) {
		this.type1 = type1;
	}


	public String getType2() {
		return type2;
	}


	public void setType2(String type2) {
		this.type2 = type2;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getSpecialAttack() {
		return specialAttack;
	}


	public void setSpecialAttack(int specialAttack) {
		this.specialAttack = specialAttack;
	}


	public int getSpecialDefense() {
		return specialDefense;
	}


	public void setSpecialDefense(int specialDefense) {
		this.specialDefense = specialDefense;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getAbilities() {
		return abilities;
	}


	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}


	public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}


	public Double getHeight() {
		return height;
	}


	public void setHeight(Double height) {
		this.height = height;
	}


	public Double getWeight() {
		return weight;
	}


	public void setWeight(Double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Pokemon [pokedexNumber=" + pokedexNumber + ", name=" + name + ", type1=" + type1 + ", type2=" + type2
				+ ", hp=" + hp + ", attack=" + attack + ", defense=" + defense + ", specialAttack=" + specialAttack
				+ ", specialDefense=" + specialDefense + ", speed=" + speed + ", abilities=" + abilities
				+ ", classification=" + classification + ", height=" + height + ", weight=" + weight + "]";
	}

	
}
