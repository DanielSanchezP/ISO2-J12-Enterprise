package ISOJ12.Vacuna.dominio.entitymodel;

import java.util.*;
import ISOJ12.Vacuna.persistencia.*;

public class LoteVacunas {

	Collection<EntregaVacunas> entregas;
	TipoVacuna tipo;
	LoteVacunasDAO loteVacunasDao;
	private String id;
	private Date fecha;
	private int cantidad;
	private String farmaceutica;

}