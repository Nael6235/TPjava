class Boutique {
    private List<Produit> produits;

    public Boutique() {
        produits = new ArrayList<>();
    }

    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void afficherStock() {
        System.out.println("Stock de la boutique : ");
        for (Produit produit : produits) {
            produit.afficher();
            System.out.println();
        }
    }
}