package domain;

import domain.lugares.Aeropuerto;
import domain.lugares.Ciudad;
import org.junit.Assert;
import org.junit.Test;

public class CiudadTest {

  @Test
  public void ciudadTieneDosAerpuertos(){
    Ciudad unaCiudad = new Ciudad("Ezeiza");
    Aeropuerto unAeropuereto = new Aeropuerto();

    unaCiudad.agregarAeropuertos(unAeropuereto);

    Assert.assertEquals(1, unaCiudad.cantDeAeropuertos().intValue());
  }
}
