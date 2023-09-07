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
    private String nom;

    private Long id;

    private String url;

    private String description;

    private Double noteMoyenneVideo;

    private LocalDate date;

    private LocalTime duree;

    private List<Long> avisIds;

    private Long proprietaireId;

    private List<Long> postIds;
    private Long genreId;

    public VideoRequest() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getNoteMoyenneVideo() {
        return noteMoyenneVideo;
    }

    public void setNoteMoyenneVideo(Double noteMoyenneVideo) {
        this.noteMoyenneVideo = noteMoyenneVideo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }

    public List<Long> getAvisIds() {
        return avisIds;
    }

    public void setAvisIds(List<Long> avisIds) {
        this.avisIds = avisIds;
    }

    public Long getProprietaireId() {
        return proprietaireId;
    }

    public void setProprietaireId(Long proprietaireId) {
        this.proprietaireId = proprietaireId;
    }

    public List<Long> getPostIds() {
        return postIds;
    }

    public void setPostIds(List<Long> postIds) {
        this.postIds = postIds;
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }
}
