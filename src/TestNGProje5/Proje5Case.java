package TestNGProje5;

import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Proje5Case extends BaseDriver {

    @Test
    void case2() {

        Proje5Elements pe = new Proje5Elements();

        wait.until(ExpectedConditions.elementToBeClickable(pe.catalog));
        pe.catalog.click();
        WebElement dogrulama1 = driver.findElement(By.xpath("//*[text()=' Products']"));
        wait.until(ExpectedConditions.elementToBeClickable(dogrulama1));
        Assert.assertTrue(dogrulama1.getText().contains("Products"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.sales));
        pe.sales.click();
        WebElement dogrulama2 = driver.findElement(By.xpath("//*[text()=' Orders']"));
        wait.until(ExpectedConditions.elementToBeClickable(dogrulama2));
        Assert.assertTrue(dogrulama2.getText().contains("Orders"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.customers));
        pe.customers.click();
        WebElement dogrulama3 = driver.findElement(By.xpath("//*[text()=' Customer roles']"));
        wait.until(ExpectedConditions.elementToBeClickable(dogrulama3));
        Assert.assertTrue(dogrulama3.getText().contains("Customer roles"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.promotions));
        pe.promotions.click();
        WebElement dogrulama4 = driver.findElement(By.xpath("//*[text()=' Discounts']"));
        wait.until(ExpectedConditions.elementToBeClickable(dogrulama4));
        Assert.assertTrue(dogrulama4.getText().contains("Discounts"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.contentManagement));
        pe.contentManagement.click();
        WebElement dogrulama5 = driver.findElement(By.xpath("//*[text()=' News items']"));
        wait.until(ExpectedConditions.elementToBeClickable(dogrulama5));
        Assert.assertTrue(dogrulama5.getText().contains("News items"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.configuration));
        pe.configuration.click();
        WebElement dogrulama6 = driver.findElement(By.xpath("//*[text()=' Stores']"));
        wait.until(ExpectedConditions.elementToBeClickable(dogrulama6));
        Assert.assertTrue(dogrulama6.getText().contains("Stores"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.system));
        pe.system.click();
        WebElement dogrulama7 = driver.findElement(By.xpath("//*[text()=' Log']"));
        wait.until(ExpectedConditions.elementToBeClickable(dogrulama7));
        Assert.assertTrue(dogrulama7.getText().contains("Log"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.reports));
        pe.reports.click();
        WebElement dogrulama8 = driver.findElement(By.xpath("//*[text()=' Sales summary']"));
        wait.until(ExpectedConditions.elementToBeClickable(dogrulama8));
        Assert.assertTrue(dogrulama8.getText().contains("Sales summary"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.help));
        pe.help.click();
        WebElement dogrulama9 = driver.findElement(By.xpath("//*[text()=' Training']"));
        wait.until(ExpectedConditions.elementToBeClickable(dogrulama9));
        Assert.assertTrue(dogrulama9.getText().contains("Training"));

    }

    @Test
    void case3() {

        Proje5Elements pe = new Proje5Elements();

        pe.customers.click();
        pe.customers2.click();
        pe.adNewButton.click();
        pe.eMail.sendKeys("kcaglar13@gmail.com");
        pe.password.sendKeys("123456");
        pe.firstName.sendKeys("kadir");
        pe.lastName.sendKeys("caglar");
        pe.genderMale.click();
        pe.dateOfBirth.sendKeys("12.03.1990");
        pe.company.sendKeys("Techno");
        pe.isTaxExempt.click();
        pe.Newsletter.click();
        pe.testStore.click();
        pe.activeButton.click();
        pe.adminComment.sendKeys("Test bitmek üzere");
        pe.saveButton.click();
        Assert.assertTrue(pe.dogrulama10.getText().contains("The new customer has been added successfully."));

    }

    @Test
    void case4() {

        Proje5Elements pe = new Proje5Elements();

        pe.customers.click();
        pe.searchEmail.sendKeys("kcaglar13@gmail.com");
        pe.searchFirsName.sendKeys("kadir");
        pe.searchLastName.sendKeys("caglar");
        pe.searchButton.click();
        Assert.assertTrue(pe.dogrulama11.getText().contains("kadir caglar"));
        pe.editButton.click();
        pe.company.clear();
        pe.company.sendKeys("TechnoStudy");
        pe.saveButton.click();
        Assert.assertTrue(pe.dogrulama10.getText().contains("The customer has been updated successfully."));

    }

    @Test
    void case5() {

        Proje5Elements pe = new Proje5Elements();

        pe.customers.click();
        pe.searchEmail.sendKeys("kcaglar13@gmail.com");
        pe.searchFirsName.sendKeys("kadir");
        pe.searchLastName.sendKeys("caglar");
        pe.searchButton.click();
        pe.editButton.click();
        pe.deleteButton.click();
        pe.deleteButton2.click();
        Assert.assertTrue(pe.dogrulama12.getText().contains("The customer has been deleted successfully."));

    }

    @Test
    void case6() {

        Proje5Elements pe = new Proje5Elements();

        pe.searchBox.sendKeys("Shipments");
        pe.searchButton2.click();
        Assert.assertTrue(pe.dogrulama13.getText().contains("Shipments"));

    }
}