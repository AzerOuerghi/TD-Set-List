import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Etudiant {
    private int id;
    private String nom;
    private String prenom;

    public Etudiant() {
        // Constructeur sans paramètre
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return id == etudiant.id;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

interface University {
    void ajouterEtudiant(Etudiant e);

    boolean rechercherEtudiant(Etudiant e);

    boolean rechercherEtudiant(String nom);

    void supprimerEtudiant(Etudiant e);

    void displayEtudiants();

    void trierEtudiantsParId();

    void trierEtudiantsParNom();
}

class EspritVector implements University {
    private Vector<Etudiant> etudiants = new Vector<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : etudiants) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants, Comparator.comparing(Etudiant::getId));
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, Comparator.comparing(Etudiant::getNom));
    }
}

class EspritArrayList implements University {
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : etudiants) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants, Comparator.comparing(Etudiant::getId));
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, Comparator.comparing(Etudiant::getNom));
    }
}

