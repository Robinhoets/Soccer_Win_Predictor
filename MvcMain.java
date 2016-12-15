import javax.swing.SwingUtilities;

public class MvcMain {

   private static void createAndShowGui() {
      InterfaceView view = new View();
      //InterfaceModel model = new Model();
      //Control control = newControl(view, model);

      //control.showView(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}