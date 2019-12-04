package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.GroupContacts;

public class ContactsHelper extends HelperBase {

  public ContactsHelper(WebDriver wd) {
    super(wd);
  }

  public void sumbitAddNew() {
    click(By.linkText("add new"));
  }

  public void fillContactsForm(GroupContacts contactsGroup, boolean creation) {
    type(By.name("firstname"), contactsGroup.getFirstname());
    type(By.name("lastname"), contactsGroup.getLastname());
    type(By.name("company"), contactsGroup.getCompany());
    type(By.name("address"), contactsGroup.getAddress());
    type(By.name("mobile"), contactsGroup.getMobile());
    type(By.name("email"), contactsGroup.getEmail());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactsGroup.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
    if (isElementPresent(By.name("new_group"))) {
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
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitUpdateContacts() {
    click(By.name("update"));
  }

  public void startHomePage() {
    if (isElementPresent(By.id("maintable"))) {
      return;
  }

  click(By.linkText("home"));
}

  public void selectedContacts() {
    click(By.name("selected[]"));
  }

  public void deletedContacts() {
    click(By.xpath("(// img [@ alt = 'Edit']) [3]"));
  }

  public void createGroupContacts(GroupContacts group, boolean b) {
    startHomePage();
    sumbitAddNew();
//    initContactsModyfication();
    fillContactsForm
            (group, false);
    submitUpdateContacts();
    returnToHomePage();
  }

  public boolean isThereAGroupContacts() {
    return isElementPresent(By.name("selected[]"));
  }
}
