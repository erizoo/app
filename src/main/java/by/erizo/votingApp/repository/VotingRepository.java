package by.erizo.votingApp.repository;

import by.erizo.votingApp.model.Voting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotingRepository extends JpaRepository<Voting, Long> {

}
