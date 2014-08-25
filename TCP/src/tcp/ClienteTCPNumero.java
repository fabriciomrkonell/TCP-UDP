package tcp;

import java.io.DataInputStream;
import java.net.Socket;

public class ClienteTCPNumero {

    public static void main(String[] args) {

        try {
            Socket conexao = new Socket("127.0.0.1", 12345);

            DataInputStream entrada = new DataInputStream(conexao.getInputStream());
            System.out.println("Número recebido: " + entrada.readInt());

            conexao.close();
        } catch (Exception exc) {
            System.out.println(exc.toString());
        }
    }

}
