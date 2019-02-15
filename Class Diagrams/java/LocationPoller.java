// LocationPoller provides the location-based polling feature
class LocationPoller implements LocationFunctions {
    // Where is the user currently located
    Location location;

    // What user is currently being polled
    User user;

    // How often should the location be sent out
    int frequency;

    // Send the users current location and metadata to their contacts
    StatusCode sendLocation() {};
    
    // Not sure if this should be here
    StatusCode sendCall() {};

    // Update the users current location and set User.last_known_location
    void updateLocation() {};
}
