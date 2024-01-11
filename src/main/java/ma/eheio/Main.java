package ma.eheio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Produit pr=new Produit();
      pr.setQnt(12);
      pr.setId(500000000000L);
      pr.setNom("Hamid");
      pr.setPrix(13.6);
      ProduitService.ListeProducts.add(pr);
      ProduitService.ReadAll();
    }
}