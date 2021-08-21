package views;

import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.*;

public class PanelLista extends JPanel {
    
    private JList<String> listaRequerimientos;

    private index vistaIndex;

    public PanelLista(index i) {
        super();
        setLayout(new GridLayout());
        this.vistaIndex = i;
        listaRequerimientos = new JList<>();

        add(listaRequerimientos);
    }

    public void updateLista(String[] listado) {
        listaRequerimientos.setListData(listado);
    }
    
}
