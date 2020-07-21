Feature:Login feature
  1. As a user, I should be able to send messages by clicking
  on Message tab under Active Stream.

  Background: Back story user is on the login page
    Given User is on the login page
@login
    Scenario: User should be able to send messages by clicking on Message
      Then User logs in username and password
      Then User sees  Portal title
      And  User clicks more and selects file
      Then User clicks on upload files and pictures from local diskis
      Then User downloads from external drive
      Then User selects documents bitrix24
      Then User creates file to upload


