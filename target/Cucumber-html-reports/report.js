$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/PRAKASH/workspace/Cucumber1/src/test/resources/Features/AddCustomer1.feature");
formatter.feature({
  "name": "Add Customer Step",
  "description": "  User creating new account",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Hardcoded1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@prakash"
    }
  ]
});
formatter.step({
  "name": "User launch tellecom application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTarifffPlan.user_launch_tellecom_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates into add customer page1",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerStepps.user_navigates_into_add_customer_page1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter all the fields in page1",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerStepps.user_enter_all_the_fields_in_page1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit button page1",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerStepps.user_click_on_submit_button_page1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed customer id is generated in page1",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerStepps.user_should_be_displayed_customer_id_is_generated_in_page1()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/PRAKASH/workspace/Cucumber1/src/test/resources/Features/AddTariffPlan1.feature");
formatter.feature({
  "name": "Add Tariff Plan1",
  "description": "  User creating new tariff plan",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "two dim map",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@prakash"
    }
  ]
});
formatter.step({
  "name": "User launch tellecom application",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTarifffPlan.user_launch_tellecom_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates into tarriff plan page",
  "keyword": "And "
});
formatter.match({
  "location": "AddTarifffPlan.user_navigates_into_tarriff_plan_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fills all the fields by using 2dim map",
  "rows": [
    {
      "cells": [
        "rental",
        "local_minutes",
        "inter_minutes",
        "sms_pack",
        "minutes_charges",
        "inter_charges",
        "sms_charges"
      ]
    },
    {
      "cells": [
        "1000",
        "5000",
        "200",
        "100",
        "2",
        "50",
        "1"
      ]
    },
    {
      "cells": [
        "900",
        "4500",
        "300",
        "200",
        "3",
        "40",
        "2"
      ]
    },
    {
      "cells": [
        "800",
        "4000",
        "400",
        "300",
        "4",
        "30",
        "3"
      ]
    },
    {
      "cells": [
        "700",
        "3500",
        "500",
        "400",
        "5",
        "20",
        "4"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTarifffPlan.user_fills_all_the_fields_by_using_2dim_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Tariiff submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTarifffPlan.user_click_on_Tariiff_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is displayed with the message tariff plann created",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTarifffPlan.user_is_displayed_with_the_message_tariff_plann_created()"
});
formatter.result({
  "status": "passed"
});
});