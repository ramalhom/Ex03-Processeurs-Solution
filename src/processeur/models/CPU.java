package processeur.models;

import java.text.DecimalFormat;

/**
 * Application "CPU".
 *
 * Cette classe représente un CPU d'un ordinateur.
 *
 * @author <a href="mailto:friedlip@edufr.ch">Paul Friedli</a>
 * @since 18 octobre 2023
 * @version 0.1
 */
public class CPU {

    /**
     * Cette constante (-1.0) représente une performance MIPS (Millions Instructions
     * Per Second) inconnue.
     */
    public static final double UNKNOWN_MIPS = -1.0;

    /**
     * Attribut qui représente le nom du CPU.
     */
    private final String nom;
    /**
     * Attribut qui représente l'année de sortie du CPU.
     */
    private final int annee;
    /**
     * Attribut qui représente le nombre de transistors utilisés dans le CPU.
     */
    private final long transistors;
    /**
     * Attribut qui représente la performance en MIPS (Millions Instructions Per
     * Second) du CPU.
     */
    private final double mips;

    /**
     * Constructeur de la classe CPU à utiliser lorsqu'on connaît la valeur de
     * chaque attribut.
     *
     * @param nom         le nom du CPU
     * @param annee       l'année de sortie du CPU
     * @param transistors le nombre de transistors utilisés dans le CPU
     * @param mips        la performance en MIPS (Millions Instructions Per Second)
     *                    du CPU
     */
    public CPU(String nom, int annee, long transistors, double mips) {
        this.nom = nom;
        this.annee = annee;
        this.transistors = transistors;
        this.mips = mips;
    }

    /**
     * Constructeur de la classe CPU à utiliser lorsqu'on ne connaît pas la
     * performance du CPU. Dans ce cas, l'attribut
     * "mips" sera initialisé avec la valeur UNKNOWN_MIPS pour indiquer que cette
     * information n'est pas connue.
     *
     * @param nom         le nom du CPU
     * @param annee       l'année de sortie du CPU
     * @param transistors le nombre de transistors utilisés dans le CPU
     */
    public CPU(String nom, int annee, long transistors) {
        this.nom = nom;
        this.annee = annee;
        this.transistors = transistors;
        this.mips = UNKNOWN_MIPS;
    }

    /**
     * Getter de l'attribut nom.
     *
     * @return la valeur de l'attribut nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter de l'attribut annee.
     *
     * @return la valeur de l'attribut annee
     */

    public int getAnnee() {
        return annee;
    }

    /**
     * Getter de l'attribut transistors.
     *
     * @return la valeur de l'attribut transistors
     */
    public long getTransistors() {
        return transistors;
    }

    /**
     * Getter de l'attribut mips.
     *
     * @return la valeur de l'attribut mips
     */
    public double getMips() {
        return mips;
    }

    
    /** 
     * Méthode d'affichage de notre CPU. Cette méthode est appelée automatiquement par la méthode println() de la classe System.out.
     * 
     * @return String
     */
    @Override
    public String toString() {
        // Création d'un objet DecimalFormat en lui donnant le format souhaité pour les entiers
        DecimalFormat myDecimalFormatter = new DecimalFormat("#,###");

        // Création d'un objet DecimalFormat en lui donnant le format souhaité pour les nombres réels
        DecimalFormat myFloatFormatter = new DecimalFormat("#,##0.00");

        String cpuEnUnString = "";
        if (mips == UNKNOWN_MIPS) {
            cpuEnUnString = "En " + annee + " le CPU " + nom + " avec " + myDecimalFormatter.format(transistors) +
                    " transistors et une puissance de calcul inconnue.";
        } else {
            cpuEnUnString = "En " + annee + " le CPU " + nom + " avec " + myDecimalFormatter.format(transistors) +
                    " transistors et une puissance de calcul de " + myFloatFormatter.format(mips) + " mips.";
        }
        return cpuEnUnString;
    }

}
