package models;

import java.sql.Date;
import java.util.Objects;

public class Manutencao {
	
	//Atributos
	private int id;
	private Date data;
	private String equipamento;
	private double custoHora;
	private double tempoGasto;
	
	//Contrutores
	public Manutencao(int id, Date data, String equipamento, double custoHora, double tempoGasto) {
		super();
		this.id = id;
		this.data = data;
		this.equipamento = equipamento;
		this.custoHora = custoHora;
		this.tempoGasto = tempoGasto;
	}

	//Métodos de Acesso (Getters && Setters)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public double getCustoHora() {
		return custoHora;
	}

	public void setCustoHora(double custoHora) {
		this.custoHora = custoHora;
	}

	public double getTempoGasto() {
		return tempoGasto;
	}

	public void setTempoGasto(double tempoGasto) {
		this.tempoGasto = tempoGasto;
	}
	
	//Método para Cálculo do Valor Total
	public double getTotal() {
		double total = custoHora * tempoGasto;
		return total;
	}
	
	//Hash And eQuals
	@Override
	public int hashCode() {
		return Objects.hash(custoHora, data, equipamento, id, tempoGasto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manutencao other = (Manutencao) obj;
		return Double.doubleToLongBits(custoHora) == Double.doubleToLongBits(other.custoHora)
				&& Objects.equals(data, other.data) && Objects.equals(equipamento, other.equipamento) && id == other.id
				&& Double.doubleToLongBits(tempoGasto) == Double.doubleToLongBits(other.tempoGasto);
	}

	//Saídas
	@Override
	public String toString() {
		return id + "\t" + data + "\t" + equipamento + "\t" + custoHora
				+ "\t" + tempoGasto;
	}
	
	public String toCSV( ) {
		return id + "\t" + data + "\t" + equipamento + "\t" + custoHora
				+ "\t" + tempoGasto;
	}
}
