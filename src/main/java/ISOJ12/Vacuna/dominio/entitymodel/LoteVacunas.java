package ISOJ12.Vacuna.dominio.entitymodel;

import java.util.*;
import ISOJ12.Vacuna.persistencia.*;

public class LoteVacunas {
	public String id;
	LoteVacunasDAO loteVacunasDao;
	public Date fecha;
	public int cantidad;
	public String farmaceutica;
	public String region;
        
        public boolean equal(LoteVacunas lote){
            return this.id.equals(lote.id) && this.fecha.equals(lote.fecha)&&
                    this.cantidad == lote.cantidad && this.farmaceutica.equals(lote.farmaceutica)
                    && this.region.equals(lote.region);
        }

}