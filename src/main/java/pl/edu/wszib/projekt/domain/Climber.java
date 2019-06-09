package pl.edu.wszib.projekt.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "climberss")
public class Climber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String imie;

    @Column(unique = true)
    private String nazwisko;

    @OneToMany
    @JoinColumn(name="climber_id")
    List<SelectedRout> selectedRouts;

    public Climber() {
    }

    public Climber(String routn) {
        this.imie = routn;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public List<SelectedRout> getSelectedRouts() {
        return selectedRouts;
    }

    public void setSelectedRouts(List<SelectedRout> selectedRouts) {
        this.selectedRouts = selectedRouts;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}


