import java.util.Hashtable;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class BankManagerImpl extends UnicastRemoteObject implements BankManager {
  private Hashtable<String, Account> accounts;
  private Hashtable<String, Client> clients;

  // public No-argument constructor
  public BankManagerImpl() throws RemoteException {
      super(); // Appel au constructeur de UnicastRemoteObject
      initialize();
  }
  public Account getAccount(String accountNumber) throws RemoteException {
    Account account = (Account) accounts.get(accountNumber); // Cast vers l'interface
    return account;
}

public Client getClient(String clientName) throws RemoteException {
    Client client = (Client) clients.get(clientName); // Cast vers l'interface
    return client;
}

  public void initialize()
      throws java.rmi.RemoteException {
    // Create the hashtables
    // Create the hashtables
    accounts = new Hashtable<String, Account>(20);
    clients  = new Hashtable<String, Client>(10);
    Client clientCharlie = new ClientImpl(this, "Charlie");
    UnicastRemoteObject.exportObject(clientCharlie,0);
    Client clientShannon = new ClientImpl(this, "Shannon");
    UnicastRemoteObject.exportObject(clientShannon,0);
    clients.put("Charlie", clientCharlie);
    clients.put("Shannon", clientShannon);

    // Create accounts:
    //     * put them into the hashtable
    //     * associate them with clients
    Account account;
    account = new AccountImpl(this, clientCharlie, "4434");
    ((AccountImpl)account).deposit(500);
    UnicastRemoteObject.exportObject(account,0);
    accounts.put("4434", account);
    account = new AccountImpl(this, clientCharlie, "4461");
    ((AccountImpl)account).deposit(600);
    UnicastRemoteObject.exportObject(account,0);
    accounts.put("4461", account);
    account = new AccountImpl(this, clientShannon, "6678");
    ((AccountImpl)account).deposit(700);
    UnicastRemoteObject.exportObject(account,0);
    accounts.put("6678", account);
  }
}
