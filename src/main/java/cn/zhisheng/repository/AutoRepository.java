package cn.zhisheng.repository;

import cn.zhisheng.model.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public interface AutoRepository extends JpaRepository<AutoEntity, Integer>{

    @Modifying
    @Transactional

    @Query("update AutoEntity  us set us.marka=:qMarka, us.model=:qModel, us.color=:qColor, " +
            "us.year=:qYear, us.price=:qPrice, us.name_type=:qName_type, " +
            "us.city=:qCity, us.username=:qUsername where us.id=:qId")
    public void updateAuto(@Param("qMarka") String marka,
                           @Param("qModel") String model,
                           @Param("qColor") String color,
                           @Param("qYear") Date year,
                           @Param("qPrice") Double price,
                           @Param("qName_type") String name_type,
                           @Param("qCity") String city,
                           @Param("qUsername") String username,
                           @Param("qId") Integer id);

}
