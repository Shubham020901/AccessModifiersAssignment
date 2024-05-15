package advanced.accessmodifiers;

public class OutsideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        try {	
			DerivedClass derivedObject1 = new DerivedClass();

        	derivedObject1.baseMethod();  
        
        	derivedObject1.derivedMethod();  

        	System.out.println(derivedObject1.derivedVariable);  
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
