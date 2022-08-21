package com.zhimingo.hipay.rbac.repository;

import com.zhimingo.hipay.rbac.entity.Area;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaRepository extends CrudRepository<Area, Long> {

    boolean existsAreaByCode(String code);

    List<Area> findAreasByParent(Long parent);
}
