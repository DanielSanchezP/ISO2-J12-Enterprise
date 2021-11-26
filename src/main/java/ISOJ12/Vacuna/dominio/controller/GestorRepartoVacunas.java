package ISOJ12.Vacuna.dominio.controller;



import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;
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
            TipoVacuna tipovacuna = new TipoVacuna();
            LoteVacunasDAO lotedao = new LoteVacunasDAO();
            
            int numero = (int)Math.floor(Math.random()*10000000);
            lote.id = Integer.toString(numero);
            tipovacuna.farmaceutica = tipo;
            lote.tipo = tipovacuna;
            lote.cantidad = cantidad;
            lote.fecha = fecha;
                
            lotedao.insertarLoteVacunas(lote);
            throw new UnsupportedOperationException();
	}

	public List<EntregaVacunas> calcularEntregasRegion() {
		// TODO - implement GestorRepartoVacunas.calcularEntregasRegion
		throw new UnsupportedOperationException();
	}

}