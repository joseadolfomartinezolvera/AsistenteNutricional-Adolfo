package com.eivier.asistentenutricional.datos_root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta

import com.eivier.asistentenutricional.R
import com.eivier.asistentenutricional.modelos.ModeloReceta
import kotlinx.android.synthetic.main.content_recetas_opciones.view.*

/**
 * Metodo colocar Datos para Desayuno al modelo _root_ide_package_.com.eivier.asistentenutricional.modelos.ModeloReceta
 * Recibe: Nombre: String,
 * dificultad: String,
 * tiempo: String,
 * porciones: Int,
 * ingredientes: String,
 * preparacion: String,
 * imagen: Int; Recursos drawable
 *  Regresa un ArrayList
 */

class datosComida {

    companion object {

        fun creacionDatosComida(): ArrayList<ModeloReceta> {
            val listaComida = ArrayList<ModeloReceta>()
            listaComida.add(
                ModeloReceta(
                    "MOLE DE OLLA BLANCO\n\n",
                    "Baja",
                    "2 horas",
                    "8",
                    "1 kilo de chambarete sin hueso, cortado en trozos\n" +
                            "1/2 cebolla blanca\n" +
                            "1/2 cabeza de ajo\n" +
                            "al gusto de sal\n" +
                            "2 elotes cortados en tercios\n" +
                            "1 taza de papa cortada en cubos\n" +
                            "1 taza de zanahoria cortada en rodajas\n" +
                            "1 taza de chayote cortado en cubitos\n" +
                            "1 manojo de epazote\n" +
                            "1 taza de ejote\n" +
                            "1 taza de col cortada en tiritas\n" +
                            "1 taza de calabaza cortada en cubitos\n" +
                            "1 manojo de cilantro\n" +
                            "suficiente de limón",
                    "En una olla a fuego medio calienta agua, agrega el chambarete, el tuétano, la cebolla blanca, el ajo, sazona con sal y cocina hasta que la carne comience a soltar impurezas (espuma). Con ayuda de una cuchara retira todas las impurezas y continúa cocinando por 30 minutos más.\n" +
                            "Agrega las piezas de elote y cocina por 20 minutos, luego las papas, la zanahoria, los chayotes, el epazote y cocina por 15 minutos más. Agrega los ejotes, la col, la calabaza, el manojo de cilantro y cocina hasta que se suavice.\n" +
                            "Sirve caliente, acompañado de tortillas y limones.",
                    "https://cdn.kiwilimon.com/recetaimagen/36095/44214.jpg"
                )
            )
            listaComida.add(
                ModeloReceta(
                    "SÁNDWICH DE PORTOBELLO Y POLLO\n",
                    "Baja",
                    "35 minutos",
                    "4",
                    "1 aguacate para el aderezo\n" +
                            "1 chile serrano finamente picado\n" +
                            "2 cucharadas de cebolla finamente picada\n" +
                            "4 cucharadas de jitomate cortado en cuadritos\n" +
                            "1 cucharada de cilantro fresco finamente picado\n" +
                            "al gusto de sal y pimienta\n" +
                            "2 cucharaditas de aceite de oliva\n" +
                            "1 cucharada de ajo finamente picado\n" +
                            "1 cucharada de orégano\n" +
                            "8 hongos portobello\n" +
                            "1 pechuga de pollo (400 g) Cortada en porciones de 100 gr c/u\n" +
                            "1 taza de espinaca\n" +
                            "1 jitomate bola cortado en rebanadas",
                    "Con ayuda de un tenedor tritura el aguacate y agrega el chile serrano, la cebolla, el jitomate, el cilantro, sazona con limón sal y pimienta. Reserva.\n" +
                            "En un bowl mezcla el aceite de oliva con el ajo, y el orégano, con ayuda de una brocha, barniza los hongos portobello por todos lados.\n" +
                            "Calienta una parrilla a fuego medio coloca los hongos y cocina 2 minutos por cada lado.\n" +
                            "En la misma parrilla, coloca el pollo, barniza con el resto del aceite de oliva con orégano y cocina hasta que esté cocido. Corta en tiras.\n" +
                            "Unta un poco de guacamole en un hongo portobello, agrega el pollo parrillado, espinacas, jitomate y tapa con otro portobello. Sirve con calabacitas asadas.",
                    "https://cdn.kiwilimon.com/recetaimagen/31491/36191.jpg"
                )
            )
            listaComida.add(
                ModeloReceta(
                    "BURRITOS DE CALABAZA",
                    "Baja",
                    "30 minutos",
                    "4",
                    "1 1/2 tazas de jitomate para la salsa\n" +
                            "1/2 taza de cebolla para la salsa\n" +
                            "1/2 taza de chile serrano para la salsa\n" +
                            "1/4 de taza de cilantro fresco para la salsa\n" +
                            "2 cucharadas de jugo de limón para la salsa\n" +
                            "al gusto de sal\n" +
                            "2 cucharadas de aceite vegetal\n" +
                            "1 taza de cebolla picada finamente para el relleno\n" +
                            "1 cucharada de ajo para el relleno\n" +
                            "2 tazas de calabaza para el relleno\n" +
                            "1 taza de grano de elote para el relleno\n" +
                            "al gusto de sal\n" +
                            "1 taza de frijol cocido\n" +
                            "1 taza de arroz cocido\n" +
                            "suficiente de tortillas de harina",
                    "Para la salsa, mezcla el jitomate, la cebolla, el chile, el cilantro, el jugo de limón y sazona con sal. Reserva.\n" +
                            "Para el relleno de calabaza, en un sartén a fuego medio, sofríe la cebolla y el ajo, añade la calabaza, los granos de elote y sazona por 10 minutos. Reserva.\n" +
                            "Forma el burrito con el relleno de calabaza, agrega frijoles y arroz. Acompaña con la salsa y disfruta.\n",
                    "https://cdn.kiwilimon.com/recetaimagen/35810/43392.jpg"
                )
            )
            return listaComida
        }
    }
}