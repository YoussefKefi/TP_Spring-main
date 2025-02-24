package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Equipe;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Projet;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
