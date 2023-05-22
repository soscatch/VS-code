import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements RemoteInterface {

    protected Server() throws RemoteException {
        // Required default constructor
    }

    @Override
    public void performTask(String message) throws RemoteException {
        // Perform the task based on the message received
        System.out.println("Received message: " + message);
        // Add your implementation logic here
    }

    // Implement other methods from RemoteInterface as needed
}
