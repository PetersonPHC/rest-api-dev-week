package phc.rest_api_dev_week.service;

import phc.rest_api_dev_week.domain.model.User;
import phc.rest_api_dev_week.domain.repository.UserRepository;

public interface UserService {

    User findByID(Long id);
    User create(User userToCreate);

}
