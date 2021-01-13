public static void main(String[] args) {
	
	private String color;
	private String nombrePropietario;
	private int gatitos;
	
	//Constructor
	public Gato(String color, String nombrePropietario, int gatitos) {
		super();
		this.color = color;
		this.nombrePropietario = nombrePropietario;
		//Si el gato intenta ser instanciado con más de 2 gatitos, se acota a 2.
		//El resto de gatitos queda sin adoptar
		this.gatitos = Math.min(gatitos, 2);
	}
	//Getters y Setters
	public String getColor() {
		return color;
	}

	//Getter renombrado para cumplir condiciones del enunciado
	public String propietario() {
		return nombrePropietario;
	}



	public int getGatitos() {
		return gatitos;
	}

	public void addGatito(int gatitos) {
		if (gatitos > 0) {
			this.gatitos = Math.min(gatitos + this.gatitos, 2);
		}
	}
	
	@Override
	public boolean equals(Object otro) {
	    if (this == otro) return true;
	    if (otro == null || getClass() != otro.getClass()) return false;
	    
	    Gato otroGato = (Gato) otro;
	    return this.color.equals(otroGato.color);
	}

	
}