public class Fisk extends Dyr {

    public Fisk(){}

    public Fisk(String navn, String type)
    {
        super(navn, type);
    }

    @Override
    public String givLyd()
    {
        return "Fiske lyd";
    }

    public String svoem()
    {
        return "Hajen kan svømme";
    }
}
