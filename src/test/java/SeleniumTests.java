import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTests {
    @Test
    public void TestHelloVasya()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module01/");
//        Можно и так получается поле найти
        driver.findElement(By.className("custom-form__field")).sendKeys("Вася");
//        driver.findElement(By.name("name")).sendKeys("Вася");
        driver.findElement(By.className("button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Привет, Вася!";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    @Test
    public void TestEmptyField()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
//        Открытие браузера
        WebDriver driver = new ChromeDriver();
//        Переход на страницу приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module01/");
//        Клик по кнопке «Ввод»
        driver.findElement(By.className("custom-form__button")).click();
//        Проверка полученного текста приветствия
        var ActualResult = driver.findElement(By.className("start-screen__res")).getText();
        var ExpectedResult = "Привет, !";
        driver.quit();

    }
}
