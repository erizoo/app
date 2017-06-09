package by.erizo.votingApp.service;

import by.erizo.votingApp.model.Vote;

import java.util.List;
import java.util.Optional;

/**
 * Created by Erizo on 10.06.2017.
 */

public interface VotingService {


    Vote createVote(Vote vote);

    List<Vote> getVote();

    Vote updateVote(Vote vote);

    Optional<Vote> getInfo(Long id);

    Vote saveVote(Vote vote);
}
