public class Paintstore {
    private String name;
    private double cost;
    private int coverageM;
    private int volumeL;

    public Paintstore(String name, double cost, int coverageM, int volumeL) {
        this.name = name;
        this.cost = cost;
        this.coverageM = coverageM;
        this.volumeL = volumeL;
    }

    @Override
    public String toString() {
        return "Paintstore{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", coverageM=" + coverageM +
                ", volumeL=" + volumeL +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCoverageM() {
        return coverageM;
    }

    public void setCoverageM(int coverageM) {
        this.coverageM = coverageM;
    }

    public int getVolumeL() {
        return volumeL;
    }

    public void setVolumeL(int volumeL) {
        this.volumeL = volumeL;
    }
}
