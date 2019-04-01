import javax.swing.*;
import java.awt.*;

public class Aplikasi {

    public static void main(String[] args) {
        JFrame frame = new JFrame("halo");
        frame.setSize(400, 250);

        frame.setLayout(new BorderLayout());

        JLabel lblnama =new JLabel();
        lblnama.setText("fajarajigilang");
       // frame.add(lblnama, BorderLayout.WEST);
        JLabel lblNim =new JLabel();
        lblNim.setText("17090138");

        JButton btnSimpan =new JButton("Simpan");
        frame.add(btnSimpan, BorderLayout.EAST);

        JPanel westPanel =new JPanel();
        westPanel.setLayout(new GridLayout(3,1));
        frame.add(westPanel, BorderLayout.WEST);
        westPanel.add(lblnama);
        westPanel.add(lblNim);



        frame.setVisible(true);


    }

}
