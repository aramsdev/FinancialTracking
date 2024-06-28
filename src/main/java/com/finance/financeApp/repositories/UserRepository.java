package com.finance.financeApp.repositories;

import com.finance.financeApp.domain.entities.Card;
import com.finance.financeApp.domain.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {


}
