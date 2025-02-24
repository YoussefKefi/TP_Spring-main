package tn.esprit.examen.nomPrenomClasseExamen.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Projet {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String sujet;

    @OneToOne(cascade = CascadeType.ALL)
    private ProjetDetail projetDetail;

    @ManyToMany(mappedBy = "projets", cascade = CascadeType.ALL)
    private List<Equipe> equipes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }
}
