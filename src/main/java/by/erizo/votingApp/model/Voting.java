package by.erizo.votingApp.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "voting")
public class Voting {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "THEME")
    @NotEmpty
    private String theme;

    @OneToMany(cascade=CascadeType.ALL)
    private Set<Vote> options = new HashSet<>();

    @Column(name = "STATUS")
    @NotNull
    private Boolean status;

    public Voting() {
    }

    public Voting(String theme, Boolean status, Set<Vote> options) {
        this.theme = theme;
        this.options = options;
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

    public Set<Vote> getOptions() {
        return options;
    }

    public void setOptions(Set<Vote> options) {
        this.options = options;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}
