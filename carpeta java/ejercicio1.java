import Servidor;
import org.omg.CosNaming;
import org.omg.CosNaming.NamingContextPackage;
import org.omg.CORBA;
import org.omg.PortableServer;
import org.omg.PortableServer.PortableServer;

import java.util.Properties;
import java.rmi.Remote;

public class Main {
    public static void main(String[] args) {
    }
}

public interface Servidor extends Remote {
}

public void Sumar_num (num1, num2) {
    return num1 + num2;
}

public void Diferencia_num (num1, num2) {
    return num1 - num2;
}

public void Producto_num (num1, num2) {
    return num1 * num2;
}

public void Media_num (num1, num2) {
    return ((num1 + num2)/2)
}

public class Cliente implements Sumar_num (num1, num2) {
    num1 + num2
}
public class Cliente implements Diferencia_num (num1, num2) {
    num1 - num2
}
public class Cliente implements Producto_num (num1, num2) {
    num1 * num2
}
public class Cliente implements Media_num (num1, num2) {
    ((num1 + num2)/2)
}





