package views;

import javax.swing.JFrame;
import controller.Controller;
import java.awt.*;
import java.util.ArrayList;

public class index extends JFrame{
    
    private PanelBotones panelBotones;
    private PanelLista panelLista;
    private Controller controlador;

    public index(String url) {
        super();
        setLayout(new BorderLayout());
        setSize(400, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelBotones = new PanelBotones(this);
        panelLista = new PanelLista(this);

        controlador = new Controller(url);

        add(panelBotones, BorderLayout.SOUTH);
        add(panelLista, BorderLayout.CENTER);
    }

    public void updateLista1(){
        controlador.req15();
        req1(controlador.getReq1s5());
    }

    public void req1(ArrayList<String> listaReq1) {
        String[] listado1 = new String[listaReq1.size()];
        for (int i = 0; i < listado1.length; i++) {
            listado1[i] = listaReq1.get(i);
        }
        panelLista.updateLista(listado1);
    }
    

    public void updateLista2(){
        controlador.req25();
        req2(controlador.getReq2s5());
    }

    public void req2(ArrayList<String> listaReq2) {
        String[] listado = new String[listaReq2.size()];
        for (int i = 0; i < listado.length; i++) {
            listado[i] = listaReq2.get(i);
        }
        panelLista.updateLista(listado);
    }

    public void updateLista3(){
        controlador.req35();
        req3(controlador.getReq3s5());
    }

    public void req3(ArrayList<String> listaReq3) {
        String[] listado = new String[listaReq3.size()];
        for (int i = 0; i < listado.length; i++) {
            listado[i] = listaReq3.get(i);
        }
        panelLista.updateLista(listado);
    }


}