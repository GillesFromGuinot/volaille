public class App {
    public static void main(String[] args) throws Exception {
        Elevage e=new Elevage();

        //création des volailles
        for(int i=0; i<10; i++) {
            e.add(new Poulet("poulet" + i,(float)Math.random()*2));
            e.add(new Canard("canard" + i,(float)Math.random()*3));
        }

        //défini les volaille à abattre
        e.validerAbattage();

        System.out.println(e);

        //affiche le montant obtenu
        System.out.println(e.getPrixTotal());
        
    }
}
