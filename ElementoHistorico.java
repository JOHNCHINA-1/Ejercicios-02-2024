package co.edu.tdea09102024;

public class ElementoHistorico {

    private String refHistorico;

	public String getRefHistorico() {
		return refHistorico;
	}

	public void setRefHistorico(String refHistorico) {
		this.refHistorico = refHistorico;
	}

	@Override
	public String toString() {
		return "Elemento historico: " + "Referencia historica: " + refHistorico + "";
	}
}
