Feature:Login feature
  1. As a user, I should be able to send messages by clicking
  on Message tab under Active Stream.

 Scenario:User clicks on upload files and pictures from local disks,downloads from external drive
      Given User is on the landing page
      Then User logs in as "hr"
      And User navigate to "Activity Stream"
      When user cliks on send message button
      And uploads following file:
     |file path| src/test/resources/testData/pupy.jpg
      Then user click on send button