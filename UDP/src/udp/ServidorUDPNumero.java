package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDPNumero {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(12345);

            byte[] num = new byte[1];
            DatagramPacket datagrama = new DatagramPacket(num, 1);
            socket.receive(datagrama);
            byte[] recebido = datagrama.getData();

            System.out.println("O número recebido foi: " + recebido[0]);
        } catch (Exception exc) {
            System.err.println(exc.toString());
        }
    }
}
