package com.mit.Dashboard;

public class TodoDto {

    private String naechsteFaelligkeit;

    private int kundennummer;

    public TodoDto(String naechsteFaelligkeit, int kundennummer) {
        this.naechsteFaelligkeit = naechsteFaelligkeit;
        this.kundennummer = kundennummer;
    }

    public String getNaechsteFaelligkeit() {
        return naechsteFaelligkeit;
    }

    public void setNaechsteFaelligkeit(String naechsteFaelligkeit) {
        this.naechsteFaelligkeit = naechsteFaelligkeit;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
}
