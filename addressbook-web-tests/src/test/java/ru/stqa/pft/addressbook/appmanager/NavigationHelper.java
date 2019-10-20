package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
  private FirefoxDriver wd = new FirefoxDriver();

  public NavigationHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void gotoGroupPage(String groups) {
    wd.findElement(By.linkText(groups)).click();
  }
}
