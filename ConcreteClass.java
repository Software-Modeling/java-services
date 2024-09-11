package java_classes;

public class ConcreteClass extends AbstractClass{

    public ConcreteClass(Object parameter) {
        super(parameter);
    }

    @Override
    public void abstractMethod() {
        System.out.println("This is the implementation");
    }

    public static void main(String[] args){
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.abstractMethod();
    }
    
}
