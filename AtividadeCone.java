
public class AtividadeCone {

	private float raio;
	private float altura;
	private int tinta;
	private float geratriz,geratriz1,areatotal,fundocone,lateralcone,quantlitrostinta,valortotal;
	public double precodalata1=238.90;
	public double precodalata2=467.98;
	public double precodalata3=758.34;
	
public AtividadeCone(float raio, float altura, int tinta) {
	
	this.raio = raio;
	this.altura = altura;
	this.tinta = tinta;
	
	
}

public float getRaio() {
	return raio;
}

public void setRaio(float raio) {
	if (raio>0)
	this.raio = raio;
}

public float getAltura() {
	return altura;
}

public void setAltura(float altura) {
	if (altura>0)
	this.altura = altura;
}

public int getTinta() {
	return tinta;
}

public void setTinta(int tinta) {
	if (tinta>0 && tinta<3)
	this.tinta = tinta;
}

public float getGeratriz() {
		return geratriz;
	}

public void setGeratriz(float geratriz) {
		this.geratriz = geratriz;
	}

public float getGeratriz1() {
		return geratriz1;
	}

public void setGeratriz1(float geratriz1) {
		this.geratriz1 = geratriz1;
	}

public float getAreatotal() {
		return areatotal;
	}

public void setAreatotal(float areatotal) {
		this.areatotal = areatotal;
	}

public float getFundocone() {
		return fundocone;
	}

public void setFundocone(float fundocone) {
		this.fundocone = fundocone;
	}

public float getLateralcone() {
		return lateralcone;
	}

public void setLateralcone(float lateralcone) {
		this.lateralcone = lateralcone;
	}

public float getQuantlitrostinta() {
		return quantlitrostinta;
	}

public void setQuantlitrostinta(float quantlitrostinta) {
		this.quantlitrostinta = quantlitrostinta;
	}

public float getValortotal() {
		return valortotal;
	}

public void setValortotal(float valortotal) {
		this.valortotal = valortotal;
	}


public float geratriz() {
return ((raio*raio)+(altura*altura));
}

public float geratriz1() {
return (float) Math.sqrt(geratriz());
}

public float areatotal() {
return (float) (3.14*raio*(raio+geratriz1()));
}

public double fundocone() {
return (double) 3.14*(raio*raio);
}

public double lateralcone() {
return (double) (3.14*raio*geratriz1());
}

public float cobertura() {
return (float) (1/3.45);
}

public float quantlitrostinta() {
return(areatotal()/cobertura());
}

public int latastotal() {
return (int) Math. ceil((quantlitrostinta()/18));
	
}
public double precodalata() {
if (tinta==1) {
	return (precodalata1);
}
else if (tinta==2) {
	return (precodalata2);
	}
else {
	return (precodalata3);
		}

}
public float valortotal() {
return (float)(latastotal()*precodalata());
}

@Override
public String toString() {
	return "O raio do cone informado foi: " + getRaio() + ", a altura: " + getAltura() + ", a classe da tinta():" + getTinta()
			+ "\ngeratriz: " + getGeratriz1() + " \nArea total: " + getAreatotal() + "\nFundo do cone:"
			+ getFundocone() + "\nLateral cone: " + getLateralcone() + "\nQuantidade de tinta em litros: "
			+ getQuantlitrostinta() + "\nValor total()=" + getValortotal() + ".";
}


}