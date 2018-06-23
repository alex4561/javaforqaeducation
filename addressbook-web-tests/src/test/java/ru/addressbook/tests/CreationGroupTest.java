package ru.addressbook.tests;


import org.testng.annotations.*;

public class CreationGroupTest extends TestBase{

  @Test
  public void testCreationGroup() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupMethod(new GroupData("Test1", "Test2", "test3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
