import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            String serverURL = "//localhost:1099/Server";
            
            // Look up the remote object from the registry
            RemoteInterface remoteObject = (RemoteInterface) Naming.lookup(serverURL);
            
            // Call the remote methods
            remoteObject.performTask("Hello, Server!");
            // Call other remote methods as needed
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
