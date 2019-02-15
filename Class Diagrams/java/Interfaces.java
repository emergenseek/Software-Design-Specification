interface LocationFunctions {
    // Use API provider to send the user's current location via SMS
    StatusCode sendLocation();

    // Use API provider to send the user's current location via programmable voice call
    StatusCode sendCall();
}

interface SOSFunctions {
    // Method names are self-explanatory
    StatusCode notifyEmergencyServices();
    StatusCode notifyPrimaryContacts();
    StatusCode notifySecondaryContacts();    
}
