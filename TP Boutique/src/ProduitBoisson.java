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
