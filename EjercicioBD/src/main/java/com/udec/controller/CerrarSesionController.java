package com.udec.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Validated
@RestController
@Api(description = "Todos los servicios transaccionales que se pueden realizar sobre una persona.",tags = "Servicios rest   ")
@RequestMapping("/cerrarSesion/")
@ApiResponses(value={@ApiResponse(code = 200, message = "Transaccion exitosa"),@ApiResponse(code = 403, message = "Acceso prohibido"),@ApiResponse(code = 401, message = "Metodo no autorizado"),@ApiResponse(code = 404, message = "Recurso no encontrado")})
public class CerrarSesionController {

	@Autowired
	private ConsumerTokenServices tokenServices;
	
	@ApiOperation(value = "Eliminar libro", notes = "El metodo que elimina un libro.")
	@ApiResponses(value={@ApiResponse(code = 204, message = "No hay contenido")})
	@DeleteMapping("/anular/{token:.*}")
	public void eliminar(@Valid @NonNull @PathVariable("token") String token ){
		new XYZ();
		tokenServices.revokeToken(token);
	}
	
}
