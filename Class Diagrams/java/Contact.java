// Contact defines a user's contacts; primary or secondary
class Contact {
    // The contact's first name
    String first_name;

    // The contact's last name
    String last_name;

    // The contact's phone number
    String phone_number;

    // The contact's relationship to the user
    String relationship;

    // The contact's address
    Address address;
    
    // The contact's permissions (what information can they see about the user?)
    Permissions permissions;
}
