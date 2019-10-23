package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletions extends TestBase {

  @Test
  public void testGroupDeletions() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }
}