package ISOJ12.Vacuna.dominio.entitymodel;

import ISOJ12.Vacuna.persistencia.*;
import java.util.*;

public class Vacunacion {

	TipoVacuna vacuna;
	Paciente paciente;
	VacunacionDAO vacunacionDao;
	private Date fecha;
	private boolean isSegundaDosis;

}