package co.edu.uco.libreriauco.dto;
import java.util.UUID;
import co.edu.uco.libreriauco.transversal.utilitarios.UtilObjeto;
import co.edu.uco.libreriauco.transversal.utilitarios.UtilTexto;

public class DepartamentoDTO {
	
	private PaisDTO pais;
	private UUID id;
	private String nombre;
	
	
	public DepartamentoDTO() {
		super();
	}
	
	public PaisDTO getPaisDTO() {
		return pais;
	}
	
	public void setPaisDTO(PaisDTO pais) {
		this.pais = UtilObjeto.obtenerValorDefectoSiValorOriginalEsNulo(pais, new PaisDTO());
	}
	
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = UtilTexto.getUtilTexto().quitarEspacioEnBlanco(nombre);
	}
	

}
