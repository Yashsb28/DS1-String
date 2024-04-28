import java.rmi.*;
import java.rmi.server.*;

public class Serverimpl extends UnicastRemoteObject implements
        Serverintf {
    public Serverimpl() throws RemoteException {
    }

    public boolean equalString(String str1 , String str2) throws RemoteException {
        if (str1.equals(str2)) {
            return true;
        }
        else
        {
            return false;
        }
    }

}