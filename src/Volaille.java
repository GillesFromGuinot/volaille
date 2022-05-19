abstract public class Volaille {
    protected String id;
    protected float poids;
    protected boolean tokill;

    public Volaille(String id, float poids) {
        this.id = id;
        this.poids = poids;
        this.tokill = false;
    }

    abstract public void setTokill(); 

    abstract public float getPrix();
    
    @Override
    public String toString() {
        return "Volaille [id=" + id + ", poids=" + poids + ", tokill=" + tokill + "]";
    }

    
}
