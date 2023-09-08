package gliprest.dto.response;

import glipBack.entities.Video;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class VideoResponse {
    private String nom;

    private Long id;

    private String url;

    private String description;

    private Double noteMoyenneVideo;

    private LocalDate date;

    private LocalTime duree;

/*
    private AvisResponse avis;

    private UtilisateurResponse proprietaire;

    private List<PostResponse> posts;
    private GenreResponse genre;
*/

    public VideoResponse() {
    }
    public VideoResponse(Video video) {
        BeanUtils.copyProperties(video, this, "avis", "proprietaire", "posts", "genre");

    }
}
