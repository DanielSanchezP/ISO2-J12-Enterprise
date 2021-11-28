package ISOJ12.Vacuna.dominio.entitymodel;

import ISOJ12.Vacuna.persistencia.*;
import java.util.*;

public class EntregaVacunas {
	public LoteVacunas lote;
	public String grupoPrioridad;
	EntregaDAO entregaDao;
	public Date fecha;
	public int cantidad;
        public String nombreregion;
}