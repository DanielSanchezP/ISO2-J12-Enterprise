package ISOJ12.Vacuna.dominio.entitymodel;

import ISOJ12.Vacuna.persistencia.*;
import java.util.*;

public class Vacunacion {

	
	public Paciente paciente;
	public String nombrevacuna;
	VacunacionDAO vacunacionDao;
	public Date fecha;
	public int numeroDosis;
        public String nombreregion;
        
        public boolean equal(Vacunacion vac){
            return this.paciente.equal(vac.paciente) && this.nombrevacuna.equals(vac.nombrevacuna)
                     && this.numeroDosis == vac.numeroDosis
                    && this.nombreregion.equals(vac.nombreregion);
        }
}