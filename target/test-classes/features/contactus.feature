Feature: Navigate to Securepay then contact us page and populate the fields

Scenario: Positive test validating Contact us page
Given Initialize the browser with Firefox
And Navigate to "https://www.google.com" Site
And Search for "SecurePay" and navigate to the same
When Navigate to ContactUs Page
And Populate all the fields in contact us page
Then close browsers









