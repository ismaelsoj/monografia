package br.com.ismael;

import java.util.GregorianCalendar;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import br.com.ismael.Partida;

@WebService
public interface ConsultaPartida {

  @WebMethod
  Partida consultaPartida(@WebParam(name = "nomeTime1") @XmlElement(required = true) String nomeTime1,
      @WebParam(name = "nomeTime2") @XmlElement(required = true) String nomeTime2,
      @WebParam(name = "data") @XmlElement(required = true) GregorianCalendar data,
      @WebParam(name = "cidade") @XmlElement(required = false) String cidade);
}
