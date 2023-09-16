package pe.edu.tecsup.authservertaller.service;

import pe.edu.tecsup.authservertaller.domain.Usuario;

public interface AuthenticationService {
    Usuario findByUsernameAndPassword(String username, String password);
    Usuario findByUsername(String username);
}
