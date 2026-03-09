package com.povosindigenas.service;

import com.povosindigenas.model.Usuario;
import com.povosindigenas.repository.UsuarioRepository;
import com.povosindigenas.security.JwtService;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;
    private final JwtService jwtService;

    public AuthService(UsuarioRepository usuarioRepository,
                       JwtService jwtService){

        this.usuarioRepository = usuarioRepository;
        this.jwtService = jwtService;
    }

    public String login(String email, String senha){

        Usuario usuario = usuarioRepository.findByEmail(email);

        if(usuario == null){
            throw new RuntimeException("Usuário não encontrado");
        }

        if(!usuario.getSenha().equals(senha)){
            throw new RuntimeException("Senha inválida");
        }

        return jwtService.gerarToken(email);
    }

}