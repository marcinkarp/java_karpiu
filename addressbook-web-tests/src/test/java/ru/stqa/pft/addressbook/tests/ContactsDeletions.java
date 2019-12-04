package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupContacts;

public class ContactsDeletions extends TestBase {

  @Test

  public void testContactsDeletions() {
    app.getContactsHelper().startHomePage();
    if (!app.getContactsHelper().isThereAGroupContacts()) {
      app.getContactsHelper().createGroupContacts(new GroupContacts("Bolek","Lolek","PO","dsada","151515","dasdasda", null), false);
    }
    app.getContactsHelper().selectedContacts();
    app.getContactsHelper().deletedContacts();

  }
}
