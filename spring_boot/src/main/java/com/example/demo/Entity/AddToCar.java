package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.*;

// import lombok.Data;

@Entity
// The life cycle of Entity has four states:
// New: The Entity instance has no persistent id (primary key) and has not been managed by the persistence context.
// Managed: The Entity instance has a persistent id, which has been managed by the persistence context.
// Detached: The Entity instance has a persistent id, which is separated from the management of the persistence context.
// Removed: The Entity instance has a persistent Id and is still managed by the persistence context, but the mapping data in the database has been deleted.
@Table(name = "addtocar")
// @Data
// @Data means already have @Getter/@Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor
public class AddToCar {
    
    @Id
    Integer id;
    @Column
    String quantity;
    @Column
    String state;
    @Column
    Date insert_time;
    @Column
    Date update_time;

    @ManyToOne
    @JoinColumn(name="uid", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name="pid", nullable=false)
    private Product product;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getInsert_time() {
        return this.insert_time;
    }

    public void setInsert_time(Date insert_time) {
        this.insert_time = insert_time;
    }

    public Date getUpdate_time() {
        return this.update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
