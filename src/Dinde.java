public class Dinde extends Volaille{
    protected static float prixaukilo=6.5f;
    protected static float poidAbattage=1.8f;

    public Dinde(String id, float poids) {
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
