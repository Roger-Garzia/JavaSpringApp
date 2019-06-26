package es.employee.IoC;

public class DirectorEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	//Creacion del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo ) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestionar la plantilla general de toda la empresa";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
