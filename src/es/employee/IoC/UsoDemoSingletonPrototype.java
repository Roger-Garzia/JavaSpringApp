package es.employee.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

    public static void main(String[] args) {

        // Carga de XML de configuracion.
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

        //Peticion de Beans al Contenedor Spring.
        SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        SecretarioEmpleado Peter = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
        System.out.println(Maria);
        System.out.println(Peter);

        if (Maria == Peter) System.out.println("Apuntan al mismo objeto");
        else System.out.println("No se trata del mismo objeto");

    }
}
