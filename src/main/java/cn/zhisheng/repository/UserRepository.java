package cn.zhisheng.repository;

        import cn.zhisheng.model.UserEntity;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Modifying;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;
        import org.springframework.stereotype.Repository;
        import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>
{
    @Modifying
    @Transactional

    @Query("update UserEntity us set us.username=:qUsername, us.mobile_number=:qMobile_number where us.id=:qId")
    public void updateUser(@Param("qUsername") String username, @Param("qMobile_number") String mobile_number,
                           @Param("qId") Integer id);




}
