package es.employee.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		DirectorEmpleado Pedro = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(Pedro.getTareas());
		System.out.println(Pedro.getInforme());
		System.out.println(Pedro.getEmail());
		System.out.println(Pedro.getNombreEmpresa());



/*		SecretarioEmpleado Juan = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println("Email: " + Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		System.out.println("Email Pablo :" + Pablo.getEmail());*/

/*		Empleados Maria = contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		System.out.println("Email: " + Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		*/
		contexto.close();

	}

}
