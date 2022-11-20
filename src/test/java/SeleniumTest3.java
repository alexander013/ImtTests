import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumTest3 {
    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void OnlineMovieTheater1()
    {
        // переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module06/register/");
        driver.findElement(By.name("name")).sendKeys("Городнов Александр Васильевич");
        driver.findElement(By.name("email")).sendKeys("skillbox@test.ru");
        driver.findElement(By.name("password")).sendKeys("qwerty!123");
        driver.findElement(By.className("form-submit")).click();
        var actualResult = driver.findElement(By.className("form-result")).getText();
        var expectedResult = "Вам на почту skillbox@test.ru отправлено письмо";
        Assert.assertEquals("Неправильный текст приветствия !", actualResult, expectedResult);
    }

    //    form-error
    @Test
    public void OnlineMovieTheater2()
    {
        // переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module06/register/");
        driver.findElement(By.className("form-submit")).click();
        var actualResult = driver.findElement(By.className("form-error")).getText();
        var expectedResult = "Введите имя";
        Assert.assertEquals("Неправильный текст приветствия !", actualResult, expectedResult);
    }


//Повторите действия из этого урока для сайта онлайн-кинотеатра:
// создайте тест, который переходит на сайт, ищет поля Email,
// «Пароль» и «Подтверждение пароля».
    @Test
    public void OnlineMovieTheater4()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
        var emailElementClass = driver.findElement(By.className("form-input"));
        var emailElementId = driver.findElement(By.id("email"));
        var emailElementName = driver.findElement(By.name("email"));
        var passwordElementId = driver.findElement(By.id("password"));
        var passwordElementName = driver.findElement(By.name("password"));
        var confirmPasswordElementId = driver.findElement(By.id("confirm_password"));
        var confirmPasswordElementName = driver.findElement(By.name("confirm_password"));
    }


//    Запишите ещё один тест на позитивный сценарий для сайта магазина обуви.
//    Примените известные вам техники тест-дизайна при составлении сценария.
//    Для поиска элементов используйте разные неповторяющиеся стратегии поиска By.
    @Test
    public void ShoeStore()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module03/practice1/");
        var checkElementId = driver.findElement(By.id("size"));
        driver.findElement(By.id("size")).sendKeys("35");
        var buttonElementId = driver.findElement(By.id("check-size-button"));
        driver.findElement(By.id("check-size-button")).click();
        var ActualResult = driver.findElement(By.id("size-success")).getText();
        var ExpectedResult = "В нашем магазине есть обувь вашего размера";
        Assert.assertEquals("Неправильный текст", ActualResult, ExpectedResult);
    }


    @Test
    public void TestLocators()
    {
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module05/practice1/");
        var emailElement = driver.findElement(By.className("form-input"));
        var passwordElement = driver.findElement(By.id("password"));
        var passwordConfirmElement = driver.findElement(By.name("confirm_password"));
        var buttonElement = driver.findElement(By.tagName("button"));
        var headersResultElement = driver.findElement(By.tagName("h3"));
        var password = "123";
        var email = "test@test.ru";
        emailElement.sendKeys(email);
        passwordElement.sendKeys(password);
        passwordConfirmElement.sendKeys(password);
        buttonElement.click();
        var emailResultElement = driver.findElement(By.linkText(email));
        var emailResultElement2 = driver.findElement(By.partialLinkText(email));
        Assert.assertEquals("Не верный текст при успешной регистрации", "Спасибо за регистрацию!", headersResultElement.getText());
        Assert.assertEquals("не верный email при успешной регистрации", email, emailResultElement.getText());
    }


}
