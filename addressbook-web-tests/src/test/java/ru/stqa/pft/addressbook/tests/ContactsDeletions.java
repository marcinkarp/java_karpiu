package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactsDeletions extends TestBase {

  @Test

  public void testContactsDeletions() {
    app.getContactsHelper().startHomePage();
    app.getContactsHelper().selectedContacts();
    app.getContactsHelper().deletedContacts();

  }
}
