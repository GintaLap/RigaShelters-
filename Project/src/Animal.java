public class Animal {
    private String type;
    private String name;
    private float age;
    private String size;
    private float timeInShelter;
    private String assignedShelter;
    private boolean needsSpecialTreatment;
    private int id;
    private boolean isAdopted;
    private boolean isWalkable;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public float getTimeInShelter() {
        return timeInShelter;
    }

    public String getAssignedShelter() {
        return assignedShelter;
    }

    public boolean isNeedsSpecialTreatment() {
        return needsSpecialTreatment;
    }

    public int getId() {
        return id;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public boolean isWalkable() {
        return isWalkable;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setTimeInShelter(float timeInShelter) {
        this.timeInShelter = timeInShelter;
    }

    public void setAssignedShelter(String assignedShelter) {
        this.assignedShelter = assignedShelter;
    }

    public void setNeedsSpecialTreatment(boolean needsSpecialTreatment) {
        this.needsSpecialTreatment = needsSpecialTreatment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public void setWalkable(boolean walkable) {
        isWalkable = walkable;
    }
}
