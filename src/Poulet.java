//class Poulet
public class Poulet extends Volaille {
    protected static float prixaukilo=5.2f;
    protected static float poidAbattage=1.1f;

    public Poulet(String id, float poids) {
        super(id, poids);
    }

    public void setTokill() {
        if (this.poids>=poidAbattage)
            this.tokill=true;
        else
            this.tokill=false;
    }

    public float getPrix() {
        return this.poids*prixaukilo;
    }

        
}
