package com.udec.services.interfaces;

import org.springframework.data.domain.Page;

import com.udec.entity.Usuario;


public interface IUsuarioService extends ICrudService<Usuario,Integer>{

	public void eliminarUsuario(Integer id);
	public Page<Usuario> listarNombreUsuarioUno(String nombre, int page, int size) ;
	public Page<Usuario> listarPaginado(Boolean lazy, Integer page, Integer size);	
	public Usuario consultar(Boolean lazy, Integer id);	
}
