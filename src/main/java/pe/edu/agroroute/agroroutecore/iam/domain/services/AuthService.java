package pe.edu.agroroute.agroroutecore.iam.domain.services;

import edu.pe.softroute.iamservice.domain.models.entities.User;
import pe.edu.agroroute.agroroutecore.iam.infrastructure.jwt.models.JwtInfoDto;
import pe.edu.agroroute.agroroutecore.iam.interfaces.dto.SignInRequest;
import pe.edu.agroroute.agroroutecore.iam.interfaces.dto.SignUpRequest;
import org.apache.commons.lang3.tuple.ImmutablePair;

public interface AuthService {

  User signUp(SignUpRequest request);

  ImmutablePair<User, String> signIn(SignInRequest request);

  JwtInfoDto validateToken(String token);
}
