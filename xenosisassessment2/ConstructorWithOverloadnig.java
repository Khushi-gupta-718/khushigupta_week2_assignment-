class ABC 
{
    int a ,b;

//constructor with no parameter
public ABC()
{
    a=0;
    b=0;
    System.out.println("default constructor");
}


//method overloading for add
void add()
{
    System.out.println("no parameter");
}

void add(int x)
{
  System.out.println("one parameter " + x);
}

void add(int x,int y)
{
  System.out.println("two parameter "  + x + " and " + y);
}
}


public class ConstructorWithOverloadnig 
{
    public static void main(String[] args) 
    {
        ABC abc = new ABC();
        abc.add();
        abc.add(10);
        abc.add(20, 30);


    }
}
