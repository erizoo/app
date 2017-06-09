package by.erizo.votingApp.service.impl;

import by.erizo.votingApp.repository.VotingRepository;
import by.erizo.votingApp.model.Vote;
import by.erizo.votingApp.service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Erizo on 10.06.2017.
 */
@Service
public class VotingServiceImpl implements VotingService {

    @Autowired
    private VotingRepository votingRepository;

    @Override
    public Vote createVote(Vote vote) {
        return votingRepository.saveAndFlush(vote);
    }

    @Override
    public List<Vote> getVote() {
        return votingRepository.findAll();
    }

    @Override
    public Vote updateVote(Vote vote) {
        return votingRepository.saveAndFlush(vote);
    }

    @Override
    public Optional<Vote> getInfo(Long id) {
        return votingRepository.findById(id);
    }

    @Override
    public Vote saveVote(Vote vote) {
        return votingRepository.saveAndFlush(vote);
    }
}
