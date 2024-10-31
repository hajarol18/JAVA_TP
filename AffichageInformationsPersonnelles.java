class Personne {
    String nom;
    int age;

    Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Age: " + age);
    }
}

public class AffichageInformationsPersonnelles {
    public static void main(String[] args) {
        Personne personne = new Personne("Jean Dupont", 25); 
        personne.afficherInfos();
    }
}
