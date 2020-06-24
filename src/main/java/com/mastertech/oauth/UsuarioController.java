package com.mastertech.oauth;

import com.mastertech.oauth.security.Usuario;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/me")
    public Usuario buscaUsuario(@AuthenticationPrincipal Usuario usuario){
        return usuario;
    }
}
