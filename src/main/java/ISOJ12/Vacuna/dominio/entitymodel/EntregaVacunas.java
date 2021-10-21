package ISOJ12.Vacuna.dominio.entitymodel;

import ISOJ12.Vacuna.persistencia.*;
import java.util.*;

public class EntregaVacunas {

	public TipoVacuna tipo;
	public RegionEnum region;
	public GrupoPrioridad grupoPrioridad;
	public LoteVacunas lote;
	EntregaDAO entregaDao;
	public Date fecha;
	public int cantidad;

}