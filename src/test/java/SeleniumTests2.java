import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests2 {
        @Test
        public void Homework1() {
            System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
//            переход на сайт приветствия
            driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
            driver.findElement(By.className("custom-form__button")).click();
            var actualResult = driver.findElement(By.className("start-screen__res")).getText();
            var expectedResult = "Здравствуйте, .\n" +
                    "На вашу почту () отправлено письмо.\n" +
                    "Наш сотрудник свяжется с вами по телефону: .";
            Assert.assertEquals(actualResult, expectedResult);
            driver.quit();
        }

    @Test
    public void Homework2() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Городнов Александр Васильевич");
        driver.findElement(By.name("email")).sendKeys("test@mail.ru");
        driver.findElement(By.name("phone")).sendKeys("89993456789");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Здравствуйте, Городнов Александр Васильевич.\n" +
                "На вашу почту (test@mail.ru) отправлено письмо.\n" +
                "Наш сотрудник свяжется с вами по телефону: 89993456789.";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    @Test
    public void Homework3() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Заполните поля для ввода данных !";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    @Test
    public void Homework4() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("name")).sendKeys("Городнов Александр Васильевич");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Заполните поля E-mail, Телефон ";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    @Test
    public void Homework5() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
//        driver.findElement(By.name("name")).sendKeys("Городнов Александр Васильевич");
        driver.findElement(By.name("email")).sendKeys("test@mail.ru");
//        driver.findElement(By.name("phone")).sendKeys("89993456789");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Заполните поля ФИО, Телефон ";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }

    @Test
    public void Homework6() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//            переход на сайт приветствия
        driver.navigate().to("https://lm.skillbox.cc/qa_tester/module02/homework1/");
        driver.findElement(By.name("phone")).sendKeys("89993456789");
        driver.findElement(By.className("custom-form__button")).click();
        var actualResult = driver.findElement(By.className("start-screen__res")).getText();
        var expectedResult = "Заполните поля ФИО, E-mail ";
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
    }



}
