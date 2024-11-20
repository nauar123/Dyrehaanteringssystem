public class Main {
    public static void main(String[] args) {

        Dyr[] dyr = new Dyr[3];

        Pattedyr Peter= new Pattedyr("Peter", "Hund");
        dyr [0] = Peter;

        Fugl Hans = new Fugl("Hans", "Falk");
        dyr [1] = Hans;


        System.out.println(Hans.flyv());

        Fisk Haj = new Fisk("Haj", "Haj");
        dyr [2] = Haj;
        System.out.println(Haj.svoem());

        for(int i = 0; i < dyr.length; i++)
        {
            System.out.println(dyr[i].getNavn() + " " + dyr[i].givLyd());
        }



    }
}