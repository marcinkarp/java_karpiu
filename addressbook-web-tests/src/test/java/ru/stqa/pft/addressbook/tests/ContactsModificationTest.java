package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupContacts;

public class ContactsModificationTest extends TestBase {

  @Test

  public void testContactsModyfication() {
    app.getContactsHelper().startHomePage();
    if (!app.getContactsHelper().isThereAGroupContacts()) {
      app.getContactsHelper().createGroupContacts
              (new GroupContacts("Bolek", "Lolek", "PO", "dsada", "151515", "dasdasda", null), false);
    }
    app.getContactsHelper().initContactsModyfication();
    app.getContactsHelper().fillContactsForm
            (new GroupContacts("Montek","KOTEL","LSD","dsada","151515","dasdasda", null), false);
    app.getContactsHelper().submitUpdateContacts();
    app.getContactsHelper().returnToHomePage();
  }

}