import java.swing.SwingUtilities;

public class MvcMain {

   private static void createAndShowGui() {
      MvcView view = new ShowTextView("Show Text");
      MvcModel model = new ShowTextModel();
      Control control = new Control(view, model);

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