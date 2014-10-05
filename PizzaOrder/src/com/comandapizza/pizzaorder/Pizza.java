package com.comandapizza.pizzaorder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Pizza implements Serializable {

	static final long serialVersionUID = 32;
	private String nume;
	private List<Ingredient> ingrediente;
	private int diametru;
	private List<String> sosuri;
	private float pret;
	private List<String> instructiuniSpeciale = new ArrayList<String>(
			Arrays.asList("mai coapta", "mai cruda", "fara sos rosii",
					"fara mozarella", "", ""));
	private List<String> tipBlat;
	private List<Integer> listaDiametru = new ArrayList<Integer>(Arrays.asList(
			28, 32, 40));

	private Ingredient blat = new Ingredient("blat", 10);
	private Ingredient masline = new Ingredient("masline", 3);
	private Ingredient porumb = new Ingredient("porumb", 3);
	private Ingredient ananas = new Ingredient("ananas", 3);
	private Ingredient rucola = new Ingredient("rucola", 3);
	private Ingredient halapenos = new Ingredient("halapenos", 3);
	private Ingredient ciuperci = new Ingredient("ciuperci", 3);
	private Ingredient ardeiGras = new Ingredient("ardei gras", 3);
	private Ingredient pepperoni = new Ingredient("pepperoni", 3);
	private Ingredient ardeIute = new Ingredient("ardei iute", 3);
	private Ingredient rosii = new Ingredient("rosii", 3);
	private Ingredient ceapa = new Ingredient("ceapa", 3);
	private Ingredient usturoi = new Ingredient("usturoi", 3);
	private Ingredient brocoli = new Ingredient("brocoli", 3);

	private Ingredient cheddar = new Ingredient("cheddar", 3);
	private Ingredient gorngonzola = new Ingredient("gorgonzola", 3);
	private Ingredient mozarella = new Ingredient("mozarella", 3);
	private Ingredient feta = new Ingredient("feta", 3);
	private Ingredient cascaval = new Ingredient("cascaval", 3);

	private Ingredient ton = new Ingredient("ton", 3);
	private Ingredient fructeDeMare = new Ingredient("fructe de mare", 3);
	private Ingredient sunca = new Ingredient("sunca", 3);
	private Ingredient prosciuto = new Ingredient("prosciuto", 3);
	private Ingredient prosciutoCrudo = new Ingredient("prosciuto crud", 3);
	private Ingredient salam = new Ingredient("salam", 3);
	private Ingredient salamPicant = new Ingredient("salam picant", 3);
	private Ingredient cabanos = new Ingredient("cabanos", 3);
	private Ingredient bacon = new Ingredient("bacon", 3);
	private Ingredient suncaPresata = new Ingredient("sunca presata", 3);
	private Ingredient pieptPui = new Ingredient("piept de pui", 3);
	private Ingredient somon = new Ingredient("somon afumat", 3);

	private List<Ingredient> ingredientQuatroStagioni = new ArrayList<Ingredient>();

	private Pizza quatroStagioni = new Pizza("Quatro Stagioni",
			new ArrayList<Ingredient>(Arrays.asList(ardeiGras, ciuperci, salam,
					sunca)), new ArrayList<String>(Arrays.asList("ketchup")),
			18);

	public Pizza(String nume, List<Ingredient> ingrediente,
			List<String> sosuri, float pret) {
		super();
		this.nume = nume;
		this.ingrediente = ingrediente;
		this.sosuri = sosuri;
		this.pret = pret;
	}

	public Pizza(String nume, List<Ingredient> ingrediente, int diametru,
			List<String> sosuri, float pret, List<String> instructiuniSpeciale,
			List<String> tipBlat) {
		super();
		this.nume = nume;
		this.ingrediente = ingrediente;
		this.diametru = diametru;
		this.sosuri = sosuri;
		this.pret = pret;
		this.instructiuniSpeciale = instructiuniSpeciale;
		this.tipBlat = tipBlat;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public List<Ingredient> getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(List<Ingredient> ingrediente) {
		this.ingrediente = ingrediente;
	}

	public int getDiametru() {
		return diametru;
	}

	public void setDiametru(int diametru) {
		this.diametru = diametru;
	}

	public List<String> getSosuri() {
		return sosuri;
	}

	public void setSosuri(List<String> sosuri) {
		this.sosuri = sosuri;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	public Ingredient getMasline() {
		return masline;
	}

	public void setMasline(Ingredient masline) {
		this.masline = masline;
	}

	public Ingredient getPorumb() {
		return porumb;
	}

	public void setPorumb(Ingredient porumb) {
		this.porumb = porumb;
	}

	public Ingredient getAnanas() {
		return ananas;
	}

	public void setAnanas(Ingredient ananas) {
		this.ananas = ananas;
	}

	public Ingredient getRucola() {
		return rucola;
	}

	public void setRucola(Ingredient rucola) {
		this.rucola = rucola;
	}

	public Ingredient getHalapenos() {
		return halapenos;
	}

	public void setHalapenos(Ingredient halapenos) {
		this.halapenos = halapenos;
	}

	public Ingredient getCiuperci() {
		return ciuperci;
	}

	public void setCiuperci(Ingredient ciuperci) {
		this.ciuperci = ciuperci;
	}

	public Ingredient getArdeiGras() {
		return ardeiGras;
	}

	public void setArdeiGras(Ingredient ardeiGras) {
		this.ardeiGras = ardeiGras;
	}

	public Ingredient getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Ingredient pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Ingredient getArdeIute() {
		return ardeIute;
	}

	public void setArdeIute(Ingredient ardeIute) {
		this.ardeIute = ardeIute;
	}

	public Ingredient getRosii() {
		return rosii;
	}

	public void setRosii(Ingredient rosii) {
		this.rosii = rosii;
	}

	public Ingredient getCeapa() {
		return ceapa;
	}

	public void setCeapa(Ingredient ceapa) {
		this.ceapa = ceapa;
	}

	public Ingredient getUsturoi() {
		return usturoi;
	}

	public void setUsturoi(Ingredient usturoi) {
		this.usturoi = usturoi;
	}

	public Ingredient getBrocoli() {
		return brocoli;
	}

	public void setBrocoli(Ingredient brocoli) {
		this.brocoli = brocoli;
	}

	public Ingredient getCheddar() {
		return cheddar;
	}

	public void setCheddar(Ingredient cheddar) {
		this.cheddar = cheddar;
	}

	public Ingredient getGorngonzola() {
		return gorngonzola;
	}

	public void setGorngonzola(Ingredient gorngonzola) {
		this.gorngonzola = gorngonzola;
	}

	public Ingredient getMozarella() {
		return mozarella;
	}

	public void setMozarella(Ingredient mozarella) {
		this.mozarella = mozarella;
	}

	public Ingredient getFeta() {
		return feta;
	}

	public void setFeta(Ingredient feta) {
		this.feta = feta;
	}

	public Ingredient getCascaval() {
		return cascaval;
	}

	public void setCascaval(Ingredient cascaval) {
		this.cascaval = cascaval;
	}

	public Ingredient getTon() {
		return ton;
	}

	public void setTon(Ingredient ton) {
		this.ton = ton;
	}

	public Ingredient getFructeDeMare() {
		return fructeDeMare;
	}

	public void setFructeDeMare(Ingredient fructeDeMare) {
		this.fructeDeMare = fructeDeMare;
	}

	public Ingredient getSunca() {
		return sunca;
	}

	public void setSunca(Ingredient sunca) {
		this.sunca = sunca;
	}

	public Ingredient getProsciuto() {
		return prosciuto;
	}

	public void setProsciuto(Ingredient prosciuto) {
		this.prosciuto = prosciuto;
	}

	public Ingredient getProsciutoCrudo() {
		return prosciutoCrudo;
	}

	public void setProsciutoCrudo(Ingredient prosciutoCrudo) {
		this.prosciutoCrudo = prosciutoCrudo;
	}

	public Ingredient getSalam() {
		return salam;
	}

	public void setSalam(Ingredient salam) {
		this.salam = salam;
	}

	public Ingredient getSalamPicant() {
		return salamPicant;
	}

	public void setSalamPicant(Ingredient salamPicant) {
		this.salamPicant = salamPicant;
	}

	public Ingredient getCabanos() {
		return cabanos;
	}

	public void setCabanos(Ingredient cabanos) {
		this.cabanos = cabanos;
	}

	public Ingredient getBacon() {
		return bacon;
	}

	public void setBacon(Ingredient bacon) {
		this.bacon = bacon;
	}

	public Ingredient getSuncaPresata() {
		return suncaPresata;
	}

	public void setSuncaPresata(Ingredient suncaPresata) {
		this.suncaPresata = suncaPresata;
	}

	public Ingredient getPieptPui() {
		return pieptPui;
	}

	public void setPieptPui(Ingredient pieptPui) {
		this.pieptPui = pieptPui;
	}

	public Ingredient getSomon() {
		return somon;
	}

	public void setSomon(Ingredient somon) {
		this.somon = somon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<String> getInstructiuniSpeciale() {
		return instructiuniSpeciale;
	}

	public void setInstructiuniSpeciale(List<String> instructiuniSpeciale) {
		this.instructiuniSpeciale = instructiuniSpeciale;
	}

	public List<String> getTipBlat() {
		return tipBlat;
	}

	public void setTipBlat(List<String> tipBlat) {
		this.tipBlat = tipBlat;
	}
		
}
