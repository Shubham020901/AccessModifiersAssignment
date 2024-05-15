package OutsideClass;

import advanced.accessmodifiers.DerivedClass;

public class OutsideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        DerivedClass derivedObject = new DerivedClass();

        
            derivedObject.baseMethod(); // Output: Derived Class Public Method (overriding Base Class)

            System.out.println(derivedObject.derivedVariable); // Output: Derived Class Public Variable

            derivedObject.derivedMethod(); // Output: Derived Class Public Method
        
	

}
}