public class Human {

    int curentYear = 2022;

    public String name;
    public String town;
    public int dateOfBirth;
    public String job;

    Human (String name, String town, int dateOfBirth, String job) {
        if (name == null || name.isEmpty()) {
            this.name = "!информация об имени не указана!";}
        else {this.name = name;}
        if (town == null || town.isEmpty()) {
            this.town = "!информация об имени не указана!";}
        else {this.town = town;}
        if (dateOfBirth >= 0) {
            this.dateOfBirth = dateOfBirth;}
        else {this.dateOfBirth = Math.abs(dateOfBirth);}
        if (job == null || job.isEmpty()) {
            this.job = "!информация об имени не указана!";}
        else {this.job = job;}
    }

    void hallo() {
        System.out.println("Привет! Меня зовут "+ name +" Я из города "+ town +" Я родился в "+( curentYear - dateOfBirth )+" году. Я работаю на должности "+ job+". Будем знакомы!");
    }
}
