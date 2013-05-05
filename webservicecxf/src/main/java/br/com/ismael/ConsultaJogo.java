package br.com.ismael;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import br.com.ismael.jogo.Jogo;

@WebService
public interface ConsultaJogo {

  @WebMethod
  Jogo consultaJogo(@WebParam(name = "nomeTime1") @XmlElement(required = true) String nomeTime1,
      @WebParam(name = "nomeTime2") @XmlElement(required = true) String nomeTime2,
      @WebParam(name = "cidade") @XmlElement(required = false) String cidade);
}
