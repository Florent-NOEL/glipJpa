package gliprest.dto.request;

import glipBack.entities.Avis;
import glipBack.entities.Genre;
import glipBack.entities.Post;
import glipBack.entities.Utilisateur;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

public class VideoRequest {
    @Column(name = "video_nom")
    private String nom;
    @Id
    @Column(name = "video_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    private String description;

    private Double noteMoyenneVideo;

    private LocalDate date;

    private LocalTime duree;

    private List<Long> utilisateurslikeIds;

    private Long proprietaireId;

    private List<Long> postids;
    private Long genreId;

}
