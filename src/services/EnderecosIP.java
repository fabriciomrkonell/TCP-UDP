package services;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class EnderecosIP {

    public static void main(String[] args) {
        byte endereco1[] = new byte[4];
        endereco1[0] = (byte) 200;
        endereco1[1] = (byte) 247;
        endereco1[2] = (byte) 215;
        endereco1[3] = (byte) 242;

        try {
            System.out.print("Endereço 1: ");
            for (int num = 0; num < endereco1.length; num++) {
                if (num == 3) {
                    System.out.print(endereco1[num]);
                } else {
                    System.out.print(endereco1[num] + ".");
                }
            }

            InetAddress endereco2 = InetAddress.getByAddress(endereco1);
            System.out.print("\nEndereço 2: " + endereco2.getHostAddress());
            InetAddress endereco3 = InetAddress.getByName("man-srv01.manfred.com.br");
            System.out.println("\nEndereço 3: " + endereco3.getHostAddress());
            System.out.println("Nome DNS do endereço 3: " + endereco3.getHostName());

        } catch (UnknownHostException exc) {
            System.err.println(exc.getMessage());
        }
    }

}
