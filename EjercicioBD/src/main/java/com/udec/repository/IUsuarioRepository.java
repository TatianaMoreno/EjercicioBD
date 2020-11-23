package com.udec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udec.entity.Usuario;


public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	public Usuario findOneByNick(String nick);

}
