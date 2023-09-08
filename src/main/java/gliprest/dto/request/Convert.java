package gliprest.dto.request;

import glipBack.entities.Video;
import org.springframework.beans.BeanUtils;

public class Convert {
    public static Video getVideo(VideoRequest videoRequest){
        Video video = new Video();
        BeanUtils.copyProperties(videoRequest, video, "avisIds","proprietaireId","postIds","genreId");
        return video;

    }
}
