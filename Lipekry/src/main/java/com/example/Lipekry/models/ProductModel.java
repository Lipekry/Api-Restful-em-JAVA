package com.example.Lipekry.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="produtos")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID prod_id;
    private String prod_name;
    private BigDecimal prod_value;
    private boolean prod_active;

    public boolean isProd_active() {
        return prod_active;
    }

    public void setProd_active(boolean prod_active) {
        this.prod_active=prod_active;
    }

    public ProductModel(){
        this.setProd_active(true);
    }

    public UUID getProd_id() {
        return prod_id;
    }

    public void setProd_id(UUID prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public BigDecimal getProd_value() {
        return prod_value;
    }

    public void setProd_value(BigDecimal prod_value) {
        this.prod_value = prod_value;
    }
}
