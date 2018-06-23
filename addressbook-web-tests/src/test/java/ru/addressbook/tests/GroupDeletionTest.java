package ru.addressbook.tests;

import org.testng.annotations.*;


public class GroupDeletionTest extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
