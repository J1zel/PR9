

public class Verification extends Exception
{
    public Verification(Account client)
    {
        super("ИНН: "+client.getName()+"  недействителен.");
    }

    public Verification(String message)
    {
        super(message);
    }

    public String toString(Account client)
    {
        return ("ИНН: "+client.getName()+"  недействителен.");
    }
}
