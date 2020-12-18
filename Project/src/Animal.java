import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Animal {
    private String type;
    private String name;
    private float age;
    private String size;
    private int timeInShelter;
    private String assignedShelter;
    private boolean needsSpecialTreatment;
    private int id;
    private boolean isAdopted;
    private boolean isWalkable;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getTimeInShelter() {
        return timeInShelter;
    }

    public void setTimeInShelter(int timeInShelter) {
        this.timeInShelter = timeInShelter;
    }

    public String getAssignedShelter() {
        return assignedShelter;
    }

    public void setAssignedShelter(String assignedShelter) {
        this.assignedShelter = assignedShelter;
    }

    public boolean isNeedsSpecialTreatment() {
        return needsSpecialTreatment;
    }

    public void setNeedsSpecialTreatment(boolean needsSpecialTreatment) {
        this.needsSpecialTreatment = needsSpecialTreatment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public boolean isWalkable() {
        return isWalkable;
    }

    public void setWalkable(boolean walkable) {
        isWalkable = walkable;
    }

    public Animal(String type, String name, float age, String size, int timeInShelter, String assignedShelter, boolean needsSpecialTreatment, int id, boolean isAdopted, boolean isWalkable) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.size = size;
        this.timeInShelter = timeInShelter;
        this.assignedShelter = assignedShelter;
        this.needsSpecialTreatment = needsSpecialTreatment;
        this.id = id;
        this.isAdopted = isAdopted;
        this.isWalkable = isWalkable;
    }
}
