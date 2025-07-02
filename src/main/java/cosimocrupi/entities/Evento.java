package cosimocrupi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="Evento")
public class Evento{
    @Id
    UUID id;

    @Column(name = "Titolo")
    private String titolo;

    @Column(name = "Data evento")
    private LocalDate dataEvento;

    @Column(name = "Descrizione", nullable = false)
    private String descrizione;

    @Column(name = "Tipo di evento")
    @Enumerated(EnumType.STRING)
    private Tipo tipoEvento;

    @Column(name = "Max partecipanti")
    private int numeroMassimoPartecipanti;
    public Evento(String titolo, LocalDate dataEvento, String descrizione, Tipo tipoEvento, int numeroMassimoPartecipanti){
        this.titolo=titolo;
        this.dataEvento=dataEvento;
        this.descrizione=descrizione;
        this.tipoEvento=tipoEvento;
        this.numeroMassimoPartecipanti=numeroMassimoPartecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        if (this.descrizione==null){
            return "Manca la descizione";
        }else {
            return descrizione;
        }
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Tipo getTipoEvento() {
        return tipoEvento;
    }
    public void setTipoEvento(Tipo tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }
    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
}
