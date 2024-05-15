package advanced.accessmodifiers;

public class DerivedClass extends BaseClass {
	public String derivedVariable = "Derived Class Public Variable";

    
    @Override
    public void baseMethod() {
        System.out.println("Derived Class Public Method (overriding Base Class)");
    }

    
    public void derivedMethod() {
        System.out.println("Derived Class Public Method");
    }
}
