package models;


import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCategory extends Model {

    @Id
    public String Id;

    public String name;


}
