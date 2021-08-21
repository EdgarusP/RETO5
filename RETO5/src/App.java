import controller.Controller;
import views.index;

public class App {
    public static void main(String[] args) throws Exception {
        index i = new index("jdbc:mysql://localhost:3306/Proyectos");
        i.setVisible(true);
        //Pruebas locales
        // Controller controller = new Controller("jdbc:mysql://localhost:3306/proyectos");        
        // Controller controller = new Controller("jdbc:sqlite:ProyectosConstruccion.db");


        // controller.req1();
        // controller.printReq1();
        // controller.req2();
        // controller.printReq2();
        // controller.req3();
        // controller.printReq3();

    }
}
