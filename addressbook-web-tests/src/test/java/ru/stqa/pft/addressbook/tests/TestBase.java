package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {
  protected final ApplicationManager app = new ApplicationManager();
  public WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();
  }

  @Test
  public void testGroupDeletions() throws Exception {
    selectGroup("selected[]");
    deleteSelectedGroup("delete");
    returnToGroupPage(By.linkText("group page"));
  }

  private void returnToGroupPage(By group_page) {
    wd.findElement(group_page).click();
  }

  private void deleteSelectedGroup(String delete) {
    wd.findElement(By.name(delete)).click();
  }

  private void selectGroup(String s) {
    wd.findElement(By.name(s)).click();
  }
}
