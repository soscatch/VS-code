import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerMain {
    public static void main(String[] args) {
        try {
            int port = 1099;
            String name = "Server";
            
            // Create the server object
            Server server = new Server();
            
            // Create the RMI registry and bind the server object to a name
            LocateRegistry.createRegistry(port);
            Naming.rebind("//localhost:" + port + "/" + name, server);
            
            System.out.println("Server started.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
