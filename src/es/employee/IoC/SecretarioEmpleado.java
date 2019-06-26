package es.employee.IoC;

public class SecretarioEmpleado implements Empleados {

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		return "Informe generado por el secretario " + informeNuevo.getInforme();
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;

	private String email;

	private String nombreEmpresa;

}
