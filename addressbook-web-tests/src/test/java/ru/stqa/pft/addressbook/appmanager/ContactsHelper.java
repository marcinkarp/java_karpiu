package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.GroupContacts;

public class ContactsHelper extends HelperBase {

  public ContactsHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void sumbitAddNew() {
    click(By.linkText("add new"));
  }

  public void fillContactsForm(GroupContacts contactsGroup) {
    type(By.name("Contacts_name"), contactsGroup.getName());
    type(By.name("Contacts_lastname"), contactsGroup.getName());
    type(By.name("Contacts_company"), contactsGroup.getName());
    type(By.name("Contacts_adress"), contactsGroup.getName());
    type(By.name("Contacts_number"), contactsGroup.getName());
    type(By.name("Contacts_email"), contactsGroup.getName());
  }

  public boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void submitAddNew() {
    click(By.name("submit"));
  }

  public void returnToHomePage() {
    click(By.linkText("home page"));
  }

}