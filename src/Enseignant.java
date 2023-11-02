import java.util.HashSet;
import java.util.TreeSet;

class Enseignant {
    private int id;
    private String nom;
    private String prenom;

    public Enseignant() {
        // Constructeur sans paramètre
    }

    public Enseignant(int id, String nom, String prenom) {
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
        Enseignant enseignant = (Enseignant) o;
        return id == enseignant.id;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

interface GestionEnseignant {
    void ajouterEnseignant(Enseignant e);

    boolean rechercherEnseignant(Enseignant e);

    boolean rechercherEnseignant(int id);

    void supprimerEnseignant(Enseignant e);

    void displayEnseignants();
}

class EspritHashSet implements GestionEnseignant {
    private HashSet<Enseignant> enseignants = new HashSet<>();

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : enseignants) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Enseignant e : enseignants) {
            System.out.println(e);
        }
    }
}

class EspritTreeSet implements GestionEnseignant {
    private TreeSet<Enseignant> enseignants = new TreeSet<>((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));

    @Override
    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (Enseignant e : enseignants) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (Enseignant e : enseignants) {
            System.out.println(e);
        }
    }
}
