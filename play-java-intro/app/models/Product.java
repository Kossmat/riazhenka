package models;

import play.db.ebean.Model;

import javax.persistence.*;

@Entity
public class Product extends Model{

    @Id
    public String Id;

    public String name;

    public String description;

    public int weight;

    public Double price;

    public String imageSrc;

    @ManyToOne
    public ProductCategory category;

}
