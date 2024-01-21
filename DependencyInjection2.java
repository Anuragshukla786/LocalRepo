class Nikhil
{
    private Nit h;
    public Nikhil(Nit h)
    {
        this.h=h;
    }
    public void name()
    {
        h.boy();
    }
}
class Nit
{
    public void boy()
    {
        System.out.println("Nit is a bay");
    }

}
public class DependencyInjection2 {
    public static void main(String[] args) {
        Nit n=new Nit();
        Nikhil n1=new Nikhil(n);
        n.boy();

    }
}
