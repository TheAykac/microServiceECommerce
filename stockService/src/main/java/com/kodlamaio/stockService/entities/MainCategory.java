package com.kodlamaio.stockService.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "mainCategories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainCategory {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	@OneToMany(mappedBy = "mainCategory")
	private List<SecondCategory> secondCategories;
}
