import java.rmi.*;

interface Serverintf extends Remote {

public boolean equalString(String str1 , String str2) throws RemoteException;
}