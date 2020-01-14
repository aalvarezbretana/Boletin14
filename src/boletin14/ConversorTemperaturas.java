/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author aalvarezbretana
 */
public class ConversorTemperaturas {

    private final float TEMPERATURA_MINIMA;

    public ConversorTemperaturas() {
        TEMPERATURA_MINIMA = 80;
    }

    public ConversorTemperaturas(float graos) {
        this.TEMPERATURA_MINIMA = graos;
    }

    public float getTEMPERATURA_MINIMA() {
        return TEMPERATURA_MINIMA;
    }

    public float centigradosAFarenheit(float graos) throws TemperaturaErradaException {
        if (graos < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaException("Os graos centigrados non poden ser menor que 80");
        }
        float fahren = 9f / 5f * graos + 32.4f;
        return fahren;
    }

    public void centigradosAReamur(float graos) throws TemperaturaErradaException {
        if (graos < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaException("Os graos centigrados non poden ser menor que 80");
        }
        float reamur = 4f / 5f * graos;
        System.out.println(reamur);
    }
}
