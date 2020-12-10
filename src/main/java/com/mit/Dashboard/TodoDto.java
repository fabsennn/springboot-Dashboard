package com.mit.Dashboard;

import java.time.LocalDate;

public class TodoDto implements Comparable<TodoDto>{

    private LocalDate naechsteFaelligkeit;

    private int kundennummer;

    private String kundenname;

    public TodoDto(LocalDate naechsteFaelligkeit, String kundenname, int kundennummer) {
        this.naechsteFaelligkeit = naechsteFaelligkeit;
        this.kundennummer = kundennummer;
        this.kundenname = kundenname;
    }

    public LocalDate getNaechsteFaelligkeit() {
        return naechsteFaelligkeit;
    }

    public void setNaechsteFaelligkeit(LocalDate naechsteFaelligkeit) {
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

    @Override
    public int compareTo(TodoDto o) {
        return getNaechsteFaelligkeit().compareTo(o.getNaechsteFaelligkeit());
    }
}
