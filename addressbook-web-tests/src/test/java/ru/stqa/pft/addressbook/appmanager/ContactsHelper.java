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
    type(By.name("firstname"), contactsGroup.getFirstname());
    type(By.name("lastname"), contactsGroup.getLastname());
    type(By.name("company"), contactsGroup.getCompany());
    type(By.name("address"), contactsGroup.getAddress());
    type(By.name("mobile"), contactsGroup.getMobile());
    type(By.name("email"), contactsGroup.getEmail());
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

  public void initContactsModyfication() {
    click(By.xpath("(// img [@ alt = 'Edit']) [3]"));
  }

  public void submitUpdateContacts() {
    click(By.name("update"));
  }

  public void startHomePage() {
    click(By.linkText("home"));
  }

  public void selectedContacts() {
    click(By.name("selected[]"));
  }

  public void deletedContacts() {
    click(By.xpath("(// img [@ alt = 'Edit']) [3]"));
  }
}