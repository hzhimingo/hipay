package com.zhimingo.hipay.rbac.repository;

import com.zhimingo.hipay.rbac.entity.Org;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgRepository extends CrudRepository<Org, Long> {
}
