public class Main {
    public static void main(String[] args) {

        System.out.println(basicMath("+",1,2));
    }
    public static Integer basicMath(String op, int v1, int v2)
    {

        if (op == "+")
            return v1+v2;
        else if(op == "-")
            return v1-v2;
        else if (op=="*")
            return v1*v2;
        else
            return v1/v2;


    }
}