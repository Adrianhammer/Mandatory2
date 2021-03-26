package priorityQueue;

public class Element {
    private String name;
    private int prio;

    public Element(String name, int prio) {
        this.name = name;
        this.prio = prio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }
}
