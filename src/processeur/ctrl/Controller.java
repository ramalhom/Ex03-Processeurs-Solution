package processeur.ctrl;

import processeur.models.CPU;
import processeur.services.ServiceCPU;
import processeur.views.View;

/**
 * Controller de notre application MVC "Processeur".
 *
 * Cette classe représente le contrôleur de notre application MVC "Processeur".
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 18 octobre 2023
 * @version 0.1
 */
public class Controller {

     /**
     * Référence à la vue MVC de notre application.
     */
    private View refView;

    /**
     * Référence au service CPU de notre application.
     */
    private ServiceCPU refServiceCPU;

    /**
     * Constructeur de la classe Controller. Les attributs de la classe Controller sont initialisés à null.
     */
    public Controller() {
        this.refView = null;
        this.refServiceCPU = null;
    }

    /**
     * Méthode permettant de démarrer le contrôleur et donc la logique du programme.
     */
    public void start() {

        // Ajouter les CPUS connus
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel 4004", 1971, 2300, 0.06));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel 8088", 1972, 3500, 0.06));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel 8086", 1978, 29000, 0.33));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel 80286", 1982, 134000, 1));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel 80386", 1985, 275000, 5));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel 80486", 1989, 1200000, 20));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel Pentium 1", 1993, 3100000, 100));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel Pentium 2", 1997, 7500000, 300));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel Pentium 3", 1999, 9500000, 510));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel Pentium 4", 2000, 42000000, 1700));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel Pentium 4 D (Prescott)", 2004, 125000000, 9000));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel Core 2 Duo (Conroe)", 2006, 291000000, 22000));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel Core i7 (Quad)", 2008, 731000000, 82300));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel Core i7 (Gulftown)", 2010, 1170000000, 147600));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Intel Core i7 (Haswell-E)", 2014, 2600000000L, 238310));
        getRefServiceCPU().ajouterUnNouveau(new CPU("Oracle SPARC M7", 2015, 10000000000L));

        // Demander la taille de notre liste de CPU
        int tailleListeCPU = getRefServiceCPU().tailleDeLaListe();

        // Demander le nombre d'éléments contenus dans notre liste
        int nbreElementsDansListeCPU = getRefServiceCPU().nombreDeCPUDansLaListe();

        // Débuter un nouveau rapport pour l'utilisateur
        getRefView().rapport_Debut();

        // Passer en revue chaque CPU de notre liste
        for (int i = 0; i < tailleListeCPU; i++) {
            // Mettre la main sur ce CPU-là
            CPU cpu = getRefServiceCPU().obtenirUnElement(i);
            // Y a-t-il un CPU ?
            if (cpu != null) {
                // Oui. Alors l'afficher !
                getRefView().rapport_AfficherCPU(cpu);
            }
        }

        // Terminer le nouveau rapport pour l'utilisateur
        getRefView().rapport_Fin();
    }

    /**
     * Getter de la référence à la vue de l'application MVC "Processeur".
     *
     * @return la référence à la vue de l'application MVC "Processeur"
     */
    public View getRefView() {
        return refView;
    }

    /**
     * Setter de la référence à la vue de l'application MVC "Processeur".
     *
     * @param refView référence à la vue de l'application MVC "Processeur"
     */
    public void setRefView(View refView) {
        this.refView = refView;
    }

    /**
     * Getter de la référence au service CPU de l'application MVC "Processeur".
     *
     * @return la référence au service CPU de l'application MVC "Processeur"
     */
    public ServiceCPU getRefServiceCPU() {
        return refServiceCPU;
    }

    /**
     * Setter de la référence au service CPU de l'application MVC "Processeur".
     *
     * @param refServiceCPU référence au service CPU de l'application MVC "Processeur"
     */
    public void setRefServiceCPU(ServiceCPU refServiceCPU) {
        this.refServiceCPU = refServiceCPU;
    }

}