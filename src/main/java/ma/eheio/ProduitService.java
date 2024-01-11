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

    public static List<Produit> ListeProducts=new ArrayList<Produit>();//Liste De Products

    //Update Is Done

    public static void update(Produit pr)
    {
        try {
            int m = ProduitService.verify(pr.getNom(),pr.getId());
            if(m==1)
            {
                for (int i=0;i<ListeProducts.size();i++)
                {
                    Produit p=ListeProducts.get(i);
                    if(p.getId()==pr.getId())
                    {
                        p.setNom(pr.getNom());
                        p.setPrix(pr.getPrix());
                        p.setQnt(pr.getQnt());
                        System.out.println("Bien Modifier");
                        break;
                    }
                }


            }else{
                System.out.println("Non Existe");
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }


    //Add Is Done
    public static void add(Produit pr)
    {
        try {
            int m = ProduitService.verify(pr.getNom(),pr.getId());
            if(m==0)
            {
                   ListeProducts.add(pr);

                   System.out.println("Bien Ajouter");
            }else{
                System.out.println("Deja Existe");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Delete(Produit pr)
    {
        try {
            int m = ProduitService.verify(pr.getNom(),pr.getId());
            if(m==1)
            {
                for (int i=0;i<ListeProducts.size();i++)
                {
                    Produit p=ListeProducts.get(i);
                    if(p.getId()==pr.getId())
                    {
                        ListeProducts.remove(pr);
                        System.out.println("Bien Supprimer");
                        break;
                    }
                }
            }else{
                System.out.println("Non Existe");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //ReadAll Is Done
    public static void ReadAll()
    {
        try {
            for (Produit Pr : ListeProducts) {
                System.out.println("****************");
                System.out.println(Pr.getId());
                System.out.println(Pr.getNom());
                System.out.println(Pr.getPrix());
                System.out.println(Pr.getQnt());
                System.out.println("****************");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Verify Is Done
    private static int verify(String nm,Long id) throws Exception {
        int a = 1;
        for (int i=0;i<ListeProducts.size();i++)
        {
            Produit p=ListeProducts.get(i);
            if(p.getId()!=id)
            {  if(p.getNom()!=nm)
                {
                    a=0;
                    break;
                }
            }
        }
        return a;
    }

}
