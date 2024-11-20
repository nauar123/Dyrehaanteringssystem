public abstract class  Dyr {

    // artiputter/ variabler
    protected String navn;
    protected String type;

    // default constructor
    public Dyr(){}

    // Constructor med parameterene navn og type
    public Dyr(String navn, String type)
    {
        this.navn = navn;
        this.type = type;
    }

    //
    public String givLyd()
    {
       return "Ubestemt dyrelyd";
    }

    public String getNavn()
    {
        return navn;
    }

    public String getType()
    {
        return type;
    }
}
