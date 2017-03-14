package cn.zhisheng.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "autos", schema = "autobazar", catalog = "")
public class AutoEntity
{
    private int id;
    private String marka;
    private String model;
    private String color;
    private Date year;
    private Double price;
    private String name_type;
    private String city;
    private String username;
    private Collection<OrderEntity> ordersById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "marka", nullable = false, length = 45)
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Basic
    @Column(name = "model", nullable = false, length = 45)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "color", nullable = false, length = 45)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "year", nullable = false)
    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Basic
    @Column(name = "price", nullable = false)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "name_type", nullable = false, length = 45)
    public String getName_type() {
        return name_type;
    }

    public void setName_type(String name_type) {
        this.name_type = name_type;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 45)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 45)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoEntity that = (AutoEntity) o;

        if (id != that.id) return false;
        if (marka != null ? !marka.equals(that.marka) : that.marka != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (name_type != null ? !name_type.equals(that.name_type) : that.name_type != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (marka != null ? marka.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (name_type != null ? name_type.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }


    @OneToMany(mappedBy = "autoByAutoId")
    public Collection<OrderEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrderEntity> ordersById) {
        this.ordersById = ordersById;
    }

}
