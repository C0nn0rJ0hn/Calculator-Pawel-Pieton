public class Calculator
{
    int a;
    int b;

    public Calculator(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int addAToB()
    {
        return a + b;
    }

    public int substractBFromA()
    {
        return a - b;
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator(10, 3);
        System.out.println(calc.addAToB());
        System.out.println(calc.substractBFromA());
    }
}
