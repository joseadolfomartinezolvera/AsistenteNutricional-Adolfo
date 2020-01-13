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
 * imagen: String; Intenet, libreria Glide
 *  Regresa un ArrayList
 */

class datosDesayuno {

    companion object {

        fun creacionDatosDesayuno(): ArrayList<ModeloReceta> {
            val listaDesayuno = ArrayList<ModeloReceta>()
            listaDesayuno.add(
                ModeloReceta(
                    "MOLLETES: RECETA CON PIMIENTOS\n",
                    "Baja",
                    "25 minutos",
                    "4",
                    "1 taza de queso mascarpone\n" +
                            "1/2 taza de crema para batir\n" +
                            "4 panes integrales\n" +
                            "2 pimientos en tiras\n" +
                            "1 taza de ejotes cocidos\n" +
                            "1/2 taza de espinaca\n" +
                            "4 cdas. de aceite de oliva\n" ,
                    "Mezcla el queso mascarpone con la crema, tuesta los panes y saltea los ejotes y pimientos con el aceite de oliva.\n" +
                            "Cubre los panes con el queso y la verdura.\n" +
                            "Termina con la espinaca y pimienta.\n" ,
                    "https://dam.cocinafacil.com.mx/wp-content/uploads/2019/12/molletes-convinacion-pimientos.jpg"
                )
            )
            listaDesayuno.add(
                ModeloReceta(
                    "DELICIOSO SÁNDWICH DE REQUESÓN CON PEPINO\n",
                    "Baja",
                    "25 minutos",
                    "4",
                    "1 taza de queso mascarpone\n" +
                            "½ taza de crema para batir\n" +
                            "4 panes integrales\n" +
                            "2 pimientos en tiras\n" +
                            "1 taza de ejotes cocidos\n" +
                            "½ taza de espinaca\n" +
                            "4 cdas. de aceite de oliva\n\n" ,
                    "Mezcla el queso mascarpone con la crema, tuesta los panes y saltea los ejotes y pimientos con el aceite de oliva.\n" +
                            "Cubre los panes con el queso y la verdura.\n" +
                            "Termina con la espinaca y pimienta.",
                    "https://dam.cocinafacil.com.mx/wp-content/uploads/2019/12/molletes-convinacion-pimientos.jpg"
                )
            )
            listaDesayuno.add(
                ModeloReceta(
                    "BAGEL DE HUMMUS Y AGUACATE CON BROTES DE CILANTRO\n",
                    "Baja",
                    "15 minutos",
                    "6",
                    "1/2 aguacate\n" +
                            "1 lata de garbanzos enjuagados y colados\n" +
                            "1/3 taza de tahini\n" +
                            "1/4 de taza de jugo de limón\n" +
                            "1 diente de ajo finamente picado\n" +
                            "3/4 de cucharadita de sal en grano\n" +
                            "1/4 de cucharadita de comino molido\n" +
                            "1 taza de hojas de cilantro\n" +
                            "2 cucharadas de aceite de oliva\n" +
                            "2 cucharadas de brotes de cilantron" +
                            "2 cucharadas de germen de brócoli" +
                            "3 bagels partidos a la mitad\n" ,
                    "Coloca en el vaso del procesador el agua- cate, garbanzos, tahini, jugo de limón, ajo, sal, pimienta, comino y cilantro.\n" +
                            "Agrega el aceite de oliva al procesador sin detenerlo en forma de hilo.\n" +
                            "Procesa hasta obtener una mezcla cremosa.\n" +
                            "Unta un poco del hummus en los bagels.\n" +
                            "Añade encima los brotes de cilantro y germen de brócoli.",
                    "https://dam.cocinafacil.com.mx/wp-content/uploads/2019/07/Bagel-hummus-y-aguacate.jpg"
                )
            )
            return listaDesayuno
        }
    }
}