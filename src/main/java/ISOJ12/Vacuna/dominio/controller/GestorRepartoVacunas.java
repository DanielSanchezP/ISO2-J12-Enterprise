package ISOJ12.Vacuna.dominio.controller;


import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
import ISOJ12.Vacuna.persistencia.EntregaDAO;
import java.security.SecureRandom;
import java.util.Date;
import java.util.List;

public class GestorRepartoVacunas {

	/**
	 * 
	 * @param fecha
	 * @param tipo
	 * @param cantidad
	 */
	public void altaNuevoLoteVacunas(Date fecha, String tipo, int cantidad) {
            LoteVacunas lote = new LoteVacunas();
            LoteVacunasDAO lotedao = new LoteVacunasDAO();
            
            SecureRandom number = new SecureRandom();
            int numero = number.nextInt(1000001);
            lote.id = Integer.toString(numero);
            lote.farmaceutica = tipo;
            lote.cantidad = cantidad;
            lote.fecha = fecha;
                
            lotedao.insertarLoteVacunas(lote);
	}

	public List<EntregaVacunas> calcularEntregasRegion() {
		// TODO - implement GestorRepartoVacunas.calcularEntregasRegion
		throw new UnsupportedOperationException();
	}
        
        public List<EntregaVacunas> vacunasEnRegion(String region){
            EntregaDAO endao=new EntregaDAO();
            return endao.seleccionarVacunas(region);
        }

}