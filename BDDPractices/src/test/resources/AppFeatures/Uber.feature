Feature: Uber Booking Feature

@smoke
Scenario: Booking can Sedan
Given user wants to select car type "Sedan" from uber application
When user selects car "Sedan" and pick up point "Bengaluru" and drop location "pune"
Then Driver starts the journey
And Driver ends the journey
Then user pay 1000 USD

@regression
Scenario: Booking can SUV
Given user wants to select car type "SUV" from uber application
When user selects car "Sedan" and pick up point "Bengaluru" and drop location "Hydrabad"
Then Driver starts the journey
And Driver ends the journey
Then user pay 1000 USD

@prod
Scenario: Booking can Mini
Given user wants to select car type "Mini" from uber application
When user selects car "Sedan" and pick up point "Bengaluru" and drop location "Chennai"
Then Driver starts the journey
And Driver ends the journey
Then user pay 1000 USD
