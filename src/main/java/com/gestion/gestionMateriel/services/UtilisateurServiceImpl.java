package com.gestion.gestionMateriel.services;

import com.gestion.gestionMateriel.models.Utilisateur;
import com.gestion.gestionMateriel.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur saveUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @Override
    public Utilisateur getUtilisateur(Long id) {
        return utilisateurRepository.findById(id).get();
    }

    @Override
    public void deleteUtilisateurById(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public void deleteAllUtilisateurs() {
        utilisateurRepository.deleteAll();
    }

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }


}
