package template.halexplorertemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import template.halexplorertemplate.model.Member;

@RepositoryRestResource
public interface DataRepository extends JpaRepository<Member, Long> {

}
