package ej4.clases;

import ej4.clases.Cereales.Cereal;
import ej4.clases.Cereales.CosechaFina;
import ej4.clases.Cereales.CosechaGruesa;
import ej4.clases.Cereales.Pastura;
import ej4.clases.enums.TipoMineral;

public class Main4 {
    public static void main(String[] args) {
        // Minerales
        Mineral nitrogeno = new Mineral("Nitrógeno", TipoMineral.PRIMARIO);
        Mineral fosforo = new Mineral("Fósforo", TipoMineral.PRIMARIO);
        Mineral arcilla = new Mineral("Arcilla", TipoMineral.SECUNDARIO);

        // Cereales
        Cereal trigo = new CosechaFina("Trigo");
        trigo.agregarRequisito(nitrogeno);
        trigo.agregarRequisito(fosforo);

        Cereal maiz = new CosechaGruesa("Maíz");
        maiz.agregarRequisito(nitrogeno);

        Cereal alfalfa = new Pastura("Alfalfa");
        alfalfa.agregarRequisito(nitrogeno);

        // Lote inicial (común)
        Lote lote1 = new Lote("L001");
        lote1.agregarMineral(arcilla);
        System.out.println("¿Lote1 es especial? " + lote1.esEspecial()); // false

        // Se agrega un mineral primario → se vuelve especial
        lote1.agregarMineral(nitrogeno);
        System.out.println("¿Lote1 es especial? " + lote1.esEspecial()); // true

        // Verificaciones de satisface()
        System.out.println("¿Lote1 satisface trigo? " + lote1.satisface(trigo)); // true
        System.out.println("¿Lote1 satisface maíz? " + lote1.satisface(maiz));   // true

        // Siembra de pastura
        lote1.getHistoricoSiembra().add(alfalfa);
        System.out.println("¿Lote1 satisface otra pastura? " + lote1.satisface(new Pastura("Trebol"))); // false

    }
}

