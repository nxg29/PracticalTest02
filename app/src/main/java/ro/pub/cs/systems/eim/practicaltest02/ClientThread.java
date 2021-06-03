package ro.pub.cs.systems.eim.practicaltest02;

import android.widget.TextView;

import java.net.Socket;

public class ClientThread  extends Thread {
    private String address;
    private int port;
    private String currency;
    private TextView rateTextView;

    private Socket socket;

    public ClientThread(String address, int port, String currency, TextView rateTextView) {
        this.address = address;
        this.port = port;
        this.currency = currency;
        this.rateTextView = rateTextView;
    }

}
