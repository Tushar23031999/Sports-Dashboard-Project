package io.tushark.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.tushark.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}