package com.rajiv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Ticket")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Ticket {
	@Id
	@GeneratedValue
private int id;
private double amount;
private String category;
}
