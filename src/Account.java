
public class Account
{
    private String INN;
    private String name;

    public Account(String INN, String name)
    {
        this.INN = INN;
        this.name = name;
    }
    public String getINN()
    {
        return INN;
    }

    public String getName()
    {
        return name;
    }
    public void CheckINN(String inn) throws Verification
    {
        if(inn.length()!=10)
            throw new Verification(this);
    }

    public static void main(String[] args)
    {
        Account client=new Account("12345678912","Кириленко В.И.");
        try {
            client.CheckINN(client.getINN());
            System.out.println(client.getName());
        } catch (Verification e) {
            System.out.println(e.getMessage());;
        }

        Account client1=new Account("7645453534","Шевцов А.Е.");
        try {
            client1.CheckINN(client1.getINN());
            System.out.println("ИНН: "+client1.getName()+" действителен.");
        } catch (Verification e) {
            System.out.println(e.getMessage());;
        }

        Account client2=new Account("123","Курилов Е.А.");
        try {
            client2.CheckINN(client2.getINN());
            System.out.println(client2.getName());
        } catch (Verification e) {
            System.out.println(e.getMessage());
        }
    }
}
