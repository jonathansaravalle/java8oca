public class HelloWorld {
    public static void main(String args[]){ // -> static public void main(String args[]) is ok!
    /* Parameter could be:
        (String[] args)      -> Brackets can follow either the variable name or its type
        (String arguments[]) -> Variable names can be changed
        (String... args)     -> Variable argument is valid

        Disclaimer: ellipsis '...' must follow the type and not the variable itself
    */
        System.out.println("Hello World!");
    }
    /* The main method

        The main method should comply with the following rules:
            - The method must be marked as a 'public' method
            - The method must be marked as a 'static' method
            - The name of the method must be 'main'
            - The return type of this method must be 'void'
            - The method must accept a method argument of a String array or a variable argument (varargs) of type String

        If a class defines a 'main' method that doesn't match the signature of THE 'main' method, it's referred to as an 'Overloaded method'.
        Overloaded methods are methods with the same name but different signatures.
        Example:

        public class HelloWorld {
            public static void main(String args){
                System.out.println("Hello A!");
            }

            public static void main(String args[]){
                System.out.println("Hello B!");  -> THIS IS THE ONE!!!
            }

            public static void main(int number){
                System.out.println("Hello C!");
            }
        }
    */
}

