import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    void performTask(String message) throws RemoteException;
    // Add more remote methods as needed
}
