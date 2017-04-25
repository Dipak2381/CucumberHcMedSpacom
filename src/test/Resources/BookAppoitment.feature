Feature: Booking appoitment funtionality
  Background: Oprating System:Window 7
             Browser version:
    @TestPrince
    Scenario: user booking appoitment for message treatment
      Given user already on homepage
      When I click on Beauty
      Then I see beauty treatment list
      When I click on threading treatment
      Then I see threading price
      And I enter fullname
      And I enter telephone number
      And I enter email address
      When I select threading treatment
      And when I slecte prefered clinic
      When I click on submit
      Then I see booking done sucessfully
