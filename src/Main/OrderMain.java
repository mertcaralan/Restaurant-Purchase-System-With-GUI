package Main;
import java.awt.EventQueue;
import java.util.Scanner;

import Frames.AppController;

public class OrderMain {
    public static void main(String[] args) {
    	
    	EventQueue.invokeLater(() -> {
          try {
              AppController controller = new AppController();
              controller.showOrderFrame();
          } catch (Exception e) {
              e.printStackTrace();
          }
      });
        
    }

}
