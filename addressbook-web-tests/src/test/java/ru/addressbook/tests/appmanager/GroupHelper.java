package ru.addressbook.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.addressbook.tests.model.GroupData;

public class GroupHelper {

  public WebDriver driver;

  public GroupHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  public void submitGroupCreation(String locator) {
    click(locator);
  }

  private void click(String submit) {
    driver.findElement(By.name(submit)).click();
  }

  public void fillGroupMethod(GroupData groupData) {
    type("group_name", By.name("group_name"), groupData.getName());
    type("group_header", By.name("group_header"), groupData.getHeader());
    type("group_footer", By.name("group_footer"), groupData.getFooter());
  }

  private void type(String group_name, By locator, String text) {
    driver.findElement(locator).click();
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(text);
  }

  public void initGroupCreation() {
    submitGroupCreation("new");
  }

  public void deleteSelectedGroups() {
    submitGroupCreation("delete");
  }

  public void selectGroup() {
    driver.findElement(By.xpath("(//input[@name='selected[]'])[2]")).click();
  }
}
