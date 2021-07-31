Feature: Login


    Scenario Outline:invalid Login Data Driven
      Given User Launch Chrome browser  and open Url "https://www.bbc.co.uk/sport/football/scores-fixtures"
      When User clicks on Sign in label
      When User enters Email as "<Username>" and Password as "<Password>"
      And User Enter Sign in button
      Then user gets "login failed error" message
      And :close browser

      Examples:
        |Username|Password|
        |         |       |
        |  mit_shlok@yahoo.com | |
        |  invalidU | validPassword  |
        |  mit_shlok@yahoo.com | mitka |
        | mit_shlok@yahoo.com |  lessThanEightCharacters  |
        |  invalidChartersSymbol|    vallidPAssword  |

