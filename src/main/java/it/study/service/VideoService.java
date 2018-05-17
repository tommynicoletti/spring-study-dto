package it.study.service;

import it.study.domain.Video;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    public Video getVideo(Long id){
        Video video = new Video();
        video.setCompression("mp4");
        video.setDuration("9600");
        video.setEncodedDate(ZonedDateTime.now());
        video.setId(id);
        video.setPath("/a/fake/path/video.mp4");
        return video;
    }

    public List<Video> getVideos(){
        ArrayList<Video> videos = new ArrayList<>();
        for(int i=12345;i<12349;i++){
            Video video = getVideo(new Long(i));
            videos.add(video);
        }
        return videos;
    }
}
