import java.rmi.Naming; 
import java.rmi.RemoteException;
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 


public class CalculatorClient {
public static void main(String[] args) {
 //System.setSecurityManager(new RMISecurityManager());

try {             
Calculator c = (Calculator) Naming.lookup( "rmi://localhost/CalculatorService");     
System.out.println( c.sub(4, 3) );             
System.out.println( c.add(4, 5) );             
System.out.println( c.mul(3, 6) ); 
System.out.println( c.div(9, 3) );         
} 
catch (MalformedURLException murle) { System.out.println( "MalformedURLException"+ murle); }
catch (RemoteException re) { System.out.println("RemoteException"+re); } 
catch (NotBoundException nbe) {System.out.println("NotBoundException"+nbe);} 
catch (java.lang.ArithmeticException ae) {System.out.println("java.lang.ArithmeticException"+ae);}   
} 
} 
