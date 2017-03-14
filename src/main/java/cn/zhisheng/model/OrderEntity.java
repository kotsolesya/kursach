package cn.zhisheng.model;

import javax.persistence.*;

@Entity
@Table(name = "orders", schema = "autobazar", catalog = "")
public class OrderEntity {
    private int id;
    private String name_order;
    private int id_auto;
    private int id_user;
    private String city;
    private UserEntity userByUserId;
    private AutoEntity autoByAutoId;
    private CityEntity cityByCityId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name_order", nullable = false, length = 45)
    public String getName_order() {
        return name_order;
    }

    public void setName_order(String name_order) {
        this.name_order = name_order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id!= that.id) return false;
        if (name_order != null ? !name_order.equals(that.name_order) : that.name_order != null) return false;
        if (id_auto != that.id_auto) return false;
        if (id_user != that.id_user) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name_order != null ? name_order.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }


        @ManyToOne
        @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false)
             public UserEntity getUserByUserId() {return userByUserId;}

             public void setUserByUserId(UserEntity userByUserId) {
             this.userByUserId = userByUserId;}

        @ManyToOne
        @JoinColumn(name = "id_auto", referencedColumnName = "id", nullable = false)
            public AutoEntity getAutoByAutoId() {return autoByAutoId;}

            public void setAutoByAutoId(AutoEntity autoByAutoId) {
            this.autoByAutoId = autoByAutoId;}

        @ManyToOne
        @JoinColumn(name = "city", referencedColumnName = "city", nullable = false)
             public CityEntity getCityByCityId() {return cityByCityId;}

             public void setCityByCityId(CityEntity cityByCityId) {
             this.cityByCityId = cityByCityId;}

}

