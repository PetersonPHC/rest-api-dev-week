package phc.rest_api_dev_week.exception;

import java.io.Serial;

public class UserAlreadlyExistsException extends IllegalArgumentException{

    @Serial
    private static final long serialVersionUID = 1L;
    private String type;

    public UserAlreadlyExistsException(String Type) {
        this.type = Type;
    }

    @Override
    public String getMessage() {
        if (type.equals("id")) {
            return "This User ID already exists";
        }
        if (type.equals("accountNumber")) {
            return "This Account Number already exists";
        }
        return super.getMessage();
    }
}
