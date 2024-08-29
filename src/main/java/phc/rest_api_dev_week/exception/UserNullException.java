package phc.rest_api_dev_week.exception;

import java.io.Serial;

public class UserNullException extends NullPointerException {

    @Serial
    private static final long serialVersionUID = 1L;

    public String getMessage() {
        return "There should not null fields";
    }
}
