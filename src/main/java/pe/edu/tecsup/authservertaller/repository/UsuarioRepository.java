package pe.edu.tecsup.authservertaller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.tecsup.authservertaller.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT u FROM Usuario u WHERE u.username=:username AND u.password=:password")
    Usuario findByUsernameAndPassword(@Param("username") String username,
                                      @Param("password") String password);
    @Query("SELECT u FROM Usuario u WHERE u.username=:username")
    Usuario findByUsername(@Param("username") String username);
}
