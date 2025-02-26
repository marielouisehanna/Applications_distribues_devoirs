import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.registry.LocateRegistry;

public class BankSystemServer {
    public static void main(String args[]) {
  BankManager bm = null;

  try {
      // Create a BankManager object
      bm = new BankManagerImpl(); // Pas besoin d'exporter manuellement
  } catch (RemoteException remoteException) {
      System.err.println("Failure during object creation: " + remoteException);
      System.exit(1);
  }
  try {
      LocateRegistry.createRegistry(1099);
      Naming.rebind("//localhost/BankSystem", bm);
  } catch (RemoteException remoteException) {
      System.err.println("Failure during Name registration: " + remoteException);
      System.exit(1);
  } catch (MalformedURLException malformedException) {
      System.err.println("Failure during Name registration: " + malformedException);
      System.exit(1);
  }

  System.out.println("Server started.");
  System.out.println("Enter <CR> to end.");
  try {
      System.in.read();
  } catch (IOException ioException) {
  }
  System.exit(0);
  }
}