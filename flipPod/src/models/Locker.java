package models;

public class Locker {
    private String podId;
    private String size;
    private String id;
    public Locker(String id,String podId, String size)
    {
        this.setId(id);
        this.setPodId(podId);
        this.setSize(size);
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getPodId() {
        return podId;
    }
    public void setPodId(String podId) {
        this.podId = podId;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    

}
