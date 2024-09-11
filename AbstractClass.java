package java_classes;
/**
* This is a module used to define an example of an abstract class.
*
* Author: Juan Bedoya <jebedoyal@udistrital.edu.co>
* ==================================================
* LICENSE - FOSS [Free Open Software Source] 
 */

/*This class is a fingerprint for some concrete example classes.*/

public abstract class AbstractClass {
    public Object mainAttr;

    public AbstractClass(Object parameter){
        this.mainAttr = parameter;
    }

    /**
     * This is an abstract method that must be implemented by the concrete classes.
     */
    public abstract void abstractMethod();
}