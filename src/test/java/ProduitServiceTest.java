import ma.eheio.Produit;
import ma.eheio.ProduitService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class ProduitServiceTest {

    ProduitService produitService;


    @Before
    public void before() {
        produitService =new ProduitService();
    }

   /* @After
    public void after()
    {
        this.produitService = null;
    }*/

    @Test
    public void testAjoutEtRecupererProduit() {
        int produitId = 1;
        Produit produit = new Produit((long)produitId, "walid", 500.0, 10);
        produitService.add(produit);
    }
    @Test
    public void testMiseAJourProduit() {
        int produitId = 1;
        Produit produit = new Produit((long)produitId, "walid", 40.0, 8);
        produitService.add(produit);
        Produit pModifier = new Produit((long)produitId, "yassir", 20.0, 25);
        produitService.update(pModifier);
    }

    @Test
    public void testSupprimerProduit() {
        int produitId = 8;
        Produit produit = new Produit((long)produitId, "alo", 2.0, 70);
        produitService.add(produit);
        produitService.Delete((long)produitId);
    }
    @Test
    public void testRecupererTousProduits() {
        Produit produit1 = new Produit(1, "qq", 2, 44);
        Produit produit2 = new Produit(2, "Y", 4, 2);
        produitService.add(produit1);
        produitService.add(produit2);
        ArrayList<Produit> produits = produitService.GetAll();
        Assert.assertTrue(produits.contains(produit1) && produits.contains(produit2));

    }

}
