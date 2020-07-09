#Author: prakash.email@your.domain.com
Feature: Add Tariff Plan2
  User creatinng new tariff plan2
    
   Scenario Outline: using outline2
    Given User launch the tellecom application2
    And User navigates into tarriff plan page2
    When User fills all the fields3 "<Rental>","<Local_minutes>","<Inter_minutes>","<Sms_pack>","<Minutes_charges>","<Inter_charges>","<Sms_charges>"
    And User click on Tariiff2 submit button
    Then User is displayed with  message tariff plann2 created

    Examples: 
      | Rental | Local_minutes | Inter_minutes | Sms_pack | Minutes_charges | Inter_charges | Sms_charges |
      |   1000 |          5000 |           200 |      100 |               2 |            50 |           1 |
      |    900 |          4500 |           300 |      200 |               3 |            40 |           2 |
      |    800 |          4000 |           400 |      300 |               4 |            30 |           3 |
	      |    700 |          3500 |           500 |      400 |               5 |            20 |           4 |