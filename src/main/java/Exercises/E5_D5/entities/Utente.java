package Exercises.E5_D5.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table
@Builder(builderClassName = "UtenteBuilder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utente {
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private String username;
    @Column
    private String fullname;
    @Column
    private String email;
}
