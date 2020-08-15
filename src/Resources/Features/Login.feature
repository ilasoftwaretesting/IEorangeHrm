@OrangeHrm
Feature: I would like to login
  so as user i want login
  Background: I am on login page
  Scenario Outline: I am not able to log in massage will appear we are having trouble to confirming details please try again


    When I enter username "<username>"
    And I enter password "<password>"
    And I click on login button
    Then I am not able to log in successfully and  i should see error "<errormessage>"



    Examples:

      | username        |         password       |       errormessage           |
      | Admin           |   admin123             |    Invalid credentials     |
       #| Admin           |         admiin123      |  Invalid credentials        |
       #|                 |         admin123       |Username cannot be empty     |
       #|Admin            |                        |Password cannot be empty     |
       #|Admin            |       Admin123         |Invalid credentials|
       #|admin            |      admin1234         |Invalid credentials          |
       #|                 |                        |Username cannot be empty     |

