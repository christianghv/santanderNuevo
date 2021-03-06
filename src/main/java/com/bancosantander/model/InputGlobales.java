package com.bancosantander.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Veariables Globales")
@org.kie.api.definition.type.Description("Contiene las variables Globales del Sistema")
public class InputGlobales implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Límite inferior")
	@org.kie.api.definition.type.Description("Corresponde al límite inforior de la TC")
	private java.lang.Integer limiteInferior;
	@org.kie.api.definition.type.Label("Límite Objetivo")
	@org.kie.api.definition.type.Description("Corresponde al límite objetivo donde podría llegar el reto")
	private java.lang.Integer limiteObjetivo;
	@org.kie.api.definition.type.Label("Mínimo Compras")
	@org.kie.api.definition.type.Description("Corresponde al monto mínimo de compras que debe realizar un cliente")
	private java.lang.Integer minimoCompra;

	/**
	 * Constructor por defecto
	 */
	public InputGlobales() {
	}
	/**
	 * @return
	 */
	public java.lang.Integer getLimiteInferior() {
		return this.limiteInferior;
	}
	/**
	 * @param integer
	 */
	public void setLimiteInferior(java.lang.Integer limiteInferior) {
		this.limiteInferior = limiteInferior;
	}
	/**
	 * @return
	 */
	public java.lang.Integer getLimiteObjetivo() {
		return this.limiteObjetivo;
	}
	/**
	 * @param integer
	 */
	public void setLimiteObjetivo(java.lang.Integer limiteObjetivo) {
		this.limiteObjetivo = limiteObjetivo;
	}
	/**
	 * @return
	 */
	public java.lang.Integer getMinimoCompra() {
		return this.minimoCompra;
	}
	/**
	 * @param integer
	 */
	public void setMinimoCompra(java.lang.Integer minimoCompra) {
		this.minimoCompra = minimoCompra;
	}

	public InputGlobales(java.lang.Integer limiteInferior,
			java.lang.Integer limiteObjetivo, java.lang.Integer minimoCompra) {
		this.limiteInferior = limiteInferior;
		this.limiteObjetivo = limiteObjetivo;
		this.minimoCompra = minimoCompra;
	}

}