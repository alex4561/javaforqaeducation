package ru.addressbook.tests;


import org.testng.annotations.*;

public class CreationGroupTest extends TestBase{

  @Test
  public void testCreationGroup() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupMethod(new GroupData("Test1", "Test2", "test3"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
