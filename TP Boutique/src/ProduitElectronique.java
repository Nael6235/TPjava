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
