package pe.edu.tecsup.authservertaller.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String nombres;
    private String correo;
    private String imagen;
    private String estado;
    private String token;
}
