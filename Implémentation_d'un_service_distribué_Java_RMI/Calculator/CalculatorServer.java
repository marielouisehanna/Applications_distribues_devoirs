import java.rmi.Naming;
public class CalculatorServer {   
public CalculatorServer() {     
try {  
	Calculator c = new CalculatorImpl();       	
Naming.rebind("CalculatorService", c);     
     } catch (Exception e) { System.out.println("Trouble: " + e); }
}   
public static void main(String args[]) { new CalculatorServer(); }
} 
