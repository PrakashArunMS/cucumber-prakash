
#Author: prakash1.email@your.domain.com
Feature: Add Tariff Plan3
  User creatinng new tariff plan2
    
   Scenario Outline: using the outline
    Given User launch the tellecom application3
    And User navigates into tarriff plan page3
    When User must fills all the fields "<Rental>","<Local_minutes>","<Inter_minutes>","<Sms_pack>","<Minutes_charges>","<Inter_charges>","<Sms_charges>"
    And User click on Tariiff3 submit button
    Then User is displayed with  message tariff plann3 created

    Examples: 
      | Rental | Local_minutes | Inter_minutes | Sms_pack | Minutes_charges | Inter_charges | Sms_charges |
      |   1000 |          5000 |           200 |      100 |               2 |            50 |           1 |
      |    900 |          4500 |           300 |      200 |               3 |            40 |           2 |
      |    800 |          4000 |           400 |      300 |               4 |            30 |           3 |
	      |    700 |          3500 |           500 |      400 |               5 |            20 |           4 |