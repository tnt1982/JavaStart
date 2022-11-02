package ćwiczenia.Dziedziczenie.Ćwiczenie2;

final class Online extends Course {

    private int amountOfVideo;
    private int estimatedTimeToCompleteTheCourse;

    public Online(String id, double price, String name, String shortDescription, int amountOfVideo, int estimatedTimeToCompleteTheCourse) {
        setId(id);
        setPrice(price);
        setName(name);
        setShortDescription(shortDescription);
        this.amountOfVideo = amountOfVideo;
        this.estimatedTimeToCompleteTheCourse = estimatedTimeToCompleteTheCourse;
    }

    public int getAmountOfVideo() {
        return amountOfVideo;
    }

    public void setAmountOfVideo(int amountOfVideo) {
        this.amountOfVideo = amountOfVideo;
    }

    public int getEstimatedTimeToCompleteTheCourse() {
        return estimatedTimeToCompleteTheCourse;
    }

    public void setEstimatedTimeToCompleteTheCourse(int estimatedTimeToCompleteTheCourse) {
        this.estimatedTimeToCompleteTheCourse = estimatedTimeToCompleteTheCourse;
    }

    public void printData() {
        System.out.println("Informacje na temat szkolenia online: ");
        System.out.println("Id: " + getId() + ", cena: " + getPrice() + " zł" + ", nazwa: " + getName() +
                ", krótki opis: " + getShortDescription() + ", liczba godzin video: " + getAmountOfVideo() + " godzin" +
                ", oczekiwany czas skończenia kursu: " + getEstimatedTimeToCompleteTheCourse() + " godzin");
    }
}
