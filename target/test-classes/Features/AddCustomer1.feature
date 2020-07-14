#Author: prakash.email@your.domain.com

Feature: Add Customer Step
  User creating new account

  Background: 
    And User navigates into add customer page1

  @sanity @prakash
  Scenario: Hardcoded1
    When User enter all the fields in page1
    And User click on submit button page1
    Then User should be displayed customer id is generated in page1

  Scenario: one dimensional list1
    When User enters all the fields by using 1dims list
      | prakash | raj | praki@gmail.com | krishnagiri | 9952301741 |
    And User click on submit button page1
    Then User should be displayed customer id is generated in page1

@sanity @prakash
  Scenario: one dimensional map1
    When User enters all the fields by using 1dim map
      | fname | prakash          |
      | lname | raj              |
      | mail  | prakki@gmail.com |
      | add   | krishnagiri      |
      | phno  |       9952301741 |
    And User click on submit button page1
    Then User should be displayed customer id is generated in page1

  Scenario: two dimensional list1
    When User enters all the fields by using 2dim list1
      | prakash | raj | pra@gmail.com | kri | 9952301741 |
      | arun    | raj | aru@gmail.com | tri | 9698299284 |
      | suresh  | ray | sur@gmail.com | che | 9087678538 |
      | vivek   | roy | viv@gmail.com | rai | 8072210332 |
    And User click on submit button page1
    Then User should be displayed customer id is generated in page1

  Scenario: two dimensional map1
    When User enters all the fields by using 2dim map1
      | prakash | raj | pra@gmail.com | kri | 9952301741 |
      | arun    | raj | aru@gmail.com | tri | 9698299284 |
      | suresh  | ray | sur@gmail.com | che | 9087678538 |
      | vivek   | roy | viv@gmail.com | rai | 8072210332 |
    And User click on submit button page1
    Then User should be displayed customer id is generated in page1

  Scenario Outline: by using outline1
    When User enters all the fields2 "<Fname>","<Lname>","<Mail>","<Add>","<Phno>"
    And User click on submit button page1
    Then User should be displayed customer id is generated in page1

    Examples: 
      | Fname   | Lname | Mail          | Add | Phno       |
      | prakash | raj   | pra@gmail.com | kri | 9952301741 |
      | arun    | raj   | aru@gmail.com | tri | 9698299284 |
      | suresh  | ray   | sur@gmail.com | che | 9087678538 |
      | vivek   | roy   | viv@gmail.com | rai | 8072210332 |
