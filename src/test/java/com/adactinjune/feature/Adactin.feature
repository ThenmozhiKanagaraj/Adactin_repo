Feature: Hotel Booking In Adactin Application

@smoketest
Scenario Outline:Adactin
Given user Launch The Application
When user Enter The "<username>" In UserField
And  user Enter The "<password>" In PasswordField
Then user Click On The Login Button And Navigate To Search Hotel Page
Examples: 
|username|password|
|111|123|
|123|12333|
|Dhikshan|dhikshan|

@sanitytest

Scenario: 
When user Select The Location Of The Hotel In Loction Field
And  user Select The Hotel In Hotels Field
And  user Select The Room Type In Room Type Field
And  user Select The Number Of Rooms In Number Of Room Field
And  user Enter The Check In Date In Check In Date Field
And  user Enter The Check Out Date In Check Out Date Field
And  user Select The Adults Per Room In Adults Per Room Field
And  user Select The Childern Per Room In Childern Per Room Field
Then user Click On Search Button And It Navigate To Select Hotel Page

@sanitytest
Scenario: 
When  user Select The Hotels In Select RadioButton
Then  user Click On Continue Button And It Navigate TO Book A Hotel Page
@sanitytest
Scenario: 
When user Enter The "Thenmozhi" In First Name Field
And user Enter The "Kanagaraj" In Last Name Field
And user Enter The Billing Address In Billing Address
And user Enter The Credit Card No In Credit Card No Field
And user Enter The Credit Card Type In Credit Card Type Field
And user Select Month In Expiry Date DropDown
And user Select Year In Expiry Date DropDown
And user Enter The Ccv Number In Ccv Number Field
Then user Click On Book Now Button And Navigate To Booking Confirmation page

@sanitytest
Scenario: 
Then user Click My Itinerary And Navigate TO Booked Itinerary page

@Regresstiontest
Scenario: 
Then user Click Logout Button To Logout Application


