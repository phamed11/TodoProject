package com.greenfoxacademy.connectionmysql.controllers;

import com.greenfoxacademy.connectionmysql.services.AssigneeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssigneeRestController {

  private AssigneeServices assigneeServices;

  @Autowired
  public AssigneeRestController(AssigneeServices assigneeServices) {
    this.assigneeServices = assigneeServices;
  }

  @GetMapping("/api/assignees")
  public Object listOfAssignees() {
    return assigneeServices.findAllAssignees();
  }
}
