/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroseresvivos;

public class Animal extends SVivo {
	
	private Integer numeroPatas;
	private String classe;
	
	public Integer getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(Integer numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}

}
