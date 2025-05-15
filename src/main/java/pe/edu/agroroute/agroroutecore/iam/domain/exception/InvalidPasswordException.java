package pe.edu.agroroute.agroroutecore.iam.domain.exception;

public class InvalidPasswordException extends RuntimeException {
  public InvalidPasswordException(String message) {
    super(message);
  }
}
