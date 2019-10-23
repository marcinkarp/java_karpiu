package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  FirefoxDriver wd;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private ContactsHelper contactsHelper;
  private GroupHelper groupHelper;

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    contactsHelper = new ContactsHelper(wd);
    sessionHelper.login("admin", "secret");

  }


  public void stop() {
    wd.quit();
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ContactsHelper getContactsHelper() {
    return contactsHelper;
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }
}
