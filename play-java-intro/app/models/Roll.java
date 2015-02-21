package models;


import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Roll extends Model{

    @Id
    public String Id;

    public String name;

    public String description;

    public int weight;

    @Lob
    public byte[] image;

}
