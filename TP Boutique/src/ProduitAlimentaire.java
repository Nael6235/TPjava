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