package gliprest.dto.request;

import glipBack.entities.Avis;
import glipBack.entities.Post;
import glipBack.entities.Role;
import glipBack.entities.Video;

import java.util.List;
import java.util.Set;

public class UtilisateursRequest {
    private String id;
    private String mail;
    private String password;
    private  String pseudo;
    private String role;
    private List<Long> postIds;
    private List<Long> avisIds;

    public List<Long> getAvisIds() {
        return avisIds;
    }

    public void setAvisIds(List<Long> avisIds) {
        this.avisIds = avisIds;
    }

    private List<Long>videosPosteeIds;

    public UtilisateursRequest() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Long> getPostIds() {
        return postIds;
    }

    public void setPostIds(List<Long> postIds) {
        this.postIds = postIds;
    }


    public List<Long> getVideosPosteeIds() {
        return videosPosteeIds;
    }

    public void setVideosPosteeIds(List<Long> videosPosteeIds) {
        this.videosPosteeIds = videosPosteeIds;
    }
}
