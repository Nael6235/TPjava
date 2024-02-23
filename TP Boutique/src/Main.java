import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Produit {
    private String nom;
    private String description;
    private int prix;

    public Produit(String nom, String description, int prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Description : " + description);
        System.out.println("Prix : " + prix);
    }
}

class ProduitElectronique extends Produit {
    private int dureeGarantie;

    public ProduitElectronique(String nom, String description, int prix, int dureeGarantie) {
        super(nom, description, prix);
        this.dureeGarantie = dureeGarantie;
    }

    public int getDureeGarantie() {
        return dureeGarantie;
    }

    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Durée de garantie : " + dureeGarantie + " mois");
    }
}

class ProduitAlimentaire extends Produit {
    private LocalDate dateExpiration;

    public ProduitAlimentaire(String nom, String description, int prix, LocalDate dateExpiration) {
        super(nom, description, prix);
        this.dateExpiration = dateExpiration;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Date d'expiration : " + dateExpiration);
    }
}

class ProduitBoisson extends Produit {
    private int quantite;

    public ProduitBoisson(String nom, String description, int prix, int quantite) {
        super(nom, description, prix);
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Quantité : " + quantite + " cl");
    }
}

class Main {
    public static void main(String[] args) {
        // Création d'une liste pour stocker les produits
        List<Produit> produits = new ArrayList<>();

        // Création de différents types de produits
        ProduitElectronique produitElectronique = new ProduitElectronique("Téléphone", "Smartphone dernier cri", 1000, 12);
        ProduitAlimentaire produitAlimentaire = new ProduitAlimentaire("Lait", "Lait demi-écrémé", 2, LocalDate.of(2024, 2, 28));
        ProduitBoisson produitBoisson = new ProduitBoisson("Eau minérale", "Eau gazeuse", 1, 1000);

        // Ajout des produits à la liste
        produits.add(produitElectronique);
        produits.add(produitAlimentaire);
        produits.add(produitBoisson);

        // Affichage du stock de produits
        System.out.println("Stock de la boutique : ");
        for (Produit produit : produits) {
            produit.afficher();
            System.out.println();
        }
    }
}


