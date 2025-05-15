package pe.edu.agroroute.agroroutecore;

import lombok.Data;

@Data
public class IotDataDto {

  private String shipmentCode;

  private String packageCode;

  private Double humidity;

  private Double temperature;
}
