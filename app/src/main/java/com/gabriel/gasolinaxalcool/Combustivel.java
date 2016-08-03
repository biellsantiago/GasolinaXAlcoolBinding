package com.gabriel.gasolinaxalcool;

import java.io.Serializable;
import java.util.Observable;

/**
 * Created by GABRIEL on 02/08/2016.
 */
public class Combustivel extends Observable implements Serializable {

    public static final int RESULT_NENHUM = 0;
    public static final int RESULT_ALCOOL = 1;
    public static final int RESULT_GASOLINA = 2;

    private String gasolina;
    private String etanol;
    private int textoResultado;
    private int resultado;

    public Combustivel(int textoResultado) {
        this.textoResultado = R.string.texto_resultado_nenhum;

    }

    public int getTextoResultado() {
        return textoResultado;
    }

    public void setTextoResultado(int textoResultado) {
        this.textoResultado = textoResultado;

    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getEtanol() {
        return etanol;
    }

    public void setEtanol(String etanol) {
        this.etanol = etanol;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }
}
