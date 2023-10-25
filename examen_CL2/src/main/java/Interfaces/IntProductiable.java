package Interfaces;

import java.util.List;

import modelos.TblProducto;

public interface IntProductiable {
	public void registrarProducto(TblProducto tblpro);
	List<TblProducto> milista();
}
