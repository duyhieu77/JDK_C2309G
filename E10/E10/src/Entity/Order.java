package Entity;

import java.time.LocalDate;

public class Order {
    private String id;
    private int cus_id;
    private LocalDate datetime;

    public Order(String id, int cus_id, LocalDate datetime) {
        this.id = id;
        this.cus_id = cus_id;
        this.datetime = datetime;
    }

    public LocalDate getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDate datetime) {
        this.datetime = datetime;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}