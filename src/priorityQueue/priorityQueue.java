package priorityQueue;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * The reason for our choice in terms of using "ArrayList" is because of the simplicity of use.
 * The list requires less "Set-up" to actually use compared to using HashMap for example.
 * We tried using "PriorityQueue" that is a built in utillity in java, but found the arraylist to be better.
 */
public class priorityQueue {
    private List<Element> priorityQueue = new ArrayList<>();

    public Boolean addElement(Element e) {
        return priorityQueue.add(e);
    }

    public Element getHighestPriority() {
        Element priorityMax = null;
        for (Element element : priorityQueue) {
            if (priorityMax == null) {
                priorityMax = element;
            }
            if (element.getPriority() > priorityMax.getPriority()) {
                priorityMax = element;
            }
        }
        return priorityMax;
    }

    public Boolean print_all_elements_in_order() {
        priorityQueue.sort(Comparator.comparingInt(Element::getPriority).reversed());
        System.out.println("\nPrinting sorted list...\n");
        System.out.println("============Prioritized============");
        priorityQueue.forEach(element -> System.out.println("Name: " + element.getName() + "  with priority: " + element.getPriority()));
        System.out.println("===================================");
        return true;
    }

    public static void main(String[] args) {

        priorityQueue priorityQueue = new priorityQueue();
        priorityQueue.addElement(new Element("Terje", 5));
        priorityQueue.addElement(new Element("Kari", 7));
        priorityQueue.addElement(new Element("Nils", 4));
        priorityQueue.addElement(new Element("Otto", 8));
        priorityQueue.addElement(new Element("Syvert", 7));
        priorityQueue.addElement(new Element("Lise", 11));
        priorityQueue.addElement(new Element("Notto", 0));
        priorityQueue.addElement(new Element("Odd", 1));
        priorityQueue.addElement(new Element("Even", 2));

        //printer alle elementene i rekkefølge
        priorityQueue.print_all_elements_in_order();

        //printer element med høyest prioritet
        System.out.println("\nThe name '" + priorityQueue.getHighestPriority().getName() + "' is the element with highest priority, with a priority of: "
                + priorityQueue.getHighestPriority().getPriority());

    }
}