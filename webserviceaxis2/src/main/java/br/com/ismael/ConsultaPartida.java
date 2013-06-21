package br.com.ismael;

import java.util.GregorianCalendar;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import br.com.ismael.EfetuaConsultaPartida;
import br.com.ismael.Partida;

@WebService(serviceName = "ConsultaPartida")
public class ConsultaPartida {

  @WebMethod(operationName = "consultaPartida")
  public Partida consultaPartida(@WebParam(name = "nomeTime1") String nomeTime1,
      @WebParam(name = "nomeTime2") String nomeTime2, @WebParam(name = "data") GregorianCalendar data,
      @WebParam(name = "cidade") String cidade) {
    return new EfetuaConsultaPartida().consultaPartida(nomeTime1, nomeTime2, data, cidade);
  }
}
