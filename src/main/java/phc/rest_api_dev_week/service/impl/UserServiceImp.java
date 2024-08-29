package phc.rest_api_dev_week.service.impl;

import org.springframework.stereotype.Service;
import phc.rest_api_dev_week.domain.model.User;
import phc.rest_api_dev_week.domain.repository.UserRepository;
import phc.rest_api_dev_week.exception.UserAlreadlyExistsException;
import phc.rest_api_dev_week.exception.UserNullException;
import phc.rest_api_dev_week.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImp implements UserService {

    UserRepository repository;

    public UserServiceImp(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findByID(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getName() == null){
            throw new UserNullException();
        }else if (repository.existsById(userToCreate.getId())){
            throw new UserAlreadlyExistsException("id");
        }else if (repository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new UserAlreadlyExistsException("accountNumber");
        }else{
            return repository.save(userToCreate);
        }
    }
}
