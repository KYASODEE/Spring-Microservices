package io.practise.service;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Component;

import io.practise.model.Model;

@Component
public interface ServiceI {

    List<io.swagger.models.Model> getDetails();

    String createDetails(Model model);

    String  updateDetails(String id, Model model);

    String  deleteDetails(String id);


}