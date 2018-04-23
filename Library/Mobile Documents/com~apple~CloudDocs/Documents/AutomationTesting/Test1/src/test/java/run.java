import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import AppiumDriver.AppSetup;
import org.testng.annotations.Test;
import findElement.FindUI;
import uiPages.AddEdiVehiclesScreen;
import uiPages.CatalogueScreen;
import uiPages.CountryScreen;
import uiPages.MyVehiclesScreen;

import java.net.MalformedURLException;

public class run extends FindUI {

    public run() throws MalformedURLException {
    }
    @BeforeTest
    public void start(){
        Setup();
        wait = new WebDriverWait(driver,1500);
    }

 @Test(priority = 1)
    public void countryScreen() {

    waitByXpath(CountryScreen.countryImageView());
     System.out.println("Image has been checked");;
    waitByXpath(CountryScreen.austria()).click();
 }

 @Test(priority = 2)
    public void catalogueScreen() throws InterruptedException {


    waitByID(CatalogueScreen.banner()).isEnabled();
     Thread.sleep(7000); // Виноват, каюсь) (не хватило времени)
     waitByXpath(CatalogueScreen.navigationDrawer());
     System.out.println("Menu button enable");
        waitByXpath(CatalogueScreen.navigationBarTitle());
     System.out.println("Title has been checked");
        waitByID(CatalogueScreen.searchIcon());
     System.out.println("Search icon has been checked");
        waitByID(CatalogueScreen.basketIcon());
     System.out.println("BasketIcon has been checked");
     waitByID(CatalogueScreen.addCartButton()).isDisplayed();
        waitByID(CatalogueScreen.allCategories());
     System.out.println("All category message has been checked");

        waitByID(CatalogueScreen.addCartButton()).click();
 }


 @Test(priority = 3)
    public void addVehicles(){

        waitByXpath(AddEdiVehiclesScreen.carMaker()).click();
        waitByXpath(AddEdiVehiclesScreen.audiType()).click();
        waitByXpath(AddEdiVehiclesScreen.superCar()).click();
        waitByXpath(AddEdiVehiclesScreen.petrolType11()).click();
        waitByID(AddEdiVehiclesScreen.addToMyVehicles()).click();
 }

 @Test(priority = 4)
    public void editVehicles(){

        waitByID(CatalogueScreen.logoCar());
        findByID(CatalogueScreen.nextButton()).click();

        waitByID(MyVehiclesScreen.editNavigationButton()).click();
        waitByID(MyVehiclesScreen.editVehiclesButton()).click();

        waitByXpath(AddEdiVehiclesScreen.editPertolType11()).click();
        waitByXpath(AddEdiVehiclesScreen.petrolType08()).click();
        waitByID(AddEdiVehiclesScreen.saveButton()).click();
 }

 @Test(priority = 5)
    public void deleteVehicles(){

        waitByID(MyVehiclesScreen.editNavigationButton()).click();
        waitByID(MyVehiclesScreen.deleteVehiclesButton()).click();
        waitByID(MyVehiclesScreen.emptyAddButton());
        waitByXpath(MyVehiclesScreen.navigationBackButton()).click();
        waitByID(CatalogueScreen.addCartButton());

        driver.quit();
 }

}
