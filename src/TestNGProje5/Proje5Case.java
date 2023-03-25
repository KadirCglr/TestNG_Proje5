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
        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama1));
        Assert.assertTrue(pe.dogrulama1.getText().contains("Products"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.sales));
        pe.sales.click();
        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama2));
        Assert.assertTrue(pe.dogrulama2.getText().contains("Orders"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.customers));
        pe.customers.click();
        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama3));
        Assert.assertTrue(pe.dogrulama3.getText().contains("Customer roles"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.promotions));
        pe.promotions.click();
        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama4));
        Assert.assertTrue(pe.dogrulama4.getText().contains("Discounts"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.contentManagement));
        pe.contentManagement.click();
        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama5));
        Assert.assertTrue(pe.dogrulama5.getText().contains("News items"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.configuration));
        pe.configuration.click();
        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama6));
        Assert.assertTrue(pe.dogrulama6.getText().contains("Stores"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.system));
        pe.system.click();
        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama7));
        Assert.assertTrue(pe.dogrulama7.getText().contains("Log"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.reports));
        pe.reports.click();
        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama8));
        Assert.assertTrue(pe.dogrulama8.getText().contains("Sales summary"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.help));
        pe.help.click();
        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama9));
        Assert.assertTrue(pe.dogrulama9.getText().contains("Training"));

    }

    @Test
    void case3() {

        Proje5Elements pe = new Proje5Elements();

        wait.until(ExpectedConditions.elementToBeClickable(pe.customers));
        pe.customers.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.customers2));
        pe.customers2.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.adNewButton));
        pe.adNewButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.eMail));
        pe.eMail.sendKeys("kcaglar22@gmail.com");
        pe.password.sendKeys("123456");
        pe.firstName.sendKeys("kadir");
        pe.lastName.sendKeys("caglar");

        wait.until(ExpectedConditions.elementToBeClickable(pe.genderMale));
        pe.genderMale.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.dateOfBirth));
        pe.dateOfBirth.sendKeys("12.03.1990");

        wait.until(ExpectedConditions.elementToBeClickable(pe.company));
        pe.company.sendKeys("Techno");

        wait.until(ExpectedConditions.elementToBeClickable(pe.isTaxExempt));
        pe.isTaxExempt.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.Newsletter));
        pe.Newsletter.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.testStore));
        pe.testStore.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.activeButton));
        pe.activeButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.adminComment));
        pe.adminComment.sendKeys("Test bitmek üzere");

        wait.until(ExpectedConditions.elementToBeClickable(pe.saveButton));
        pe.saveButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama10));
        Assert.assertTrue(pe.dogrulama10.getText().contains("The new customer has been added successfully."));
        Tools.Bekle(1);
    }

    @Test
    void case4() {

        Proje5Elements pe = new Proje5Elements();

        wait.until(ExpectedConditions.elementToBeClickable(pe.customers));
        pe.customers.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.searchEmail));
        pe.searchEmail.sendKeys("kcaglar22@gmail.com");
        pe.searchFirsName.sendKeys("kadir");
        pe.searchLastName.sendKeys("caglar");

        wait.until(ExpectedConditions.elementToBeClickable(pe.searchButton));
        pe.searchButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama11));
        Assert.assertTrue(pe.dogrulama11.getText().contains("kadir caglar"));

        wait.until(ExpectedConditions.elementToBeClickable(pe.editButton));
        pe.editButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.company));
        pe.company.clear();

        wait.until(ExpectedConditions.elementToBeClickable(pe.company));
        pe.company.sendKeys("TechnoStudy");

        wait.until(ExpectedConditions.elementToBeClickable(pe.saveButton));
        pe.saveButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama10));
        Assert.assertTrue(pe.dogrulama10.getText().contains("The customer has been updated successfully."));
        Tools.Bekle(1);

    }

    @Test
    void case5() {

        Proje5Elements pe = new Proje5Elements();

        wait.until(ExpectedConditions.elementToBeClickable(pe.customers));
        pe.customers.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.searchEmail));
        pe.searchEmail.sendKeys("kcaglar22@gmail.com");

        wait.until(ExpectedConditions.elementToBeClickable(pe.searchFirsName));
        pe.searchFirsName.sendKeys("kadir");
        pe.searchLastName.sendKeys("caglar");

        wait.until(ExpectedConditions.elementToBeClickable(pe.searchButton));
        pe.searchButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.editButton));
        pe.editButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.deleteButton));
        pe.deleteButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.deleteButton2));
        pe.deleteButton2.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama12));
        Assert.assertTrue(pe.dogrulama12.getText().contains("The customer has been deleted successfully."));
        Tools.Bekle(1);
    }

    @Test
    void case6() {

        Proje5Elements pe = new Proje5Elements();

        wait.until(ExpectedConditions.elementToBeClickable(pe.searchBox));
        pe.searchBox.sendKeys("Shipments");

        wait.until(ExpectedConditions.elementToBeClickable(pe.searchButton2));
        pe.searchButton2.click();

        wait.until(ExpectedConditions.elementToBeClickable(pe.dogrulama13));
        Assert.assertTrue(pe.dogrulama13.getText().contains("Shipments"));
        Tools.Bekle(1);

    }
}