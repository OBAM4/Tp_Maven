package ma.eheio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProduitService service = new ProduitService();

        Produit produit = new Produit(1,"OMO",5.55,20);
        Produit produit1 = new Produit(2,"matique",77.55,2);

        service.add(produit);
        service.add(produit1);

        service.Delete(1);
        service.ReadAll();

        Produit updateProduct = new Produit(11,"audi",11111,1);
        service.update(updateProduct);
        service.ReadAll();




    }
}