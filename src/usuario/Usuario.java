package usuario;

public class Usuario {
	private String nombre;
	private int dineroDisponible;
	private double tiempoDisponible;
	private Tipo preferencia;
	private Itinerario miItinerario;

	public Usuario(String nombre, int dineroDisponible, double tiempoDisponible, Tipo preferencia) {
		this.nombre = nombre;
		this.dineroDisponible = dineroDisponible;
		this.tiempoDisponible = tiempoDisponible;
		this.preferencia = preferencia;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDineroDisponible() {
		return dineroDisponible;
	}

	public double getTiempoDisponible() {
		return tiempoDisponible;
	}

	public Tipo getPreferencia() {
		return preferencia;
	}
	
	public void comprar(Sugerencia unaSugerencia) {
		this.dineroDisponible-= unaSugerencia.getPrecio();
		this.tiempoDisponible-= unaSugerencia.getDuracion();
	}
	
	public Itinerario getMiItinerario() {
		return miItinerario;
	}
	
}
