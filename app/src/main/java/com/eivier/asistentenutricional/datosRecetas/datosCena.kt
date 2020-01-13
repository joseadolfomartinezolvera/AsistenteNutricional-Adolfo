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

class datosCena {

    companion object {

        fun creacionDatosCena(): ArrayList<ModeloReceta> {
            val listaCena = ArrayList<ModeloReceta>()
            listaCena.add(
                ModeloReceta(
                    "Lasaña vegetal light",
                    "Baja",
                    "10 minutos",
                    "4",
                    "1 paquete de láminas de lasaña precocida\n" +
                            "3 zanahorias\n" +
                            "1 calabacín\n" +
                            "1 berenjena\n" +
                            "200 g de champiñones\n" +
                            "200 g de espinacas\n" +
                            "100 g de queso rallado\n" +
                            "Aceite de oliva y sal\n" +
                            "200 g de tomate frito\n" +
                            "400 ml de leche desnatada\n" +
                            "30 g de harina",
                    "Preparar la bechamel. Calienta 2 cucharadas de aceite, añade 30 g de harina y tuéstala. Vierte la leche desnatada, en un hilo, removiendo hasta que espese, y sazona.\n" +
                            "Cocer las espinacas. Lava las espinacas y cuécelas al vapor durante unos minutos. Mézclalas con una parte de la bechamel, y resérvalas.\n" +
                            "Rehogar las verduras. Limpia y lava las zanahorias, el calabacín, la berenjena y los champiñones. Sofríe con un hilo de aceite los dos primeros. Luego, añade la berenjena y los champiñones. Saltéalos unos 6 minutos más o menos, sazona al gusto, y mézclalo todo con la salsa de tomate frito.\n" +
                            "Montar la lasaña. Cuece la pasta siguiendo las instrucciones del envase. Sobre una cama de espinacas con bechamel, monta la lasaña alternando capas de pasta y de verdura con salsa de tomate. Cubre con la bechamel restante, espolvorea con el queso, y cuécela alrededor de 20 minutos en el horno precalentado a 170º.",
                    "https://www.clara.es/medio/2017/05/25/convinacion-de-lasana-vegetal-light_4d9c5fb5.jpg"
                )
            )
            listaCena.add(
                ModeloReceta(
                    "Arroz integral con verduras",
                    "Baja",
                    "20 minutos",
                    "2",
                    "240 g de arroz integral\n" +
                            "100 g de judías verdes\n" +
                            "1 zanahoria\n" +
                            "1 pimiento verde\n" +
                            "1 cebolla\n\n" +
                            "1 diente de ajo\n" +
                            "50 g de almendras tostadas\n" +
                            "1 ramita de romero\n" +
                            "Aceite de oliva\n" +
                            "Sal y pimienta",
                    "Cocer el arroz y las judías. Calienta 2 veces y medio el volumen del arroz en agua y sazona. Mientras se calienta, despunta las judías, lávalas y trocéalas. Y cuando rompa a hervir, añade las judías y el arroz. Cuece tapado 20 minutos (consulta el envase del arroz ya que el tiempo de cocción puede variar según su variedad) y deja reposar 10 minutos.\n" +
                            "Saltear las verduras. Raspa la zanahoria, lávala y sécala. Limpia, lava y seca el pimiento. Corta ambos en dados. Pela y pica la cebolla y sofríela 2 minutos, en 2 cucharadas de aceite. Añade el pimiento y la zanahoria, salpimienta y cocina 10 minutos más a fuego lento.\n" +
                            "Hacer la picada y servir. Pela el diente de ajo y lava y seca el romero. Pícalos junto con las almendras. Sofríelo todo 1 minuto en una cucharada de aceite. Añade el arroz y las judías, así como las verduras salteadas. Rehógalo todo junto un par de minutos más. Y sirve en boles individuales.",
                    "https://www.clara.es/medio/2018/06/05/convinacion-arroz-integral-verduras-temporada_5e201e0e.jpg"
                )
            )
            listaCena.add(
                ModeloReceta(
                    "Crema de calabaza al curry con cero grasas",
                    "Baja",
                    "20 minutos",
                    "2",
                    "1 kg de calabaza\n" +
                            "2 cebolletas\n" +
                            "3 dientes de ajo\n" +
                            "300 ml de caldo vegetal\n" +
                            "1 cucharadita de curry\n" +
                            "2 cucharadas de almendras fileteadas\n" +
                            "2 cucharaditas de semillas de sésamo\n" +
                            "Aceite de oliva y sal",
                    "Asar las verduras. Pela la calabaza y elimina las semillas y los filamentos. Corta la pulpa en dados y ponlos en la placa del horno junto con los ajos lavados y sin pelar, y las cebolletas limpias y lavadas. Riega con un hilo de aceite y ásalo todo unos 30 minutos en el horno precalentado a 200o. Retira y deja templar.\n" +
                            "Juntar con el caldo. Corta en aros la parte verde más tierna de las cebolletas y resérvalos para decorar. Trocea el resto y pela los ajos. Tritura ambas hortalizas con la calabaza hasta obtener un puré. Añade el caldo caliente y 1 cucharadita de curry, y cuece 10 minutos más.\n" +
                            "Decorar y servir. En una sartén antiadherente, tuesta las almendras sin aceite. Retíralas y aderézalas con unas gotas de aceite y una pizca de sal. Sirve la crema caliente espolvoreada con las almendras, los aros de cebolleta reservados y el sésamo.",
                    "https://www.pequerecetas.com/wp-content/uploads/2015/07/recetas-saludables-480x480.jpg"
                )
            )
            return listaCena
        }
    }
}