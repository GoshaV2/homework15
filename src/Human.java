public class Human {
    private int birth_year;
    private String name;
    private String city;

    private String jobTitle;

    public Human() {
        birth_year = 0;
        name = "Информация не указана";
        city = "Информация не указана";
        jobTitle = "Информация не указана";
    }

    public Human(int age, String name, String city) {
        this.birth_year = checkYear(2022 - age) ? 2022 - age : 0;
        this.name = name;
        this.city = city;
        this.jobTitle = "Информация не указана";
    }

    public Human(int birth_year, String name, String city, String jobTitle) {
        this(birth_year, name, jobTitle);
        this.jobTitle = jobTitle;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = checkYear(birth_year) ? birth_year : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void greet() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в  " + birth_year + " году. Будем знакомы! Я работаю на должности " + jobTitle + " . Будем знакомы!");
    }

    private boolean checkYear(int year) {
        return year >= 0 ? true : false;
    }
}
