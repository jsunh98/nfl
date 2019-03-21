package org.wecancodeit.nfl.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.nfl.models.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

}
