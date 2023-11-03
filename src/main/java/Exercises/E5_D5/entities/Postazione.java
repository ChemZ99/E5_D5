package Exercises.E5_D5.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "Postazione")
@Builder(builderClassName = "PostazioneBuilder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue
    private UUID Id;
    @Column
    private TipoPostazione tipo;
    @Column
    private int partecipantiMax;
    @ManyToOne
    @JoinColumn(name = "Edificio_id")
    private Edificio edificio;
}
