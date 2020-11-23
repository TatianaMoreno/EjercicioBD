package com.udec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuario;
	
	@Column(name = "identification", nullable = false, length = 12)
	private String identification;
	
	@Column(name = "nombre", nullable = false, length = 20)
	private String nombre;
	
	@Column(name = "apellido", nullable = false, length = 20)
	private String apellido;
	
	@Column(name = "nick", nullable = false, length = 20, unique = true)	
	private String nick;
	
	@Column(columnDefinition = "TEXT", name = "clave", nullable = false)
	private String clave;
	
	@ManyToOne
	@JoinColumn(name = "idRol", foreignKey = @ForeignKey(name= "FK_rol"))
	private Rol rol;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}



}
