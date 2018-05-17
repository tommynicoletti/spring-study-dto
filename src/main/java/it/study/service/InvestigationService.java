package it.study.service;

import it.study.domain.Investigation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class InvestigationService {

    private VideoService videoService;

    @Autowired
    public InvestigationService(VideoService videoService){
        this.videoService = videoService;
    }

    public Investigation getInvestigation(Long id){
        Investigation investigation = new Investigation();
        investigation.setId(id);
        investigation.setDescription("A test description");
        investigation.setStartTime(ZonedDateTime.now());
        investigation.setEndTime(ZonedDateTime.now().plusDays(3));
        investigation.setName("Test Investigation");
        investigation.setVideos(videoService.getVideos());
        return investigation;
    }
}
