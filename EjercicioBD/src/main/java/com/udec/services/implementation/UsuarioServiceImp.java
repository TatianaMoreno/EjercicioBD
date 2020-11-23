package com.udec.services.implementation;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.udec.entity.Usuario;
import com.udec.repository.IUsuarioRepository;
import com.udec.services.interfaces.IUsuarioService;

@Service("Usuario")
public class UsuarioServiceImp implements IUsuarioService, UserDetailsService {

	@Override
	public void insertar(Usuario objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Usuario objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Usuario> listarNombreUsuarioUno(String nombre, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Usuario> listarPaginado(Boolean lazy, Integer page, Integer size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario consultar(Boolean lazy, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Autowired
	private IUsuarioRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario users = repository.findOneByNick(username);
		if(users == null)
			throw new UsernameNotFoundException("Usuario no encontrado");
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority(users.getRol().getNombre()));
		
		UserDetails userDetails = new User(users.getNick(), users.getClave(), roles);
		
		return userDetails;
	}

}
