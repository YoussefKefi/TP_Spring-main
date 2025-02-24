package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.ProjetDetail;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.ProjetDetailRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjetDetailServiceImp implements IProjetDetailService {
    ProjetDetailRepository projetDetailRepository;
    @Override
    public List<ProjetDetail> retrieveAllProjetDetail() {
        return projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail retrieveProjetDetail(Long projetDetailId) {
        return projetDetailRepository.findById(projetDetailId).get();
    }

    @Override
    public ProjetDetail addProjetDetail(ProjetDetail b) {
        return projetDetailRepository.save(b);
    }

    @Override
    public void removeProjetDetail(Long projetDetailId) {
        projetDetailRepository.deleteById(projetDetailId);
    }

    @Override
    public ProjetDetail modifyProjetDetail(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }
}
