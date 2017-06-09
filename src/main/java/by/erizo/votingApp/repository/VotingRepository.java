package by.erizo.votingApp.repository;

import by.erizo.votingApp.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotingRepository extends JpaRepository<Vote, Long> {

}
