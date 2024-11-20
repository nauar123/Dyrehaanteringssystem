public class  Pattedyr extends Dyr{

    public Pattedyr(){}


    public Pattedyr(String navn, String type)
    {
        super(navn, type);
    }

    @Override
    public String givLyd()
    {
        return "Pattedyr lyd";
    }
}
