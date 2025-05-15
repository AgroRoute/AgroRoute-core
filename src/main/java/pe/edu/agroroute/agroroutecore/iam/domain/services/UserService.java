package pe.edu.agroroute.agroroutecore.iam.domain.services;

import edu.pe.softroute.iamservice.domain.models.entities.User;
import java.util.List;
import java.util.UUID;

public interface UserService {

  User findByEmail(String email);

  User getById(UUID id);

  List<User> getAllUsersByCompanyId(UUID companyId);

  List<User> findAllByIds(List<UUID> ids);

  User assignCompany(UUID id, UUID companyId);
}
