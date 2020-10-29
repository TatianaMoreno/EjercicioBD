package com.udec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "autor_view")
public class AutorView {
	
	@Id
	@Column
	private Integer id;	
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;

	@Column
	private String descripcion;
	
	@Column
	private String barrio;
	
	@Column
	private Integer cantidad;
	
}
