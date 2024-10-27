class person 
{
    String name = "khushi gupta";
    int age=20;
    String college = " gyan ganga institute of technology and sciences" ;
    int sem =7;

    void display()
    {
        System.out.println("name is " + name);
        System.out.println("age is " + age);
        System.out.println("college is " + college);
        System.out.println("semester is " + sem);
    }

}

class DisplayAttributes
{
    public static void main(String[] args)
    {
        person p=new person();
        p.display();
    }
}