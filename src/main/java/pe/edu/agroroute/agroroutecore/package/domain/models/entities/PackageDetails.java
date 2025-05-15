package pe.edu.agroroute.agroroutecore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PackageDetails {

  private Double weight;

  private Double height;

  private Double width;

  private Double length;
}
