package cwiczenia.PolimorfizmIRzutowanieTypów.Ćwieczenie1;

class Nurse extends Person{

    public int overtime;

    public Nurse(String firstName, String lastName, double salary, int overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public String getInfo() {
        return super.getInfo() + ", nadgodziny: " + overtime;
    }
}
