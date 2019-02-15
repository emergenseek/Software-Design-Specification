// SOS encapsulates operations and attributes necessary for operating the SOS button
class SOS extends LocationPoller implements SOSFunctions {
    // The body of a call (voice) message
    String call_message;
    
    // The body of a text message
    String text_message;

    // The body of an email message
    String email_message;

    // External type provided by Service Provider.
    // Example: com.twilio.sdk.TwilioRestClient (https://www.twilio.com/docs/libraries/java#authenticate-client)
    // ServiceProvider sp; 
    
    // doSevere provides the logic needed to support the SOS button's severe option
    StatusCode doSevere() {};

    // doMild provides the logic needed to support the SOS button's mild option:
    StatusCode doMild() {};

    // doMild doSafteyCheck the logic needed to support the SOS button's safety check option (send a message to loved ones just to check in)    
    StatusCode doSafteyCheck(String message) {};
}