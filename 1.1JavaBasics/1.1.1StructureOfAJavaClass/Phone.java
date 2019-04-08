class Phone {
/*Class Definition

    A class is a design used to specify the attributes and behavior of an object.
    The attributes are implemented using variables and behavior is implemented using methods.

    Points to remember:
        - A class name starts with the keyword 'class'.
        - The state of a class is defined using attributes or instance variables
        - It is not mandatory to define all attributes before defining methods. But it is NOT RECOMMENDED.
        - Methods may include method parameters
        - A class may also include comments and constructors

*/

    String model;
    String company;
    /*Variables

        Because the variables 'model', 'company' and 'weight' are used to store the state of an object, they are called instance variables.
        If you change the value of an instance variable for an object, the value for the same named instance variable won't change for another object.
        The instance variables are defined within a class but outside all methods in a class.

        A single copy of a class variable or static variable is shared by all the objects of a class.

    */


    Phone(String model){
        this.model = model;
    }
    /*Constructors

        Class Phone defines a single constructor.
        A class constructor is used to create and initialize the objects of a class.
        A class can define multiple constructors that accepts different sets of method parameters

    */

    double weight;

    void makeCall(String number){
        //code
    }

    void receiveCall(){
        //code
    }
    /*Methods

        The methods makeCall and receiveCall are instance methods, which are generally used to manipulate the instance variables.

        A class method or static method can be used to manipulate the static variables.

    */


}
