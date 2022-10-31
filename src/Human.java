import java.time.LocalDate;

public class Human {

    private int curentYear = LocalDate.now().getYear();

    private String name;
    private String town;
    private int dateOfBirth;
    private String job;

    public Human (String name, String town, int dateOfBirth, String job) {

        setName(name);
        setTown(town);
        setJob(job);
        setDateOfBirth(dateOfBirth);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validOrDefult(name, "!Информация не указана!");

    }
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = validOrDefult(town, "!Информация не указана!");
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = Math.max(dateOfBirth, 0);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = validOrDefult(job, "!Информация не указана!");
    }

    private String validOrDefult (String value, String defultValue) {
        return value == null || value.isBlank() ? defultValue : value;
    }

    public String toString() {
        return "Привет! Меня зовут "+ name +" Я из города "+ town +" Я родился в "+( curentYear - dateOfBirth )+" году. Я работаю на должности "+ job+". Будем знакомы!";
    }
}
