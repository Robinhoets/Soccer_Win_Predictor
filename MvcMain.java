import javax.swing.SwingUtilities;

public class MvcMain {

   private static void createAndShowGui() {
      View view = new View("Soccer Records");
      //InterfaceModel model = new Model();
      Control control = new Control(view); // add (,model) later

      control.showView(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
}