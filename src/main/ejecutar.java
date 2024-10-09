package main;

import medicamento.Medicamentos;

public class ejecutar {

    public static void main(String[] args) {

        Medicamentos medicamento = new Medicamentos("Aspirina", "Bayer", "Oral");
        Medicamentos.Posologia posologia = medicamento.new Posologia("Adultos y mayores de " + "16 años", 500, "6 Horas",
                "No debe tomar este medicamento" + " con el estómago vacío");
        medicamento.setPosologia(posologia);
        medicamento.mostrarDatos();
        posologia.mostrarDatos();

    }

}
