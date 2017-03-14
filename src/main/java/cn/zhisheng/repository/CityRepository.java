package cn.zhisheng.repository;

import cn.zhisheng.model.CityEntity;
import cn.zhisheng.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Integer>
{
    @Modifying
    @Transactional

    @Query("update CityEntity us set us.city=:qCity, us.region=:qRegoin where us.id=:qId")
    public void updateCity(@Param("qCity") String city, @Param("qRegoin") String region,
                           @Param("qId") Integer id);




}
