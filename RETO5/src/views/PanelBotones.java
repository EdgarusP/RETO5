package views;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class PanelBotones extends JPanel implements ActionListener{

    private JButton btnReq1;
    private JButton btnReq2;
    private JButton btnReq3;

    private index vistaIndex;

    public PanelBotones(index i) {
        super();        
        setLayout(new GridLayout());
        vistaIndex = i;
        btnReq1 = new JButton("Requerimiento 1");
        btnReq2 = new JButton("Requerimiento 2");
        btnReq3 = new JButton("Requerimiento 3");

        btnReq1.addActionListener(this);
        btnReq2.addActionListener(this);
        btnReq3.addActionListener(this);

        add(btnReq1);
        add(btnReq2);
        add(btnReq3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(btnReq1.getActionCommand())) {
            vistaIndex.updateLista1();
        }
        if (e.getActionCommand().equals(btnReq2.getActionCommand())) {
            vistaIndex.updateLista2();
        }
        if (e.getActionCommand().equals(btnReq3.getActionCommand())) {
            vistaIndex.updateLista3();
        }
    }  
    
}
