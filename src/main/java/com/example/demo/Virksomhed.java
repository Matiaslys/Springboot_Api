package com.example.demo;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Virksomhed {

    private String Navn;
    @Id
    private int CVR;
    private Integer Investeret_Kapital;
    private Integer Imaterielle_anlægsaktiver;
    private Integer materielle_anlægsaktiver;
    private Integer Netto_arbejdskapital;
    private Integer Varebeholdninger;
    private Integer Tilgodehavender_fra_salg;
    private Integer Igangværende_arbejde;
    private Integer Andre_tilgodehavender;
    private Integer Periodeafgrænsningsposter;
    private Integer Hensættelser_sumpost;
    private Integer Varekreditorer;
    private Integer Forudbetalinger;
    private Integer Selskabsskat;
    private Integer Anden_gæld;
    private Integer Periodeafgrænsningsposter_kort_gæld;
    private Integer Udskudt_skat;
    private Integer pensioner;
    private Integer Øvrige_hensættelser;
    private Integer Primært_resultat;
    private Integer Skat_på_driftsresultat;
    private Integer Skat_af_årets_resultat;
    private Integer Skat_af_ekstraordinært_resultat;
    private Integer Resultat_før_skat;
    private Integer EBIT;
    private Integer A_conto_igangværende_arbejde_brutto_note;

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public int getCVR() {
        return CVR;
    }

    public void setCVR(int CVR) {
        this.CVR = CVR;
    }

    public Integer getInvesteret_Kapital() {
        return Investeret_Kapital;
    }

    public void setInvesteret_Kapital(Integer investeret_Kapital) {
        Investeret_Kapital = investeret_Kapital;
    }

    public Integer getImaterielle_anlægsaktiver() {
        return Imaterielle_anlægsaktiver;
    }

    public void setImaterielle_anlægsaktiver(Integer imaterielle_anlægsaktiver) {
        Imaterielle_anlægsaktiver = imaterielle_anlægsaktiver;
    }

    public Integer getMaterielle_anlægsaktiver() {
        return materielle_anlægsaktiver;
    }

    public void setMaterielle_anlægsaktiver(Integer materielle_anlægsaktiver) {
        this.materielle_anlægsaktiver = materielle_anlægsaktiver;
    }

    public Integer getNetto_arbejdskapital() {
        return Netto_arbejdskapital;
    }

    public void setNetto_arbejdskapital(Integer netto_arbejdskapital) {
        Netto_arbejdskapital = netto_arbejdskapital;
    }

    public Integer getVarebeholdninger() {
        return Varebeholdninger;
    }

    public void setVarebeholdninger(Integer varebeholdninger) {
        Varebeholdninger = varebeholdninger;
    }

    public Integer getTilgodehavender_fra_salg() {
        return Tilgodehavender_fra_salg;
    }

    public void setTilgodehavender_fra_salg(Integer tilgodehavender_fra_salg) {
        Tilgodehavender_fra_salg = tilgodehavender_fra_salg;
    }

    public Integer getIgangværende_arbejde() {
        return Igangværende_arbejde;
    }

    public void setIgangværende_arbejde(Integer igangværende_arbejde) {
        Igangværende_arbejde = igangværende_arbejde;
    }

    public Integer getAndre_tilgodehavender() {
        return Andre_tilgodehavender;
    }

    public void setAndre_tilgodehavender(Integer andre_tilgodehavender) {
        Andre_tilgodehavender = andre_tilgodehavender;
    }

    public Integer getPeriodeafgrænsningsposter() {
        return Periodeafgrænsningsposter;
    }

    public void setPeriodeafgrænsningsposter(Integer periodeafgrænsningsposter) {
        Periodeafgrænsningsposter = periodeafgrænsningsposter;
    }

    public Integer getHensættelser_sumpost() {
        return Hensættelser_sumpost;
    }

    public void setHensættelser_sumpost(Integer hensættelser_sumpost) {
        Hensættelser_sumpost = hensættelser_sumpost;
    }

    public Integer getVarekreditorer() {
        return Varekreditorer;
    }

    public void setVarekreditorer(Integer varekreditorer) {
        Varekreditorer = varekreditorer;
    }

    public Integer getForudbetalinger() {
        return Forudbetalinger;
    }

    public void setForudbetalinger(Integer forudbetalinger) {
        Forudbetalinger = forudbetalinger;
    }

    public Integer getSelskabsskat() {
        return Selskabsskat;
    }

    public void setSelskabsskat(Integer selskabsskat) {
        Selskabsskat = selskabsskat;
    }

    public Integer getAnden_gæld() {
        return Anden_gæld;
    }

    public void setAnden_gæld(Integer anden_gæld) {
        Anden_gæld = anden_gæld;
    }

    public Integer getPeriodeafgrænsningsposter_kort_gæld() {
        return Periodeafgrænsningsposter_kort_gæld;
    }

    public void setPeriodeafgrænsningsposter_kort_gæld(Integer periodeafgrænsningsposter_kort_gæld) {
        Periodeafgrænsningsposter_kort_gæld = periodeafgrænsningsposter_kort_gæld;
    }

    public Integer getUdskudt_skat() {
        return Udskudt_skat;
    }

    public void setUdskudt_skat(Integer udskudt_skat) {
        Udskudt_skat = udskudt_skat;
    }

    public Integer getPensioner() {
        return pensioner;
    }

    public void setPensioner(Integer pensioner) {
        this.pensioner = pensioner;
    }

    public Integer getØvrige_hensættelser() {
        return Øvrige_hensættelser;
    }

    public void setØvrige_hensættelser(Integer øvrige_hensættelser) {
        Øvrige_hensættelser = øvrige_hensættelser;
    }

    public Integer getPrimært_resultat() {
        return Primært_resultat;
    }

    public void setPrimært_resultat(Integer primært_resultat) {
        Primært_resultat = primært_resultat;
    }

    public Integer getSkat_på_driftsresultat() {
        return Skat_på_driftsresultat;
    }

    public void setSkat_på_driftsresultat(Integer skat_på_driftsresultat) {
        Skat_på_driftsresultat = skat_på_driftsresultat;
    }

    public Integer getSkat_af_årets_resultat() {
        return Skat_af_årets_resultat;
    }

    public void setSkat_af_årets_resultat(Integer skat_af_årets_resultat) {
        Skat_af_årets_resultat = skat_af_årets_resultat;
    }

    public Integer getSkat_af_ekstraordinært_resultat() {
        return Skat_af_ekstraordinært_resultat;
    }

    public void setSkat_af_ekstraordinært_resultat(Integer skat_af_ekstraordinært_resultat) {
        Skat_af_ekstraordinært_resultat = skat_af_ekstraordinært_resultat;
    }

    public Integer getResultat_før_skat() {
        return Resultat_før_skat;
    }

    public void setResultat_før_skat(Integer resultat_før_skat) {
        Resultat_før_skat = resultat_før_skat;
    }

    public Integer getEBIT() {
        return EBIT;
    }

    public void setEBIT(Integer EBIT) {
        this.EBIT = EBIT;
    }

    public Integer getA_conto_igangværende_arbejde_brutto_note() {
        return A_conto_igangværende_arbejde_brutto_note;
    }

    public void setA_conto_igangværende_arbejde_brutto_note(Integer a_conto_igangværende_arbejde_brutto_note) {
        A_conto_igangværende_arbejde_brutto_note = a_conto_igangværende_arbejde_brutto_note;
    }
}
