package pe.edu.agroroute.agroroutecore;

import lombok.Data;

@Data
public class IotGpsDto {
  private String shipmentCode;
  private Double latitude;
  private Double longitude;
}
