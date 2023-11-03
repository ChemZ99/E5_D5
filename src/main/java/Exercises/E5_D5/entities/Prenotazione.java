package Exercises.E5_D5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Builder(builderClassName = "PrenotazioneBuilder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prenotazione {
    
}
