package es.employee.IoC;

public class JefeEmpleado implements Empleados{
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;

	public String getTareas() {
		return "Gestiono las cuestiones Relativas a mis empleados de Seccion";
	}

	@Override
	public String getInforme() {
		return "Informe presentado por el Jefe con Arreglos y Rectificaciones :" + informeNuevo.getInforme();
	}
}
