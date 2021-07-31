Feature: As a sports user, I would like to read about all articles related to sports

  @regression
  Scenario: Use the search option to find all articles related to ‘sports’. Output the first heading and the last heading returned on the page.
    Given  go to ""https://www.bbc.co.uk/sport/football/scores-fixtures""
    And  enter "sports" Search text box
    When click on search button
    Then redirect to related page



