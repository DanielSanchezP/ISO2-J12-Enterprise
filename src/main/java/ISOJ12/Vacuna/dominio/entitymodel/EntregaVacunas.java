package ISOJ12.Vacuna.dominio.entitymodel;

import ISOJ12.Vacuna.persistencia.*;
import java.util.*;

public class EntregaVacunas {
	public LoteVacunas lote;
	public TipoVacuna tipo;
	public GrupoPrioridad grupoPrioridad;
	EntregaDAO entregaDao;
	public Date fecha;
	public int cantidad;

}