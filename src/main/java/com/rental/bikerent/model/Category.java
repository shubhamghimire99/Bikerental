package com.rental.bikerent.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto inc of id
    private int categoryId;
    private  String categoryTitle;
    private String categoryDec;
@OneToMany(mappedBy = "category")
    private List<Product> product= new ArrayList<>();

@OneToMany(mappedBy = "categorys" )
    private List<Sellingp> sellingp = new ArrayList<>();

    public Category() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getCategoryDec() {
        return categoryDec;
    }

    public void setCategoryDec(String categoryDec) {
        this.categoryDec = categoryDec;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryTitle='" + categoryTitle + '\'' +
                ", categoryDec='" + categoryDec + '\'' +
                '}';
    }
}
