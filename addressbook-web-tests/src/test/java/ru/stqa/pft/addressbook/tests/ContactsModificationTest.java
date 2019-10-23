package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupContacts;

public class ContactsModificationTest extends TestBase {

  @Test

  public void testContactsModyfication() {
    app.getContactsHelper().startHomePage();
    app.getContactsHelper().initContactsModyfication();
    app.getContactsHelper().fillContactsForm
            (new GroupContacts("Bolek","Lolek","PO","dsada","151515","dasdasda"));
    app.getContactsHelper().submitUpdateContacts();
    app.getContactsHelper().returnToHomePage();
  }

}