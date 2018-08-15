package ru.addressbook.tests.test;


import org.testng.annotations.*;
import ru.addressbook.tests.model.GroupData;

public class CreationGroupTest extends TestBase{

  @Test
  public void testCreationGroup() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupMethod(new GroupData("Test1", "Test2", "test3"));
    app.getGroupHelper().submitGroupCreation("submit");
    app.getGroupHelper().returnToGroupPage();
  }

}
