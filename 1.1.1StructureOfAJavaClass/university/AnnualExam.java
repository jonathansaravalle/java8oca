package university;

/*Package Statement

    A Package Statement is used to define which package a class is in.

    If it is not explicitly defined, it becomes part of a default package.
    If a class includes a Package Statement, it must be the FIRST statement in the class definition.
    It can't be defined within a class or after a class declaration and must appear exactly once in a class.

*/

import certification.ExamQuestion;

/*Import Statement

    Classes and interfaces from the same package can use each other without prefixing their names with the package name.
    But to use a class or interface from another package, you must use its fully qualified name, that is, <packageName>.<anySubPackageName>.<ClassName>.
    Ex: java.lang.String

    Import statement gives code readability and it gives more focus to code by taking care of qualified names.

    Take a look at this using an example class 'AnnualExam' defined in the package 'university'.
    Class 'AnnualExam' is associated with the class certification.ExamQuestion.

    package university          package certification
     |-- class AnnualExam  <->   |-- class ExamQuestion

*/

/*Comments

    There are two types of comments:
        - end-of-line comments '//'
        - multiline comments '/* and *\/' (there is a backslash to escape the end of multine comment)

    String name = /* Harry *\/ "Paul";
    System.out.println(name);  ->  Outputs Paul

    String name = "/* Harry *\/ Paul";
    System.out.println(name);  ->  Outputs /* Harry *\/ Paul

    String name = "Shre /* ya
                       *\/ Paul";
    System.out.println(name);  ->  Won't compile

*/

class AnnualExam {
/*Class Declaration

    Marks the start of a class. It is the keyword 'class' followed by the name of a class.

    The declaration of a class is composed of the following parts:
        - Access modifiers
        - Nonaccess modifiers
        - Class name
        - Name of base class, if the class is extending another class (inheritance)
        - All implemented interfaces, if the class is implementing any interfaces
        - Class body (class fields, methods, constructors), included within a pair of curly braces {}

    Ex: public final class Runner extends Person implements Athlete {}
        public -> Access modifier
        final -> Nonaccess modifier
        class -> Keyword class (Compulsory)
        Runner -> Name of class (Compulsory)
        extends -> Keyword extends
        Person -> Base class name
        implements -> Keyword implements
        Athlete -> Name of implemented interface
        {} -> Curly braces (Compulsory)

*/

/*Class Definition

A class is a design used to specify the attributes and behavior of an object.
The attributes are implemented using variables and behavior is implemented using methods.



*/



    ExamQuestion eq;
}
