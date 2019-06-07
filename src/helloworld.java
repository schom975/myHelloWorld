import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


import java.awt.peer.SystemTrayPeer;
import java.util.concurrent.TimeUnit;

public class helloworld {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ScottHom/Desktop/chromedriver");

        WebDriver driver = new ChromeDriver();


        String MyEmail = "Scottwhom@gmail.com";
        String pass = "testing123";

        driver.get("https://postmates.com/merchant/sweetgreen-new-york-18");

//        driver.findElement(By.id("e2e-nav-login-link")).click();
//        driver.findElement(By.id("e2e-login-email-input")).sendKeys(MyEmail);
//        driver.findElement(By.id("e2e-submit-button")).click();
//        driver.findElement(By.id("e2e-login-input-password")).sendKeys(pass);
//        driver.findElement(By.id("e2e-submit-button")).click();

        driver.findElement(By.className("css-447p9l e1tw3vxs2"));







       // driver.close();

    }

}
