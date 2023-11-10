package country;

public class Info{
    private String name;
    private String continent;
    private String capital;
    private long population;

    public Info(String name, String continent, String capital, long population){
        this.name = name;
        this.continent = continent;
        this.capital = capital;
        this.population = population;
    }

    @Override
    public String toString() {
        return "***Info***" +
                "\nName: " + name +
                "\nContinent: " + continent +
                "\nCapital: " + capital +
                "\nPopulation: " + population;
    }
}
