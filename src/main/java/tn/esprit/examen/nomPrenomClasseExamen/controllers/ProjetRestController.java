package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.Projet;
import tn.esprit.examen.nomPrenomClasseExamen.services.ProjetServiceImp;
import tn.esprit.examen.nomPrenomClasseExamen.services.IProjetService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/projet")
public class ProjetRestController {
    IProjetService projetService;
    @PostMapping("/ajouter-projet-et-projet-detail")
    public Projet addProjetAndProjetDetail(@RequestBody Projet p) {
        Projet projet = projetService.addProjetAndProjetDetailAndAssign(p);
        return projet;
    }
    @Autowired
    public ProjetRestController(IProjetService projetService){
        this.projetService = projetService;
    }

    @GetMapping("/retrieve-all-projets")
    public List<Projet> getProjets() {
        return projetService.retrieveAllProjet();
    }

    @GetMapping("/retrieve-projet/{projet-id}")
    public Projet retrieveProjet(@PathVariable("projet-id") long chId) {
        return projetService.retrieveProjet(chId);
    }

    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet c){
        return projetService.addProjet(c);
    }

    @DeleteMapping("/remove-projet/{projet-id}")
    public void removeProjet(@PathVariable("projet-id") long chId) {
        projetService.removeProjet(chId);
    }

    @PutMapping("/modify-projet")
    public Projet modifyProjet(@RequestBody Projet c) {
        Projet projet = projetService.modifyProjet(c);
        return projet;
    }
    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long proejtId,
                                            @PathVariable("projet-details-id") Long proejtDetailsId) {
        projetService.assignProjetDetailToProjet(proejtId, proejtDetailsId);
    }
}
