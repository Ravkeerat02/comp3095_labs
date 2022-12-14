package model;

import java.time.LocalDate;

public class Pet {

    private PetType petType ;
    private  Owner owner ;
    private LocalDate birtdate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirtdate() {
        return birtdate;
    }

    public void setBirtdate(LocalDate birtdate) {
        this.birtdate = birtdate;
    }


}
