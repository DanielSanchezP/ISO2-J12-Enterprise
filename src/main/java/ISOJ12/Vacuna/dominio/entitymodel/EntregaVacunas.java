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
        
        
        public boolean equals(EntregaVacunas entrega){
            return this.lote.equals(entrega.lote) && this.grupoPrioridad.equals(entrega.grupoPrioridad) 
                    && this.fecha.equals(entrega.fecha) &&
                    this.cantidad == entrega.cantidad &&
                    this.nombreregion.equals(entrega.nombreregion);
        }
}