package com.Services;

import com.models.Authentication;
import com.models.Distributors;
import com.models.User;

public interface OnboardingInterface {
    void setMetadata();
    String Login(Authentication payload);
    String SignUp(Authentication payload);
    String userRegistration(User payload);
    String distributorRegistration(Distributors payload);
}
