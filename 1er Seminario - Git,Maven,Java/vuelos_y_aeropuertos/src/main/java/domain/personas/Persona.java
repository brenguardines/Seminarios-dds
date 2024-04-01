package domain.personas;

public abstract class Persona {
  protected String nombre;
  protected String apellido;
  protected Integer nroDeDocumente;
  protected TipoDeDocumento tipoDeDocumento;

  public Persona(String nombre) {
    this.nombre = nombre;
  }
}
