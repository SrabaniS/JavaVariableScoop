package love.programming;

public class VariableScoop {
    static int myGlobalint = 5;

    public static void main(String[] args) {

        int myMainLocalint = 10;

        System.out.println(myMainLocalint);
        System.out.println(myGlobalint);

        {
            int myCodeblockInt = 100;
            System.out.println(myCodeblockInt);
        }


//        VariableScope vs = new VariableScope();
//        vs.myMethod();

    }

    void myMethod(){
        int myLocalInt = 10;

//        System.out.println(myMainLocalint );

        System.out.println(myGlobalint);
    }
}
