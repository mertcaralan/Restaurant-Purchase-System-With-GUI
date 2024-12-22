package Main;
import Frames.AppController;
import java.awt.EventQueue;

public class OrderMain {
    public static void main(String[] args) {
    	
    	EventQueue.invokeLater(() -> {
          try {
              AppController controller = new AppController();
              controller.showRegistrationFrame();
          } catch (Exception e) {
              e.printStackTrace();
          }
      });
        
    }

}
