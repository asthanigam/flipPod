package models;

public class Order {
    private String id;
    private String customerId;
    private String size;
    public Order(String id, String customerId, String size)
    {
        this.setId(id);
        this.setCustomerId(customerId);
        this.setSize(size);
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}
