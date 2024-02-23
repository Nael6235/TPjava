class Panier {
    private List<Produit> produits;

    public Panier() {
        produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public int prixTotalPanier() {
        int total = 0;
        for (Produit produit : produits) {
            total += produit.getPrix();
        }
        return total;
    }
}
