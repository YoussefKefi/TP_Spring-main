package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Projet;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.ProjetRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetServiceImp implements IProjetService {
    ProjetRepository projetRepository;

    @Override
    public Projet addProjetAndProjetDetailAndAssign(Projet projet) {
        return projetRepository.save(projet);
    }
    @Override
    public List<Projet> retrieveAllProjet() {
        return projetRepository.findAll();
    }

    @Override
    public Projet retrieveProjet(Long projetId) {
        return projetRepository.findById(projetId).get();
    }

    @Override
    public Projet addProjet(Projet b) {
        return projetRepository.save(b);
    }

    @Override
    public void removeProjet(Long projetId) {
        projetRepository.deleteById(projetId);
    }

    @Override
    public Projet modifyProjet(Projet projet) {
        return projetRepository.save(projet);
    }
}
