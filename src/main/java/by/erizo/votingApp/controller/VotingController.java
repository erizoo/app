package by.erizo.votingApp.controller;

import by.erizo.votingApp.model.ResponseWrapper;
import by.erizo.votingApp.model.Vote;
import by.erizo.votingApp.service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vote")
public class VotingController {

    @Autowired
    private VotingService votingService;

    @PostMapping("/")
    public ResponseWrapper<Vote> createVote(@RequestBody Vote vote){
        return new ResponseWrapper<>(votingService.createVote(vote));
    }

    @PutMapping("/{id}")
    public ResponseWrapper<Vote> updateVoting(@RequestBody Vote vote, @PathVariable Long id){
        return new ResponseWrapper<>(votingService.updateVote(vote));
    }

    @GetMapping("/")
    public ResponseWrapper<List<Vote>> listVote(){
        return new ResponseWrapper<>(votingService.getVote());
    }

    @GetMapping("/{id}")
    public ResponseWrapper<Vote> getVoteInfo(@PathVariable Long id){
        Optional<Vote> voteOptional = votingService.getInfo(id);
        if (voteOptional.isPresent()) {
            return new ResponseWrapper<>(voteOptional.get());
        } else {
            throw new RuntimeException("Not found by id: " + id.toString());
        }
    }

    @PostMapping("/{id}/vote")
    public ResponseWrapper<Vote> voteRegistration(@PathVariable Long id, @RequestBody Vote vote){
        return new ResponseWrapper<>(votingService.saveVote(vote));
    }

}
