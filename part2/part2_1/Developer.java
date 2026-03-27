package part2.part2_1;

public class Developer extends Employee {
    private String language;

    public Developer(String name, double baseSalary, String language) {
        super(name, baseSalary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.12;
    }
}