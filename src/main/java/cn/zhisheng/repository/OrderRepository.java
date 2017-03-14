package cn.zhisheng.repository;

import cn.zhisheng.model.CityEntity;
import cn.zhisheng.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer>
{
    @Modifying
    @Transactional

    @Query("update OrderEntity us set us.name_order=:qName_order, us.cityByCityId=:qCity where us.id=:qId")
    public void updateOrder(@Param("qName_order") String name_order, @Param("qCity") CityEntity city,
                           @Param("qId") Integer id);

}
