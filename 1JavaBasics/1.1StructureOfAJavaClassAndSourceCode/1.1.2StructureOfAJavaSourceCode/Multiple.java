/* Application of package and import statements in Java source code files

    When you use a package or import statement within Java files, both the package and import statements
    apply to all the classes and interfaces defined within that source code file.

*/

package StructureOfAJavaSourceCode; // all classes/interfaces belongs to StructureOfAJavaSourceCode package
import java.lang.*; // this import applies to all classes/interfaces


/* Interface

    An interface specifies a contract for the classes to implement.

    Prior to Java 8, interface methods were implicitly abstract.
    But starting with Java 8, the methods in an interface can define a default implementation and static methods can also be defined.

    The definition of an interface starts with the keyword 'interface'

*/
interface Printable {
    void someMethod();
    void anotherMethod(String parameter);
}

/* Definition of single and multiple classes in a single java source code file

    You can define either a single class or an interface in a Java source code file or multiple such entities.
    When a public class or interface is declared, it must match the source file. It also can't define more than one public class or interface.

*/

public class Multiple {}      // OK
class OtherClass {}           // OK
interface AnotherInterface {} // OK
//public interface Multiple{} // OK - if public class Multiple isn't declared
//public class OtherClass {}  // Compilation Error - due to source file name
