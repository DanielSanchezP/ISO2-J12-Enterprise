package ISOJ12.Vacuna.dominio.entitymodel;

import ISOJ12.Vacuna.persistencia.*;
import java.util.*;

public class EntregaVacunas {

	TipoVacuna tipo;
	public RegionEnum region;
	GrupoPrioridad grupoPrioridad;
	LoteVacunas lote;
	EntregaDAO entregaDao;
	private Date fecha;
	private int cantidad;

}