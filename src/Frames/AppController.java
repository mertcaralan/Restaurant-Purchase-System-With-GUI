package Frames;

public class AppController {
    // Declare all frames as private variables
    private OrderFrame orderFrame;
    private FoodFrame foodFrame;
    private DrinkFrame drinkFrame;
    private SauceFrame sauceFrame;
    private BurgerFrame burgerFrame;
    private ColdDrinkFrame coldDrinkFrame;
    private DessertFrame dessertFrame;
    private HotDrinkFrame hotDrinkFrame;
    private PurchaseFrame purchaseFrame;
    private SnackFrame snackFrame;
    private WrapFrame wrapFrame;
    private CompleteFrame completeFrame;
    private MainFrame mainFrame;
    private RegistrationFrame registrationFrame;
    private LoginFrame loginFrame;
    

    public AppController() {

        orderFrame = new OrderFrame(this);
        foodFrame = new FoodFrame(this);
        drinkFrame = new DrinkFrame(this);
        sauceFrame = new SauceFrame(this);
        burgerFrame = new BurgerFrame(this);
        coldDrinkFrame = new ColdDrinkFrame(this);
        dessertFrame = new DessertFrame(this);
        hotDrinkFrame = new HotDrinkFrame(this);
        purchaseFrame = new PurchaseFrame(this);
        snackFrame = new SnackFrame(this);
        wrapFrame = new WrapFrame(this);
        completeFrame = new CompleteFrame(this);
        mainFrame = new MainFrame(this);
        registrationFrame = new RegistrationFrame(this);
        loginFrame = new LoginFrame(this);
    }

    public void showOrderFrame() {
        hideAllFrames();
        orderFrame.setVisible(true);
    }

    public void showFoodFrame() {
        hideAllFrames();
        foodFrame.setVisible(true);
    }

    public void showDrinkFrame() {
        hideAllFrames();
        drinkFrame.setVisible(true);
    }

    public void showSauceFrame() {
        hideAllFrames();
        sauceFrame.setVisible(true);
    }

    public void showBurgerFrame() {
        hideAllFrames();
        burgerFrame.setVisible(true);
    }

    public void showColdDrinkFrame() {
        hideAllFrames();
        coldDrinkFrame.setVisible(true);
    }

    public void showDessertFrame() {
        hideAllFrames();
        dessertFrame.setVisible(true);
    }

    public void showHotDrinkFrame() {
        hideAllFrames();
        hotDrinkFrame.setVisible(true);
    }

    public void showPurchaseFrame() {
        hideAllFrames();
        purchaseFrame.setVisible(true);
    }

    public void showSnackFrame() {
        hideAllFrames();
        snackFrame.setVisible(true);
    }

    public void showWrapFrame() {
        hideAllFrames();
        wrapFrame.setVisible(true);
    }
    
    public void showCompleteFrame() {
    	hideAllFrames();
        completeFrame.setVisible(true);
    }
    
    public void showMainFrame() {
    	hideAllFrames();
        mainFrame.setVisible(true);
    }
    
    public void showRegistrationFrame() {
    	hideAllFrames();
    	registrationFrame.setVisible(true);
    }
    
    public void showLoginFrame() {
    	hideAllFrames();
    	loginFrame.setVisible(true);
    }

    // Private method to hide all frames
    private void hideAllFrames() {
        orderFrame.setVisible(false);
        foodFrame.setVisible(false);
        drinkFrame.setVisible(false);
        sauceFrame.setVisible(false);
        burgerFrame.setVisible(false);
        coldDrinkFrame.setVisible(false);
        dessertFrame.setVisible(false);
        hotDrinkFrame.setVisible(false);
        purchaseFrame.setVisible(false);
        snackFrame.setVisible(false);
        wrapFrame.setVisible(false);
        completeFrame.setVisible(false);
        mainFrame.setVisible(false);
        registrationFrame.setVisible(false);
        loginFrame.setVisible(false);
        
    }
}
