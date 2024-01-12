package ma.eheio;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
public class ProduitService {

    public static ArrayList<Produit> ListeProducts=new ArrayList<Produit>();//Liste Des Products

    //Update Is Done

    public  void update(Produit pr)
    {

        for(int i = 0; i < ListeProducts.size(); i++) {
            if(ListeProducts.get(i).getId() == pr.getId()) {
                ListeProducts.set(i, pr);
                return;
            }
        }
        throw new IllegalArgumentException("product not exist");

    }

    public void add(Produit pr) {
        for (Produit existingProduct : ListeProducts) {
            if (existingProduct.getId() == pr.getId()) {
                update(pr);
                return;
            }
        }
        ListeProducts.add(pr);
    }

    public  void Delete(long id)
    {

        for(int i = 0; i < ListeProducts.size(); i++) {
            if(ListeProducts.get(i).getId() == id) {
                ListeProducts.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("Le produit recherché n'existe pas");
    }
    //ReadAll Is Done
    public  void ReadAll()
    {
        for(int i=0;i<ListeProducts.size();i++)
        {
            System.out.println(ListeProducts.get(i));
        }

        System.out.println("============================");
    }
    public ArrayList<Produit> GetAll(){
        return ListeProducts;
    }


    //Verify Is Done
    private void  verify(Produit pr)
    {
        if(pr.getQnt() < 0 || pr.getPrix() < 0) {
            throw new IllegalArgumentException (
                    "La quantité et le prix du produit doivent toujours être positifs"
            );
        }
    }
}
