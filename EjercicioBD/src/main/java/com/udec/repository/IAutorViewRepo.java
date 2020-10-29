package com.udec.repository;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.udec.entity.Autor;
import com.udec.entity.AutorView;

@Repository
public interface IAutorViewRepo extends JpaRepository<AutorView, Integer> {
	 
	@Transactional
	@Query(value = "SELECT f_obtener_autores()", nativeQuery = true)
	public Page<AutorView> listarVistaAutores(Pageable pageable);
	
	@Transactional
	@Query(value = "SELECT f_obtener_autor(:_id)", nativeQuery = true)
	public AutorView listarVistaAutor(@Param("_id") Integer id);
		

}
