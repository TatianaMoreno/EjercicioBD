package com.udec.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.udec.entity.AutorLector;

@Repository
public interface IAutorLectorRepo extends JpaRepository<AutorLector, Integer> {
	
	@Transactional
	@Modifying
	@Query(value= "INSERT INTO autor_lector(id_autor, id_lector, info_adicional) VALUES (:idAutor, :idLector, :infoAdicional)",nativeQuery = true)
	Integer guardar (@Param("idAutor") Integer idAutor, @Param ("idLector") Integer idLector, @Param ("infoAdicional") String infoAdicional);
	
	@Query("from AutorLector ce where ce.autor.id = :idAutor")
	List<AutorLector> listarPorAutor(@Param ("idAutor") Integer idAutor);
	
	@Query("select ce.lector from AutorLector ce where ce.autor.id = :idAutor")
	List<AutorLector> listarAutor(@Param ("idAutor") Integer idAutor);
	
	

}
