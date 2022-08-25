package com.bridgelabz.lmsspringbatch.config;



import com.bridgelabz.lmsspringbatch.entity.Candidate;
import org.springframework.batch.item.ItemProcessor;

public class CandidateProcessor implements ItemProcessor<Candidate,Candidate> {

    @Override
    public Candidate process(Candidate candidate) throws Exception {
        if(candidate.getCandidateStatus().equals("complete")) {
            return candidate;
        }else{
            return null;
        }
    }
}