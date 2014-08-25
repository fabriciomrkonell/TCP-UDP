package tcp;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class ServidorTCPNumero {

    public static void main(String[] args) {

        try {
            ServerSocket servidor = new ServerSocket(12345, 2);
            Socket conexao = servidor.accept();

            DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
            SocketAddress s = conexao.getRemoteSocketAddress();
            System.out.println("Enviando número ao cliente: " + s.toString());
            saida.writeInt(12);

            conexao.close();
        } catch (Exception exc) {
            System.out.println(exc.toString());
        }
    }
}
