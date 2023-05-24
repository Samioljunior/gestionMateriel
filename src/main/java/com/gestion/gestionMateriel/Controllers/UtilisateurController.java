package com.gestion.gestionMateriel.Controllers;

import com.gestion.gestionMateriel.models.Utilisateur;
import com.gestion.gestionMateriel.services.UtilisateurService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UtilisateurController {
    @Autowired
    UtilisateurService utilisateurService;


    @RequestMapping("/createUtilisateur")
    public String createUtilisateur(){
        return  "CreateUtilisateur";
    }

    @RequestMapping("/saveUtilisateur")
    public String saveUtilisateur(@Valid Utilisateur u, BindingResult bindingResult){
        if (bindingResult.hasErrors() ) return "CreateUtilisateur";
        utilisateurService.saveUtilisateur(u);
        return "CreateUtilisateur";
    }

    @RequestMapping("/listUtilisateurs")
    public String ListUtilisateurs(ModelMap modelMap){
        List<Utilisateur> utilisateursController = utilisateurService.getAllUtilisateurs();
        modelMap.addAttribute("utilisateursJsp",utilisateursController);
        return "ListUtilisateurs";
    }

    @RequestMapping("/deleteUtilisateur")
    public String deleteUtilisateur(@RequestParam("id") Long id, ModelMap modelMap){
        utilisateurService.deleteUtilisateurById(id);
        List<Utilisateur> utilisateursController = utilisateurService.getAllUtilisateurs();
        modelMap.addAttribute("utilisateursJsp",utilisateursController);
        return "ListUtilisateurs";
    }

    @RequestMapping("/showUtilisateur")
    public String showUtilisateur(@RequestParam("id") Long id, ModelMap modelMap){
        Utilisateur utilisateursController = utilisateurService.getUtilisateur(id);
        modelMap.addAttribute("utilisateursJsp", utilisateursController);
        return "EditUtilisateur";
    }

    @RequestMapping("/updateUtilisateur")
    public String updateUtilisateur(@ModelAttribute("utilisateur") Utilisateur utilisateur){
        utilisateurService.saveUtilisateur(utilisateur);
        return "CreateUtilisateur";
    }
    @RequestMapping("/")
    public String Home(ModelMap modelMap) {
        List<Utilisateur> utilisateursController = utilisateurService.getAllUtilisateurs();
        modelMap.addAttribute("utilisateursJsp", utilisateursController);
        return "ListUtilisateurs";


    }


}