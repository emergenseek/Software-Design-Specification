// EmergencyService encapsulates the data for a located, nearby emergency service (i.e. Hospital, Pharmacy)
class EmergencyService {
    Location location;
    String name;
    String address;
}

// ServiceLocator provides methods to retrieve emergency service locations
class ServiceLocator {
    // The mobile user's current location
    Location location;

    // The radius in mile
    int radius = 10;

    // Gets emergency services within the range of this.radius
    // This is probably where we would use the Google Maps API
    // returns : a list of nearby EmergencyService locations
    EmergencyService[] getEmergencyServices() {};
    
    // Update what emergency services are being display on the user's screen
    EmergencyService[] updateEmergencyServices(int newRadius) { this.radius = newRadius; };
}
