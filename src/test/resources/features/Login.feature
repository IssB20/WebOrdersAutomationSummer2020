Feature: Login

  Scenario: User should be able to logs in
    Given user in on the landing page
    When user logs in
    Then user should see see "Web Orders" page title