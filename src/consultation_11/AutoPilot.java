package consultation_11;

public class AutoPilot {
    private int id;
    private String model;

    public AutoPilot(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }


    public String toString() {
        return "AutoPilot{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
