package com.StarkIndustries.SpringWebMark1.Authentication.Repository;

import com.StarkIndustries.SpringWebMark1.Authentication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationRepository extends JpaRepository<User,String> {
}
