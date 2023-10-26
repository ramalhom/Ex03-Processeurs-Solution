package processeur.services;

import processeur.ctrl.Controller;
import processeur.models.CPU;

/**
 * Service de notre application MVC "Processeur" pouvant gérer des CPUs.
 *
 * Cette classe représente le service CPU de notre application MVC "Processeur".
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 18 octobre 2023
 * @version 0.1
 */
public class ServiceCPU {

    public static final int NBRE_CPU = 20;

    private CPU[] cpus;
    private Controller refCtrl;

    /**
     * Constructeur de la classe ServiceCPU. Les attributs de la classe ServiceCPU
     * sont initialisés.
     */
    public ServiceCPU() {
        cpus = new CPU[NBRE_CPU];
        refCtrl = null;
    }

    /**
     * Cette méthode permet de stocker un nouveau CPU dans notre liste. La liste
     * étant un tableau de taille fixe, au
     * bout d'un moment celui-ci sera plein et ne pourra donc plus accueillir de
     * nouveau objets. Cette méthode indique
     * par sa valeur de retour si elle a réussi à faire le travail demandé.
     * 
     * @param cpu le nouveau CPU à stocker dans notre liste
     * @return vrai si une place libre a été trouvée dans notre liste de cpus
     */
    public boolean ajouterUnNouveau(CPU cpu) {
        boolean resultat = false;

        // On va chercher une place libre (pas d'objet => null) dans notre tableau
        for (int i = 0; i < cpus.length; i++) {
            // Cette emplacement est-il libre ?
            if (cpus[i] == null) {
                // Oui, alors stocker l'objet à cet endroit-là
                cpus[i] = cpu;
                // On a trouvé une place libre et stocké l'objet reçu. Inutile de continuer à
                // chercher.
                resultat = true;
                break;
            }
        }
        return resultat;
    }

    /**
     * Cette méthode permet d'obtenir la liste actuelle de nos CPU.
     *
     * @return la liste des CPUs
     */
    public CPU[] obtenirLaListe() {
        return cpus;
    }

    /**
     * Cette méthode permet de connaître le nombre de CPUs contenus dans notre
     * liste.
     *
     * @return le nombre de CPUs contenus dans notre liste
     */
    public int nombreDeCPUDansLaListe() {
        int resultat = 0;

        // On va parcourir notre liste à la recherche d'objet non null dans notre
        // tableau
        for (int i = 0; i < cpus.length; i++) {
            // Il y a t'il un objet ?
            if (cpus[i] != null) {
                // Oui, alors on peut incrémenter notre résultat pour compter le nombre
                // d'élément
                resultat++;
            }
        }
        return resultat;
    }

    /**
     * Cette méthode permet de connaître la taille de la liste de CPU (et donc le
     * nombre maximum d'éléments qu'on peut y
     * mettre).
     *
     * @return la taille de la liste de CPU
     */
    public int tailleDeLaListe() {
        return cpus.length;
    }

    
    /** 
     * Cette méthode permet d'obtenir un CPU de notre liste en fonction de son indice.
     * 
     * @param indice l'indice du CPU à obtenir se trouvant dans notre tableau
     * @return CPU le CPU demandé ou null si l'indice ne se trouve pas dans les limites du tableau
     */
    public CPU obtenirUnElement(int indice) {
        CPU resultat = null;

        // Vérifier si l'indice se trouve bien dans les limites du tableau cpus
        if ((indice >= 0) && (indice < cpus.length)) {
            // Affecter au résultat le cpu avec l'indice demandé
            resultat = cpus[indice];
        }

        return resultat;
    }

    /**
     * Getter de la référence au contrôleur de l'application MVC2 "Processeur".
     *
     * @return la référence au contrôleur de l'application MVC2 "Processeur"
     */
    public Controller getRefCtrl() {
        return refCtrl;
    }

    /**
     * Setter de la référence au contrôleur de l'application MVC2 "Processeur".
     *
     * @param refCtrl référence au contrôleur de l'application MVC2 "Processeur"
     */
    public void setRefCtrl(Controller refCtrl) {
        this.refCtrl = refCtrl;
    }

}