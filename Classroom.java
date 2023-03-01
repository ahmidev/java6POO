public class Classroom {

    public static void main(String[] args) {

        // toto receives a reference to a new instance of the Wilder class
        Wilder toto = new Wilder("Toto", true); 
        
        Wilder titi = new Wilder("Titi", false);  
       
        // instance method
       
        System.out.println(toto.whoAmI());
        System.out.println(titi.whoAmI());

       
    }
}

