class Passport
{
    int passportNo;
    String nationality;
    Passport(int passportNo, String nationality)
    {
        this.passportNo = passportNo;
        this.nationality = nationality; 
    }
}
class Person
{
    String name;
    int id;
    Passport pass; // One-to-One association

    Person(int id, String name,  Passport p)
    {
        this.name = name;
        this.id = id;
        this.pass = p;
    }
}
class OneToOneDemo
{
    public static void main(String[] args)
    {
        Passport p = new Passport(987654, "Indian");
        Person m = new Person(1, "krishna", p);
        System.out.println(m.pass.passportNo);
    }
}