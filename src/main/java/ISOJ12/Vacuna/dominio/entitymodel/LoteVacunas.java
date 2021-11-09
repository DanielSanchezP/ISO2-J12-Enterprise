package ISOJ12.Vacuna.dominio.entitymodel;

import java.util.*;
import ISOJ12.Vacuna.persistencia.*;

public class LoteVacunas {
	public String id;
	Collection<EntregaVacunas> entregas;
	public TipoVacuna tipo;
	LoteVacunasDAO loteVacunasDao;
	public Date fecha;
	public int cantidad;
	public String farmaceutica;
	public String region;

}