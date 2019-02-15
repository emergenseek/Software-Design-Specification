import java.sql.Timestamp;

// StatusCode defines the return status of location and emergency related operations
class StatusCode {
    // Some HTTP status code to allow user of operation success
    int code;
    
    // The return time of the operation
    Timestamp time;
}
