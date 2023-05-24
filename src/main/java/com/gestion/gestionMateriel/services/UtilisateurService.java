package com.gestion.gestionMateriel.services;

import com.gestion.gestionMateriel.models.Utilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service public interface UtilisateurService {
    Utilisateur saveUtilisateur(Utilisateur u);
    Utilisateur updateUtilisateur(Utilisateur u);
    Utilisateur getUtilisateur(Long id);
    void deleteUtilisateurById(Long id);
    void deleteAllUtilisateurs();
    List<Utilisateur> getAllUtilisateurs();

}
