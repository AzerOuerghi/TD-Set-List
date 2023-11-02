
class Main {
    public static void main(String[] args) {
        Enseignant enseignant1 = new Enseignant(144, "Smith", "John");
        Enseignant enseignant2 = new Enseignant(24, "Johnson", "Alice");
        Enseignant enseignant3 = new Enseignant(4, "Doe", "Jane");

        GestionEnseignant espritHashSet = new EspritHashSet();
        espritHashSet.ajouterEnseignant(enseignant1);
        espritHashSet.ajouterEnseignant(enseignant2);
        espritHashSet.ajouterEnseignant(enseignant3);

        System.out.println("Liste des enseignants dans EspritHashSet:");
        espritHashSet.displayEnseignants();

        System.out.println("\nRecherche d'enseignant par ID (2): " + espritHashSet.rechercherEnseignant(2));

        GestionEnseignant espritTreeSet = new EspritTreeSet();
        espritTreeSet.ajouterEnseignant(enseignant3);
        espritTreeSet.ajouterEnseignant(enseignant1);
        espritTreeSet.ajouterEnseignant(enseignant2);

        System.out.println("\nListe des enseignants triés par ID dans EspritTreeSet:");
        espritTreeSet.displayEnseignants();



        Etudiant etudiant1 = new Etudiant(44, "Smith", "John");
        Etudiant etudiant2 = new Etudiant(4, "Johnson", "Alice");
        Etudiant etudiant3 = new Etudiant(9, "Doe", "Jane");

        University espritVector = new EspritVector();
        espritVector.ajouterEtudiant(etudiant1);
        espritVector.ajouterEtudiant(etudiant2);
        espritVector.ajouterEtudiant(etudiant3);

        System.out.println("Liste des étudiants avant le tri par ID:");
        espritVector.displayEtudiants();

        espritVector.trierEtudiantsParId();
        System.out.println("\nListe des étudiants triés par ID:");
        espritVector.displayEtudiants();

        System.out.println("\nRecherche d'étudiant par nom (Doe) : " + espritVector.rechercherEtudiant("Doe"));

        University espritArrayList = new EspritArrayList();
        espritArrayList.ajouterEtudiant(etudiant1);
        espritArrayList.ajouterEtudiant(etudiant2);
        espritArrayList.ajouterEtudiant(etudiant3);

        System.out.println("\nListe des étudiants dans EspritArrayList avant le tri par nom:");
        espritArrayList.displayEtudiants();

        espritArrayList.trierEtudiantsParNom();
        System.out.println("\nListe des étudiants triés par nom dans EspritArrayList:");
        espritArrayList.displayEtudiants();
    }}


