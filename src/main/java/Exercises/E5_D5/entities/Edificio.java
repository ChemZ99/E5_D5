package Exercises.E5_D5.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Edificio")
@Builder(builderClassName = "EdificioBuilder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Edificio {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String nome;
    @Column
    private String indirizzo;
    @Column
    private String citta;
    @Column
    @OneToMany(mappedBy = "Edificio")
    private List<Postazione> postazioni;
}
