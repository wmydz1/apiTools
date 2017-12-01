package com.logoocc.repository;

import com.logoocc.model.TpGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by samchen on 11/29/17.
 */
@Repository
public interface GoodRepository extends JpaRepository<TpGoods, Integer> {

    @Query("update UserEntity us set us.nickname=:qNickname, us.firstName=:qFirstName, us.lastName=:qLastName, us.password=:qPassword where us.id=:qId")
    public void findByUser(@Param("qNickname") String nickname, @Param("qFirstName") String firstName,
                           @Param("qLastName") String lastName, @Param("qPassword") String password, @Param("qId") Integer id);

    public TpGoods findTpGoodsByGoodsName(String name);


}
