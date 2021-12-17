package BuilderEx;

public class Main {
    public static void main(String[] args) {
      //  Pizza p = new Pizza(false, true, true, false, "medie", "pufos");
        
// Pizza p = new Pizza("medie", "pufos");
//        p.setMozzarella(true);
//        System.out.println(p); //folosesc obiectul inainte de a-i modifica atributele
//        p.setPepperoni(true);
        Pizza p = new Pizza.Builder("medie", "pufos").mozzarella().pepperoni().build();
        System.out.println(p);
    }
}
