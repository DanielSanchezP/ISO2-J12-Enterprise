package ISOJ12.Vacuna.dominio.entitymodel;

public class Paciente {
	
	public String dni;
	public String nombre;
	public String apellidos;
	public String grupo;
        
        public boolean equals(Paciente paciente){
            
            return this.dni.equals(paciente.dni) && this.nombre.equals(paciente.nombre)&&
                    this.apellidos.equals(paciente.apellidos)
                    && this.grupo.equals(paciente.grupo);
        }

}