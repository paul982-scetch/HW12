public class person {


    private String name;
    private String profession;
    private String placeWork;
    private int age;
    private double zarPlata;

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setZarPlata(double zarPlata) {
        this.zarPlata = zarPlata;
    }

    public double getZarPlata() {
        return zarPlata;
    }

    public person(String name, String profession, String placeWork, int age, double zarPlata) {
        this.name = name;
        this.profession = profession;
        this.placeWork = placeWork;
        this.age = age;
        this.zarPlata = zarPlata;
    }

    public person() {
    }
}
