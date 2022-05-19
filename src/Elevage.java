import java.util.ArrayList;

public class Elevage extends ArrayList<Volaille> {

    public Elevage() {
        super();    
    }

    //défini pour chaque volaille la valeur de tokill
    public void validerAbattage() {
        for(Volaille v : this) {            
            v.setTokill();
        }
    }

    public float getPrixTotal() {
        float montant=0f;
        for(Volaille v : this) {           
            montant+=v.getPrix();
        }
        return montant;
    }

    @Override
    public String toString() {
        String s="";
        for(Volaille v : this) 
            s+=v + "\n";

        return s;
    }

    
    
}
