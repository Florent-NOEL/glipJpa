package gliprest.dto.response;

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

    private AvisResponse avisResponse;

    private UtilisateurResponse proprietaire;

    private List<Long> postIds;
    private Long genreId;
}
