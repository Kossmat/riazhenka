package models;


import play.db.ebean.Model;

import javax.persistence.*;

@Entity
public class Roll extends Model{

    @Id
    public String Id;

    public String name;

    public String description;

    public int weight;

    public Double price;

    @Lob @Basic(fetch= FetchType.LAZY)
    @Column(name="image")
    public byte[] image;

}
