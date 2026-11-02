package pucp.lab07.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Ingrese el nombre")
    @Size(max = 100, message = "El nombre no puede superar 100 caracteres")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Ingrese el número de documento")
    @Column(name = "document")
    private String document;

    @NotBlank(message = "Seleccione el tipo de documento")
    @Column(name = "document_type")
    private String documentType;

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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }
}