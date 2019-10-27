package pl.mirek.ksb2.week5hw.dto;

public class NewPlaceDto {

    private String newPlace;

    public NewPlaceDto(String newPlace) {
        this.newPlace = newPlace;
    }

    public String getNewPlace() {
        return newPlace;
    }

    public void setNewPlace(String newPlace) {
        this.newPlace = newPlace;
    }
}
