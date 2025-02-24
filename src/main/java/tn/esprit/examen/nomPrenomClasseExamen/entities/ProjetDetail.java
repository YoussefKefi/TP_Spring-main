package tn.esprit.examen.nomPrenomClasseExamen.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class ProjetDetail {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String description;
    String technologie;
    Long cout;
    Date dateDebut;

    @OneToOne(mappedBy = "projetDetail")
    @ToString.Exclude
    @JsonIgnore
    private Projet projet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnologie() {
        return technologie;
    }

    public void setTechnologie(String technologie) {
        this.technologie = technologie;
    }

    public Long getCout() {
        return cout;
    }

    public void setCout(Long cout) {
        this.cout = cout;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
}
