package by.erizo.votingApp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vote")
public class Vote {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "THEME")
    private String theme;

//    @Column(name = "OPTIONS")
//    @OneToMany(mappedBy = "vote")
//    private List<String> options;

    @Column(name = "STATUS")
    private Boolean status;

    public Vote() {
    }

    public Vote(Long id, String theme, Boolean status) {
        this.id = id;
        this.theme = theme;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }



    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}
