package pe.edu.agroroute.agroroutecore.iam.infrastructure.jwt.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtInfoDto {
  private String userId;
  private String companyId;
}
