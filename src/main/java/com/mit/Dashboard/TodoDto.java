package com.mit.Dashboard;

public class TodoDto {

    private String naechsteFaelligkeit;

    private int kundennummer;

    private String kundenname;

    public TodoDto(String naechsteFaelligkeit, String kundenname, int kundennummer) {
        this.naechsteFaelligkeit = naechsteFaelligkeit;
        this.kundennummer = kundennummer;
        this.kundenname = kundenname;
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

    public String getKundenname() {return kundenname; }

    public void setKundenname(String kundenname) { this.kundenname = kundenname; }
}
