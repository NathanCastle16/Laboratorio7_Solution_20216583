package pucp.lab07.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Ingrese el nombre")
    @Size(max = 100, message = "El nombre no puede superar 100 caracteres")
    @Column(name = "name")
    private String name;

    @Digits(integer = 10, fraction = 2,
            message = "Ingrese un precio válido")
    @Positive(message = "El precio debe ser mayor que cero")
    @Column(name = "price")
    private BigDecimal price;

    @Min(value = 0,
            message = "El stock debe ser mayor o igual que cero")
    @Column(name = "stock")
    private Integer stock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}