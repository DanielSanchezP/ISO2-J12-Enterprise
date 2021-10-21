package ISOJ12.Vacuna.dominio.entitymodel;

import ISOJ12.Vacuna.persistencia.*;
import java.util.*;

public class Vacunacion {

	public TipoVacuna vacuna;
	public Paciente paciente;
	VacunacionDAO vacunacionDao;
	public Date fecha;
	public boolean isSegundaDosis;

}