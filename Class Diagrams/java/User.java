import java.util.Map;

class User {
    // The user's first name
    String first_name;

    // The user's last name
    String last_name;

    // THe user's blood type
    String blood_type;

    // The users age
    short age;
    
    // The user's birthday
    String birthday;

    // The user's primary contacts
    Contact[] primary_contacts;

    // The user's secondary contacts
    Contact[] secondary_contacts;

    // The user's last known location
    Location last_known_location;
    
    // The user's primary residence
    short primary_residence;

    // The user's phone pin
    short phone_pin; // Optional

    // The user's AWS Cognito ID (Need to verify if Cognito even gives users an ID)
    String cognito_id;

    // The user's email address
    String email_address; // Optional

    // Returns user data for display on the Lock Screen
    public Map<String, String> getLockScreenData() {};
}
