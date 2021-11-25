package ISOJ12.Vacuna.dominio.controller;

import java.util.*;
import ISOJ12.Vacuna.dominio.entitymodel.*;
import ISOJ12.Vacuna.persistencia.LoteVacunasDAO;

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
            
            Random r = new Random();
            int numero = r.nextInt(1000000);
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