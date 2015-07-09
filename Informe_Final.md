Proyecto de grado
Informe Final

Manejo y Análisis de Información de Riesgos en Uruguay para un Sistema de Apoyo a la Toma de Decisiones

Docentes-Tutores:

Sandro Moscatelli

Libertad Tansini

Estudiantes:

Fernando Carriquiry fcarriquiry@gmaiil.com

Gabriel Fernández pocafernandez@gmail.com

Resumen

Los desastres tanto naturales como provocados por el humano son cada vez más frecuentes, estos van desde inundaciones que dejan sin hogar a cientos de personas, a terremotos que dejan miles de vidas pérdidas y cientos de familias destrozadas.
Los desastres van más allá de pérdidas tangibles ya sean físicas o materiales, estos quedan inmersos en la sociedad, en el medio ambiente, causando pérdidas y daños a veces irreversibles.
Por ello se debe contar con una buena gestión de riesgos y un plan de acción ante estos desastres. La gestión de riesgo, se basa en un conjunto de acciones que buscan reducir al máximo el riesgo de ocurrencia de un desastre, esta se centra en el análisis de los componentes del riesgo, vulnerabilidad y amenaza, buscando mecanismos para la reducción de los mismos y ya no sólo brindar atención luego del desastre sino gestionar su prevención mitigando las causas del mismo.
En el presente proyecto se realizó un extenso análisis del estado de arte en cuanto a la gestión de riesgos a nivel nacional e internacional, mediante una amplia exploración bibliográfica y una reunión con el Sistema Nacional de Emergencia.
Esto dejó ver la necesidad de contar con una herramienta que integre la prevención de los riesgos y la mitigación de los desastres, brindando información relevante a cada etapa de la gestión de riesgos de desastres.
Para ello se definió un conjunto de requerimientos con los cuales debería contar la herramienta, se diseño e implementó un prototipo con un amplio set de funcionalidades que cubren gran parte de los requerimientos relevados.

Índice

1.	Introducción	5
1.1.	Objetivo General	5
1.2.	Objetivos Específicos	5
1.3.	Antecedentes	5
1.3.1.	Terremoto en Haití en el año 2010	5
1.3.2.	Terremoto y tsunami Japón 2011	6
1.3.3.	Inundaciones en Durazno, Treinta y Tres y Soriano en el año 2007	6
1.4.	Estado del arte	7
1.5.	Definición del problema	7
1.6.	Organización del Documento	8
2.	Estado del arte	10
2.1.	Gestión de riesgos	11
2.2.	Modelos de gestión de riesgos	12
2.3.	SINAE	15
2.3.1.	Organización	15
2.4.	Marco de acción de Hyogo	16
2.5.	Indicadores	17
2.5.1.	Índice de Déficit por Desastre (IDD)	17
2.5.2.	Índice de Desastres Locales (IDL)	18
2.5.3.	Índice de Vulnerabilidad Prevalente (IVP)	18
2.5.4.	Índice de Gestión de Riesgo (IGR)	19
2.6.	Herramientas existentes para la toma de decisiones	19
2.6.1.	SAHANA	19
2.6.2.	DesInventar	20
2.6.3.	SUMA	20
3.	Definición de requerimientos	21
3.1.	Requerimientos para un sistema de ayuda a la toma de decisiones sobre gestión de riesgo de desastres.	21
3.1.1.	Manejo de usuarios	21
3.1.2.	Registro de eventos	21
3.1.3.	Indicación de desastre	21
3.1.4.	Gestión de necesidades y suministros.	21
3.1.5.	Registro y gestión de desastres	24
3.1.6.	Calculo de Indicadores	24
3.1.7.	Requerimientos no funcionales	25
3.2.	Requerimientos específicos para el prototipo implementado	26
4.	Diseño	28
4.1.	Consideraciones generales de diseño	28
4.2.	Arquitectura	28
4.2.1.	Base de datos	30
4.2.2.	Despliegue de la aplicación	30
4.3.	Modelo de dominio	32
4.4.	Módulos	33
5.	Implementación y testing.	36
5.1.	Herramientas	36
5.1.1.	Propósito	36
5.1.2.	Lenguaje de programación – Java	36
5.1.3.	Entorno de desarrollo - Eclipse 3.7 Indigo	36
5.1.4.	Desarrollo de interfase de usuarios – GWT	36
5.1.5.	Servicios de negocio - Spring Business Service	36
5.1.6.	Persistencia – Hibernate	36
5.1.7.	Reportes – Jasper	37
5.1.8.	Control de versiones – Subversion	37
5.1.9.	Base de datos - MySQL	37
5.2.	Tecnología aplicada a la arquitectura	37
5.3.	Testing	38
6.	Resultados obtenidos	40
7.	Conclusiones	41
8.	Trabajos Futuros	42
9.	Referencias bibliográficas	44
10.	Anexos	47
10.1.	Planificación	47
10.2.	Patrones y estándares	47
10.3.	Procedimientos	49

1.	Introducción

En esta sección se brinda una introducción a la temática del proyecto, el desarrollo del mismo y los criterios seguidos.
En los últimos años debido a los cambios climáticos y a errores humanos existen cada vez más situaciones de riesgo y desastres, como ser, derrames tóxicos en océanos, devastadores incendios e inundaciones en todo el planeta, terremotos y tsunamis que destruyen ciudades y países enteros.
Los desastres conllevan grandes pérdidas para la comunidad, ya sean pérdidas de vidas humanas, sociales, ambientales, económicas, materiales, entre otras. Podría pensarse que los desastres son inevitables, y que lo único que restaría por hacerse es la reconstrucción y atención del desastre luego de que este ocurre, o se podrían analizar los componentes que llevan al desastre, tales como la amenaza y la vulnerabilidad.
Es aquí donde nace la gestión de riesgos que busca minimizar los daños y pérdidas mediante la mitigación y preparación de la comunidad para enfrentar las mismas.
La gestión de riesgos como disciplina es el resultado más reciente de una evolución en el modo en el que se han atendido los desastres.

1.1.	Objetivo General

Investigar y contribuir al estudio y comprensión de la Gestión de Riesgo de desastres en la actualidad.

1.2.	Objetivos Específicos

•	Analizar la situación nacional, regional e internacional en cuanto a gestión de riesgos y en particular las herramientas que existen y/o se usan para la toma de decisiones.
•	Diseñar un sistema de información que incluya datos históricos de eventos adversos y riegos para el apoyo en la toma de decisiones para la mitigación de dichos eventos.
•	Implementar un prototipo basado en el diseño y en los requerimientos actualmente relevados

1.3.	Antecedentes

A lo largo de la historia se han producido desastres de diversos orígenes que provocan grandes daños tanto a niveles sociales como materiales.
A continuación se citan algunos de los desastres considerados de mayor magnitud e importancia a nivel mundial y nacional de los últimos tiempos.

1.3.1.	Terremoto en Haití en el año 2010

La tarde del 12 de enero del año 2010 un terremoto de magnitud 7 grados en la escala Richter con su epicentro a 15 kilómetros de la capital de Haití, Puerto Príncipe, azotó el país dejando más de 250.000 muertos, 300.000 heridos, 1.5 millones de personas sin hogar y 10 millones de metros cúbicos de escombros.
A todo esto se le sumo una epidemia de cólera que lleva más de 3000 muertos.
Las consecuencias del sismo llevaron a Naciones Unidas a catalogarla como la catástrofe más grave registrada en el mundo durante los últimos cien años.
A dos años del desastre aun se registran más de 500.000 personas viviendo en carpas, en condiciones de salud desfavorables y más de 5 millones de metros cúbicos de escombros por retirar.[1](1.md)

1.3.2.	Terremoto y tsunami Japón 2011

El viernes 11 de marzo del año 2011 un terremoto de 8,8 grados en la escala Richter sacudió la costa noreste de Japón con un posterior tsunami de diez metros de alto, las víctimas mortales fueron 3.373 y 6.000 desaparecidos.
Las millonarias pérdidas y miles de damnificados se sumaron a un riesgo aun peor, la central nuclear de Fukushima resultó afectada, estallaron dos de sus reactores, lo que llevó a un riesgo de fuga masiva de radiación. Las autoridades niponas trasladaron a más de 600.000 personas que vivían en un radio de 20 kilómetros de la planta. Oficialmente se conoce que 160 personas fueron expuestas a la radiación.[2](2.md)
Si bien Japón se ha recuperado de innumerables desastres climáticos, ésta situación fue catalogada por el primer ministro Naoto Kan como “la peor crisis desde la segunda guerra mundial”.
1.3.3.	Inundaciones en Durazno, Treinta y Tres y Soriano en el año 2007
En Mayo del año 2007, las ciudades de Durazno, Treinta y Tres y Soriano se vieron afectadas por las más grandes inundaciones de su historia.
Durazno fue el departamento con mayor número de afectados. El comité Departamental de Emergencia registró 6966 evacuados. El río Yí, que corre al lado de la ciudad, creció por encima de los 13 metros, superando a la más grande creciente que había sucedido en el año 1959 que superó los 12 metros.
Toda la ciudad se vio afectada, debido a que las bombas de la planta de agua potable fueron sumergidas, no hubo agua potable por varios días en toda la ciudad.
Aun hasta dos o tres años después de la inundación hubo personas que permanecieron en refugios para evacuados hasta que se les entregaron viviendas en zonas no inundables. Las viviendas que resultaron inundadas fueron derrumbadas para evitar una posible ocupación en dichas zonas.

En Treinta y Tres las inundaciones afectaron tanto el área rural como el área urbana. El 10% de la población de la ciudad fue alcanzada por el agua, Treinta y Tres contaba con 26767 habitantes según el censo del año 2004, la inundación afectó a 2776 personas, hubo 540 evacuados, los cuales fueron albergados en refugios municipales.
Los daños fueron diversos, fueron afectadas viviendas, calles, caminos, puentes, alcantarillado, etc.
Las inundaciones de mayo del 2007 afectaron a Mercedes y Villa Soriano resultado de la creciente del Río Negro, se contó con información proporcionada por UTE con mas de 24 horas de anticipación, pero estas advertencia fueron subestimadas por una gran parte de la población que no actuó en consecuencia.
La característica singular del desastre en Mercedes, es que alcanzó a todos los sectores socioeconómicos de la población. Los evacuados fueron 2706, se registraron 928 hogares damnificados, se entregaron 937 colchones, 2250 frazadas, 52000 pañales, 19500 kilos de víveres secos, 75000 kilos de leña distribuidos entre 462 familias.[3](3.md)


1.4.	Estado del arte

Al comienzo del proyecto se realizó una investigación del tema, analizando las diferentes definiciones que tienen los organismos más importantes en cuanto a gestión de riegos de desastres. Se vieron las definiciones de desastre, amenaza, vulnerabilidad, peligros naturales, entre otras. Se investigó la disciplina de gestión de riesgos, viendo que el riesgo se relaciona directamente con la vulnerabilidad ante la amenaza. La vulnerabilidad y el peligro de ocurrencia (amenaza) de un fenómeno determinan el grado de riesgo a la que está expuesta una comunidad.
La gestión de riesgos como disciplina, es el resultado más reciente de una evolución en el modo, en el que se han atendido los desastre, inicialmente se tenía un enfoque emergencista en el cual se atendía a la población luego del desastre, con el tiempo se comenzaron a definir etapas anteriores al desastre, intentando reducir la vulnerabilidad de la sociedad ante las amenazas, ésta evolución se ve reflejada en los distintos modelos de gestión de riesgo.
En Uruguay quien se encarga de la gestión de desastres, es el Sistema Nacional de Emergencias (SINAE, posteriormente llamado de esta manera)[4](4.md), que fue creado por el Estado Uruguayo con la ley Nº 18.621.[5](5.md) Por esto se vio la necesidad de indagar en profundidad el mismo, se estudió su estructura y funcionamiento, posteriormente se entró en contacto con Virginia Fernández (encargada del área de información del SINAE), con quien se mantuvo una entrevista, en la cual se expusieron las preocupaciones más importantes del organismo, en materia de la creación de un sistema que le dé sustento a sus operaciones.
Uno de los puntos más relevantes, en la gestión de riesgos, es la posibilidad de contar con medidas cuantificables que evidencien el estado de la gestión, que reflejen la evolución de distintos factores de estudio para mejorar los planes de prevención, mitigación y acción. En éste contexto se analizaron las medidas tomadas en otros países de la región y el mundo, evaluando distintos tipos de indicadores, encontrando más aplicables al Uruguay, los cuatro indicadores desarrollados por el Banco Interamericano de Desarrollo (BID)[6](6.md) y la Universidad Nacional de Colombia[7](7.md)[8](8.md), debido a que ya fueron calculados en 14 países de América Latina y que fueron presentados en la Conferencia Mundial Sobre La Reducción de los Desastres[9](9.md), celebrada del 18 al 22 de enero del 2005 en Kobe, Hyogo, Japón.
Además se investigaron sistemas de software existentes para la toma de decisiones en la gestión de riesgo, encontrándose entre las más utilizadas a nivel mundial a SAHANA [10](10.md) y SUMA [11](11.md), utilizados principalmente para organizar la respuesta ante un desastre, realizando control de suministros y de personal entre otras cosas. En esta última investigación también encontramos un sistema llamado DesInventar [12](12.md), herramienta conceptual y metodológica para la construcción de bases de datos de pérdidas, daños o efectos ocasionados por emergencias o desastres.
DesInventar se basa en la idea de que los pequeños y cotidianos eventos que no llegan a ser considerados desastres, son importantes para la evolución de la gestión del riesgo

1.5.	Definición del problema

El proyecto se basa en la definición de un sistema de información, que sea de ayuda a la toma decisiones en la gestión de riesgos de desastres.
Si bien se plantearon ciertos objetivos iniciales, el proyecto estaba abierto al resultado de la investigación del estado del arte. Ésta derivó en la falta de un sistema que brinde apoyo a las operaciones y decisiones del SINAE y que integre la gestión de riesgos con atención de desastres. Si bien los sistemas actuales relevados cubren gran parte de la atención de desastres, no integran herramientas de ayuda en las etapas previas al desastre, mitigación y prevención. Se necesita contar con medidas cuantificables del desempeño de la gestión y saber en todo momento que grado de riesgo o deterioro sufre la sociedad.


Por ello los objetivos se trasformaron en el análisis de requerimientos necesarios para cubrir:
Identificación del riesgo y cálculo de indicadores.
Para poder reducir el riesgo mediante la toma de decisiones, fortaleciendo las áreas más vulnerables, es necesario identificar y reconocer el riesgo existente y la posibilidad de la generación de nuevos riesgos. Esto implica dimensionar o medir el riesgo para poder monitorear la efectividad y eficiencia de las medidas de intervención adoptadas. Estas mediciones deben ser información cuantificable y de fácil entendimiento para que pueda ser utilizada por los tomadores de decisiones que no son expertos en desastres.

Manejo de desastres; respuesta y recuperación.
Luego de que ocurre un desastre, surgen necesidades en la sociedad que deben ser atendidas. En principio se deben atender las urgencias con una pronta respuesta, se deben organizar y coordinar las operaciones de emergencia. Posteriormente ayudar a la recuperación de los damnificados, planificando la recuperación y reconstrucción de las áreas afectadas.

Mantener un inventario sistemático de desastres, pérdidas y eventos menores que hacen al deterioro continuo de la sociedad.
Se debe contar con un manejo de información histórica de eventos adversos y riesgos (inundaciones, incendios forestales, sequías, entre otros). Esto es relevante a la hora de analizar el estado de situación y planificar una reducción de riesgos.

Evaluación de vulnerabilidad.
Es necesario contar con indicadores que caracterizan las condiciones prevalecientes de vulnerabilidad del país, en términos de exposición en áreas propensas, fragilidad socioeconómica y falta de resiliencia social en general. Aspectos que favorecen el impacto físico directo y el impacto indirecto e intangible en caso de presentarse un fenómeno peligroso.

1.6.	Organización del Documento

El presente documento se encuentra organizado en nueve capítulos, a continuación se describe brevemente el contenido de cada capítulo.
Capitulo 1 Introducción
En esté capitulo se presentan los objetivos generales y específicos del proyecto, luego una introducción a los antecedentes de desastres mas importantes de los últimos tiempos. Se describe una breve introducción del estado del arte en cuanto a la gestión de riesgos de desastres, seguidamente se detalla el problema que busca atacar el proyecto.

Capitulo 2 Estado del arte

En este capítulo se describe los puntos fundamentales de la investigación del estado del arte, por más detalles puede consultarse el Documento Estado del arte.

Capitulo 3 Especificación de requerimientos

En este capítulo se especifican los requerimientos del software SATODE (Sistema de Apoyo a la Toma de Decisiones, de esta forma se le llamó al sistema a desarrollar), los cuales fueron relevados a partir del estudio del estado del arte y de la entrevista realizada a Virginia Fernández, encargada del área de información del SINAE.

Capitulo 4 Diseño

En este capítulo se presenta las distintas visiones del diseño del sistema, se presentan las herramientas a utilizar, arquitectura y modelo de dominio.

Capitulo 5 Implementación y testing

En este capítulo se describen los estándares de implementación seguidos, así como procedimientos, planificación y testeos realizados.

Capitulo 6 Resultados obtenidos

En este capítulo se describen los resultados obtenidos en el transcurso del proyecto. Estos se agruparon en investigación, definición de requerimientos, prototipo alcanzado y experiencia en la aplicación de ingeniería de software.

Capitulo 7 Conclusiones

En este capítulo se describen las conclusiones del proyecto, tanto a nivel del prototipo alcanzado como de la investigación realizada a nivel local, regional y mundial.

Capitulo 8 Trabajos futuros

En este capítulo se describen los trabajos futuros que se creen necesarios para extender el prototipo realizado.

Capitulo 9 Referencias bibliográficas

En este capítulo se detallan las referencias bibliográficas consultadas a lo largo del proyecto.

2.	Estado del arte

Al comienzo del proyecto se realizó una investigación del tema, analizando las diferentes definiciones que tienen los organismos más importantes en cuanto a gestión de riegos de desastres.
A continuación se citan dos definiciones de desastre que se consideran importantes, ya que la primera es la provista por el SINAE, organismo estatal que se encarga de la gestión de desastres en Uruguay, este define como desastre:
“Toda situación que causa alteraciones intensas en los componentes sociales, físicos, ecológicos, económicos y culturales de una sociedad, poniendo en peligro inminente la vida humana, los bienes de significación y el medio ambiente, sobrepasando la capacidad normal de respuesta local y eficaz ante sus consecuencias” ,.
Por otro parte la Comisión Económica para América Latina y el Caribe (CEPAL, de aquí en mas llamada así), por ser una comisión de las Naciones Unidas dedicada principalmente desde su creación en 1948 a contribuir al desarrollo económico de América Latina y el Caribe donde más tarde promueve también el desarrollo social. Define desastre de la siguiente manera:[13](13.md)
“Los desastres tienen un efecto negativo sobre las condiciones de vida de la población, el desempeño económico de los países o regiones en que ocurren, además de que perjudican el acervo y los servicios ambientales. Las secuelas de los desastres se prolongan más allá del corto plazo y, en ocasiones, provocan cambios irreversibles tanto en las estructuras económicas y sociales como en el medio ambiente.”
Analizando estas y las demás definiciones exhibidas en el Documento Estado del Arte, se puede concluir que las mismas tienen en común los siguientes aspectos.

•	Consecuencias en el normal desarrollo de la sociedad.
•	Pérdidas humanas, sociales, económicas y ambientales.
•	Generalmente exceden las capacidades de la comunidad donde ocurren.

Las causas de los desastres (comúnmente llamadas peligros o amenazas) se pueden clasificar en tres tipos, estos son, los producidos por el humano (antrópico), los generados por la naturaleza y la combinación de los anteriores (socio-naturales).[14](14.md)
Se consideran generados por la naturaleza los que derivan de procesos climáticos, geológicos o biológicos. Entre estos están, inundaciones, huracanes, tormentas, tornados, fuertes vientos, granizadas, tormentas de nieve, de arena o polvo, oleajes, sequías, terremotos, avalanchas, volcanes, sismos, maremotos o tsunamis. También diversos tipos de plagas, epidemias y pandemias son peligros naturales de origen biológico.
Se consideran antrópicos los desastres causados por el humano tales como derrames de hidrocarburos, dispersión o emisión de sustancias químicas tóxicas, en el suelo, aire o aguas, incendios forestales y avalanchas debido a una explosión, o terrorismo de cualquier tipo.
Un ejemplo del tipo de desastres socio-naturales es la gripe aviar que combina los resultados de la naturaleza con errores humanos.
Como se ha visto, los desastres se clasifican según el origen de la amenaza o peligro que lo genera (naturales, antrópicos o combinados), pero son la vulnerabilidad de la sociedad frente a tal peligro y la capacidad de resiliencia de la misma, la que determinan la dimensión del desastre. Es por eso que un sismo de la misma intensidad puede destruir un edificio de tres pisos en Chile y no afectar a un edificio de cuarenta pisos en Japón, debido al uso de sistemas anti sismos en las construcciones.
A raíz del estudio de los componentes que hacen al desastre como el peligro y la vulnerabilidad nace la gestión de riesgos que busca minimizar los daños y pérdidas mediante la mitigación y preparación de la comunidad para enfrentar las amenazas.

2.1.	Gestión de riesgos

Los desastres conllevan una gran pérdida para la comunidad ya sean pérdidas de vidas humanas, económicas, sociales, materiales, ambientales entre otras. Se podría pensar que los desastres son inevitables y lo único que resta por hacer es la reconstrucción y atención del desastre luego de que este ocurre. Por ejemplo, si en un área inundable ocurre una inundación se tienen que generar albergues para las personas que quedan sin hogar y reconstruir las viviendas, carretera, etc., luego de que la inundación baje. En este caso, decimos que la comunidad tiene además cierto grado de vulnerabilidad ante el peligro de una inundación y que en todo momento existe riesgo de que suceda dicha inundación.
El riesgo es la probabilidad de ocurrencia del fenómeno. La vulnerabilidad y el peligro de ocurrencia de un fenómeno determinan el grado de riesgo que corre la comunidad, por ejemplo si se mudaran las viviendas a una zona no inundable, se baja a cero la vulnerabilidad ante el peligro de inundación, se elimina el riesgo que corre dicha comunidad. Se dice que este depende entonces del producto de la vulnerabilidad por el peligro o amenaza.[15](15.md)

RIESGO = VULNERABILIDAD X AMENAZA

La gestión de riesgo se basa en un conjunto de acciones que buscan reducir al máximo el riesgo de ocurrencia de un desastre, este se centra en el análisis de las componentes del riesgo, vulnerabilidad y amenaza, buscando mecanismos para la reducción de los mismos y ya no solo dar atención luego del desastre sino gestionar su prevención mitigando las causas del mismo.
La gestión de riesgos como disciplina es el resultado más reciente de una evolución del modo en el que se han atendido los desastres pasando por los siguientes períodos claves:[14](14.md)

•	En la década de los 80’ se cuestionó el enfoque emergencista y se empezaron a diferenciar las distintas etapas que hacen al desastre. Se comenzó a hablar de la prevención y de la preparación para la emergencia, resaltando las etapas previas al desastre com
o de mayor importancia para reducir la ocurrencia de los mismos.

•	En los 90’ debido a grandes crisis humanitarias, se cuestionó aún más el enfoque tradicional emergencista, al mismo tiempo que la Organización de las Naciones Unidas (ONU, llamada así de aquí en adelante) declarara la década de 1990 a 2000 como el Decenio Internacional para la Reducción de Desastres. Aquí comienza a cobrar relevancia la gestión de riesgos en el desarrollo sostenible.

•	A finales de la década de los 90’, nace el enfoque de derechos humanos en la gestión de riesgos, dando importancia al desarrollo de las capacidades y participación local de la sociedad, marcando como principal accionar las decisiones cotidianas para eliminar el riesgo. Con el correr de los años se potenció aún más éste enfoque.
Se puede observar que en Uruguay se fue acompañando tímidamente éste proceso, sin embargo continuó con un enfoque emergencista, sin marco regulatorio hasta la creación de SINAE en el año 2005.
Se puede pensar entonces, que ésta evolución fue acompañada del desarrollo de distintos modelos de gestión de riesgos, que se verán a continuación.

2.2.	Modelos de gestión de riesgos
El enfoque tradicional para la gestión de desastres ha sido una serie de secuencias de acciones o una serie continua (sequence of action). Este se puede representar como un ciclo, ver figura 1.

En éste modelo, la gestión de desastres se produce por etapas, en secuencia. Las etapas antes del desastre son Prevención, Mitigación, Preparación y las etapas pos-desastre son respuesta, recuperación, desarrollo [16](16.md).

El SINAE define algunas de las etapas del modelo de la siguiente forma:

•	“Prevención: medidas y acciones, de carácter técnico y legal, dispuestas con anticipación para evitar o impedir que se presente un fenómeno peligroso, o para evitar o reducir su incidencia sobre la población, los bienes, los servicios y el ambiente”

•	“Mitigación: Planificación y ejecución de medidas de intervención dirigidas a reducir o disminuir el riesgo. La mitigación es el resultado de la aceptación de que no es posible controlar el riesgo totalmente; es decir, que en muchos casos no es posible impedir o evitar totalmente los daños y consecuencias y sólo es posible atenuarlas“

•	“Preparación: son las actividades de carácter organizativo orientadas a asegurar la disponibilidad de los recursos y la efectividad de los procedimientos necesarios para enfrentar una situación de desastre.”
•	“Atención de desastres: es el conjunto de acciones preventivas y de respuesta dirigidas a la adecuada protección de la población, de los bienes y del medio ambiente ante la ocurrencia de un evento determinado.

•	“Recuperación: Es el conjunto de acciones posteriores al evento catastrófico, que buscan el restablecimiento de condiciones adecuadas y sostenibles de vida mediante la rehabilitación, reparación o reconstrucción del área afectada, de los bienes y de los servicios interrumpidos o deteriorados, y la reactivación del desarrollo económico y social de la comunidad.”

En contraposición se encuentra el modelo Expand-contract model. En éste, la gestión de desastres es vista como un proceso continuo. Existen una serie de actividades que se ejecutan en paralelo y no como una secuencia.Estos se representan como líneas diferentes en la Figura 2.

Las líneas de acción se llevan a cabo en paralelo todas a la vez, expandiéndose o contrayéndose a demanda. A modo de ejemplo, inmediatamente después de una catástrofe la línea de asistencia y respuesta se expande. Pero con el correr del tiempo esta se contrae y se expandirá la línea de recuperación y rehabilitación. El patrón que seguirán las líneas de acción dependerá de la relación entre el evento que causa el desastre y la vulnerabilidad de la comunidad ante él.[16](16.md)
Existen también los modelos Disaster Crunch y Release Models, en los cuales la gente y sus vulnerabilidades son el mayor centro de atención para reducir los riegos. Estos modelos muestran que un desastre ocurre sólo si el riego impacta en una comunidad vulnerable. Son útiles para comprender y explicar las causas de los desastres y adoptar una perspectiva de causa-efecto.
El modelo Disaster Crunch muestra una progresión de la vulnerabilidad a partir de las causas fundamentales, ver figura 3. Comienza con causas subyacentes de la sociedad que impide satisfacer las demandas de la personas.
Las causas subyacentes son traducidas, por presiones dinámicas en condiciones inseguras.
Las condiciones inseguras son los contextos vulnerables donde las personas y los bienes son expuestos al riesgo de desastre. Éstas pueden ser, fragilidad del medio ambiente físico, tales como, lugares propensos a los desastres o peligrosos, edificios inseguros, infraestructuras inseguras, frágil economía local, tales como, ganadería en riesgo, bajos niveles de ingresos. [17](17.md)

A través de la inversa del modelo Disaster Release (Figura 4) muestra que el riesgo de los desastres puede reducirse. Esto requiere una acción preventiva o de mitigación para reducir el riesgo. Éstas medidas empiezan por estudiar:
•	La naturaleza de los peligros y amenazas de la comunidad
•	La naturaleza de las causas subyacentes.
Esto permitiría la reducción de las presiones dinámicas, por ejemplo, tendencia a ocupar las tierras propensas a los desastres, la falta de conciencia para poner en práctica la mitigación, etc, tomando las medidas adecuadas.
Esto a su vez conduce a condiciones más seguras [17](17.md).

2.3.	SINAE

El Sistema Nacional de Emergencias fue creado por el Estado Uruguayo en la ley Nº 18.621, “es un sistema público de carácter permanente, cuya finalidad es la protección de las personas, los bienes de significación y el medio ambiente, ante el acaecimiento eventual o real de situaciones de desastre, mediante la coordinación conjunta del Estado con el adecuado uso de los recursos públicos y privados disponibles, de modo de propiciar las condiciones para el desarrollo nacional sostenible” [4](4.md)
Sus principales cometidos son: coordinar las tareas, recursos, responsabilidades y acciones de los distintos organismos públicos, privados, organizaciones sociales e individuos para llevar adelante la prevención, mitigación, atención, rehabilitación y recuperación ante situaciones de desastre. Haciendo un uso eficiente y eficaz de los recursos humanos, técnicos, administrativos y económicos.

2.3.1.	Organización

El Sistema Nacional de Emergencias se encuentra integrado por :[4](4.md)[5](5.md)

•	Poder Ejecutivo.
•	Dirección Nacional de Emergencias.
•	Comisión Asesora Nacional para Reducción de Riesgo y Atención de Desastres.

•	Ministerios, entes autónomos y servicios descentralizados.
•	Comités Departamentales de Emergencias.
•	Centros Coordinadores de Emergencias Departamentales (CECOED)

En el documento Estado Del Arte se da más en detalle el funcionamiento de cada componente de la organización.

2.4.	Marco de acción de Hyogo

En Kobe, Hyogo Japón del 18 al 22 de enero de 2005 se celebró la Conferencia Mundial sobre la Reducción de los Desastres, uno de los más grandes eventos en pos de promover un enfoque estratégico y sistemático de reducción de la vulnerabilidad a las amenazas/peligros y señalar los medios para aumentar la resiliencia de las naciones y las comunidades ante los desastres.
En dicha conferencia se aprobó el Marco de Acción de acción de Hyogo para 2005-2015: Aumento de la resiliencia de las naciones y las comunidades ante los desastres.[18](18.md)

Las cinco prioridades de acción de este marco son:

1.	Velar por que la reducción de los riesgos de desastre constituya una prioridad nacional y local dotada de una sólida base institucional de aplicación.

2.	Identificar, evaluar y vigilar los riesgos de desastre y potenciar la alerta temprana.

3.	Utilizar los conocimientos, las innovaciones y la educación para crear una cultura de seguridad y de resiliencia a todo nivel.

4.	Reducir los factores de riesgo subyacentes.

5.	Fortalecer la preparación para casos de desastre a fin de asegurar una respuesta eficaz a todo nivel.

Para poder cumplir con estos puntos propuestos en el Marco de Acción de Hyogo, es necesario contar con indicadores que evidencien el riesgo, que midan la gestión y que ayuden a una mejora continua de las características que fortalecen a la sociedad, aumentando la resiliencia de la misma.

2.5.	Indicadores

Para poder reducir el riesgo mediante la toma de decisiones fortaleciendo las áreas más vulnerables, es necesario identificar y reconocer el riesgo existente y la posibilidad de la generación de nuevos riesgos. Esto implica dimensionar o medir el riesgo para poder monitorear la efectividad y eficiencia de las medidas de intervención adoptadas. Estas mediciones deben ser información cuantificable y de fácil entendimiento para que pueda ser utilizada por los tomadores de decisiones que no son expertos en desastres. Medir el riesgo no es solo cuantificar cuántas vidas, daños físicos o pérdidas económicas se producirán sino también las pérdidas sociales, organizacionales o institucionales. [14](14.md) [8](8.md)
Por lo tanto, se hace necesario el uso de indicadores que expongan los niveles de riesgo a los que se está expuesto, dichos indicadores pueden ser tanto a nivel local, departamental, como nacional en donde se pueda ver distintos niveles de detalle.
A continuación se presentan cuatro indicadores desarrollados por el Banco Interamericano de Desarrollo (BID, llamado así posteriormente) en conjunto con Instituto de Estudios Ambientales de La Universidad Nacional de Colombia (IDEAS, llamado así en adelante) en el cual pretenden exponer información a nivel nacional para ser utilizada por los agentes nacionales tomadores de decisiones y para ser utilizado en la comparación entre países.
Se escogió el estudio de estos cuatro índices debido a que fueron calculados y publicados en 14 países de Latino América [19](19.md)

1.	Argentina
2.	Colombia
3.	Ecuador
4.	Guatemala
5.	México
6.	Bolivia
7.	Rep. Dominicana
8.	Chile
9.	Costa Rica
10.	Él Salvador
11.	Jamaica
12.	Perú
13.	Nicaragua
14.	Trinidad y Tobago

También cobran importancia ya que fueron presentados en la Conferencia Mundial Sobre La Reducción de los Desastres, celebrada del 18 al 22 de enero del 2005 en Kobe, Hyogo, Japón.
2.5.1.	Índice de Déficit por Desastre (IDD)
Refleja el riesgo del país en términos macroeconómicos y financieros ante eventos catastróficos probables, para lo cual es necesario estimar la situación de impacto más crítica en un tiempo de exposición, definido como referente, y la capacidad financiera del país para hacer frente a dicha situación.[14](14.md)
Las pérdidas potenciales se calculan mediante un modelo que toma en cuenta diferentes peligros dimensionando sus intensidades según los registros históricos y por otra parte la vulnerabilidad actual de las áreas y elementos expuestos. No se valora el registro histórico de pérdidas de vidas, sino la intensidad de los fenómenos.
Se define un nivel de referencia para estimar pérdidas factibles, conocido como pérdida máxima probable, para calcularla se toma en cuenta el Evento Máximo Considerado (EMC).
Luego la resiliencia económica representa los posibles fondos internos o externos a los cuales el gobierno puede acceder para hacer frente al EMC en el momento del cálculo del índice.
El índice se compone de dividir lo que se espera gastar por lo que se cree disponer, si este factor es mayor a 1.0 significa la incapacidad del país a hacer frente a desastres extremos.

2.5.2.	Índice de Desastres Locales (IDL)

Con el IDL se captura la problemática de riesgo social y ambiental, que deriva de los eventos frecuentes menores que afectan de manera crónica el nivel local y subnacional, afectando en particular a los estratos socioeconómicos más vulnerables de la población y generando un efecto altamente perjudicial para el desarrollo del país.[14](14.md)
El IDL está constituido por la suma de tres subindicadores calculados con base en las cifras, de personas fallecidas, personas afectadas y pérdidas en cada municipio, causadas por cuatro tipos de eventos genéricamente denominados: deslizamientos y flujos, fenómenos sismo-tectónicos, inundaciones y tormentas y otros eventos. Las pérdidas han sido valoradas de acuerdo con valores promedio de reposición del número de viviendas destruidas o afectadas y el costo promedio de cultivos afectados en cada desastre a nivel local.

2.5.3.	Índice de Vulnerabilidad Prevalente (IVP)

Está constituido por una serie de indicadores que caracterizan las condiciones prevalecientes de vulnerabilidad del país en términos de exposición en áreas propensas, fragilidad socioeconómica y falta de resiliencia social en general, aspectos que favorecen el impacto físico directo y el impacto indirecto e intangible en caso de presentarse un fenómeno peligroso.[14](14.md)
El IVP es un promedio de tres tipos de indicadores:
Indicadores de Exposición y Susceptibilidad
En el caso de exposición y/o susceptibilidad física, los indicadores que cumplen mejor esa función son los que reflejan población susceptible, activos, inversiones, producción, medios de sustento, patrimonios esenciales y actividades humanas. También pueden considerarse como indicadores de este tipo los que reflejan tasas de crecimiento y densificación poblacional, agrícola o urbana.
Indicadores de Fragilidad Socio-económica.
La fragilidad socio-económica se representa mediante indicadores de pobreza, inseguridad humana, dependencia, analfabetismo, disparidad social, desempleo, inflación, deuda y degradación ambiental. Son indicadores que reflejan debilidades relativas o condiciones de deterioro que agravarían los efectos directos causados por fenómenos peligrosos.
Indicadores de Resiliencia
Como factor de vulnerabilidad la falta de resiliencia, LR, puede representarse en cada nivel mediante el tratamiento complementario o invertido de un amplio número de indicadores relacionados con el nivel de desarrollo humano, el capital humano, la redistribución económica, la gobernabilidad, la protección financiera, la percepción colectiva, la preparación para enfrentar situaciones de crisis y la protección ambiental. Éste conjunto de indicadores por sí solos y particularmente desagregados en el nivel local podrían facilitar la identificación y la orientación de las acciones que se deben promover, fortalecer o priorizar para lograr un mayor nivel de seguridad.
En general el IVP refleja susceptibilidad por el grado de exposición física de bienes y personas, lo que favorece el impacto directo. Igualmente, refleja condiciones de fragilidad social y económica que favorecen el impacto indirecto e intangible. Y, también, refleja falta de capacidad para absorber las consecuencias, responder eficientemente y recuperarse. La reducción de estos tipos de factores, objeto de un proceso de desarrollo humano sostenible y de políticas explícitas de reducción de riesgo, es uno de los aspectos en los cuales debería ponerse especial énfasis.

2.5.4.	Índice de Gestión de Riesgo (IGR)

El objetivo de éste índice, es la medición del desempeño o performance de la gestión del riesgo. En cualquier caso, éste tipo de mediciones se han considerado subjetivas y arbitrarias debido a su carácter normativo; es decir que es necesario definir referentes. Esto significa establecer una escala de niveles de desempeño o la “distancia” con respecto a ciertos umbrales objetivo o al desempeño obtenido por un país líder considerado como el referente.[14](14.md)
Para la formulación del IGR se tuvieron en cuenta cuatro políticas públicas:

1.	Identificación del riesgo, IR (que comprende la percepción individual, la representación social y la estimación objetiva)

2.	Reducción del riesgo, RR (que involucra propiamente a la prevención-mitigación)

3.	Manejo de desastres, MD (que corresponde a la respuesta y la recuperación)

4.	Gobernabilidad y Protección financiera, PF (que tiene que ver con la transferencia del riesgo y la institucionalidad).

Para cada política pública se proponen seis Indicadores de Gestión de Riesgo que caracterizan el desempeño de la gestión del riesgo en el país.

2.6.	Herramientas existentes para la toma de decisiones

Se buscó información sobre los actuales sistemas utilizados en los últimos grandes desastres desarrollados en el mundo y se encontraron las siguientes herramientas que brindan apoyo a la operativa de acción y recuperación ante un desastre. En el documento Estado del Arte se detalla más en profundidad cada herramienta.

2.6.1.	SAHANA

Software para la gestión de la atención de desastres, creado en el 2004, luego del terremoto en el océano Índico en Sri Lanka. Luego la Agencia Sueca del Desarrollo Internacional (ASDI) fundó la organización Lanka software Fundation con el objetivo de llevar la aplicación a un uso global para desastres de gran escala. [20](20.md)
Hoy en día el sistema se compone de tres grandes módulos desarrollados en base a software libre y mantenido por una gran red de colaboradores.
SAHANA EDEN (Emergency Development Environment)
Software para la gestión de necesidades humanitarias críticas, sirve al apoyo en la toma de decisiones tanto antes como después de un desastre
EDEN a sido utilizado en el terremoto de fines del 2010 en Haití, terremoto y tsunami en Japón 2011, inundaciones en Colombia 2011, inundaciones en Venezuela 2010, inundaciones en Pakistán 2010, huracanes en Veracruz México.
El sistema fue adopto por el Centro Asiático de Preparación para Desastres (ADPC) para la reducción de riesgos de desastres.
SAHANA VESUVIUS (Hospital Triage and Lost Person Finder Capabilities).
Software para la preparación y respuesta de las comunidades médicas ante desastres permitiendo la reagrupación de familias, selección y clasificación de pacientes según prioridades de atención, privilegiando la posibilidad de supervivencia, de acuerdo a las necesidades terapéuticas y los recursos disponibles. El desarrollo del software es dirigido por la Biblioteca Nacional de Medicina de EE.UU.
SAHANA MAYON (Emergency Resource Management Capabilities for Municipalities)
Es un software para la gestión de recursos y personal para desastres, tiene gran escalabilidad para gestionar un gran número de eventos, personas y recursos.

2.6.2.	DesInventar

DesInventar [21](21.md) es una herramienta conceptual y metodológica para la construcción de bases de datos de pérdidas, daños o efectos ocasionados por emergencias o desastres. Se basa en la idea de que los pequeños y cotidianos eventos que no llegan a ser considerados desastres son importantes para la evolución de la gestión del riesgo. Es ideal para tratar los inventarios analíticamente, como requisito básico para la producción de investigaciones comparativas y estudios de casos, para el apoyo en la toma de decisiones sobre acciones de mitigación y gestión de riesgos.

2.6.3.	SUMA

SUMA (Sistema de Manejo de Suministros Humanitarios) es un software que surge en el año 1992 auspiciado por la OPS (Organización Panamericana de la Salud) y OMS (Organización Mundial de la Salud), para la gestión de suministros ante la presencia de un desastre. Generalmente cuando ocurre un desastre de significancia comienzan a llegar grandes donaciones, esta herramienta es de gran ayuda en el proceso de identificación, clasificación y entrega de toneladas de suministros. [22](22.md)
El sistema manipula todo el flujo de los suministros desde que son ofertados por los donantes hasta su almacenamiento y distribución. Cuenta con más de 3000 voluntarios capacitados de diferentes países que trabajan con el sistema, esta gente releva los suministros en puntos de entrada como aeropuertos, puertos, en las bodegas y centros de distribución. Toda esta información se envía digitalmente a un lugar centralizado, para que luego el software genere informes tanto estándares como específicos, para ayudar con la toma de decisiones a los coordinadores de desastres.
SUMA es aceptado como estándar para el manejo de suministros de socorro en América Latina y el Caribe.
El sistema está conformado por tres componentes:

•	SUMA central
•	Unidad de Campo
•	Modulo de manejo de bodegas

SUMA central es usado en el lugar donde se encuentran los tomadores de decisiones que están administrando el desastre.
Las principales tares son definición los parámetros utilizados por las Unidades de Campo, tales como: lugares de recepción, directorio de envíos, definición del usuario principal, incorporación de la información enviada por las Unidades de Campo (Consolidación).Soporte de consultas o confección de reportes que sirvan de apoyo al proceso de toma de decisiones y promuevan la coordinación interinstitucional.

3.	Definición de requerimientos

En esta sección se especifican los requerimientos del software SATODE (Sistema de apoyo a la toma de decisiones), los cuales fueron relevados a partir del estudio del estado del arte y de la entrevista realizada a Virginia Fernández, encargada del área de información del SINAE. A continuación se presentan los aspectos más importantes que son tratados en detalle en el documento Especificación de Requerimientos.

3.1.	Requerimientos para un sistema de ayuda a la toma de decisiones sobre gestión de riesgo de desastres.

3.1.1.	Manejo de usuarios

Los usuarios del sistema deben autenticarse para poder saber quién se conectó y de esta forma cargar sus permisos y privilegios. Por otra parte, se debe poder administrar diferentes perfiles de usuarios y limitar las acciones que pueden hacer cada uno de estos. Esto es necesario, ya que el sistema será utilizado desde diversos puntos del país con distintos propósitos, es importante asegurar que un usuario solo intervenga en los datos y funciones del sistema que están en su campo de acción.

3.1.2.	Registro de eventos

De la entrevista (Anexo 1 del documento Estado del Arte) con la Lic. Virginia Fernández, encargada del área de información del SINAE surge la necesidad de contar con una base de datos para registro de eventos (incendios, sequías, inundaciones, entre otros). Si bien ya existe un sistema para registros de eventos, denominado DesInventar, utilizado por una gran cantidad de países Latinoamericanos, en la entrevista se mencionó que Uruguay no utiliza este sistema, debido a que tiene una base de datos centralizada, en la que se lleva la información de todos los países y ésta es administrada por la gente de desinventar.org. El SINAE quiere tener su propia base y administrarla.
Según lo mencionado por Virginia Fernández, DesInventar liberará una versión que podrá ser instalada en los servidores del SINAE y ser administrada por ellos, por lo que el registro de eventos del SATODE debe ser compatible con los registros de eventos de DesInventar para luego poder integrar ambos sistemas. Por lo tanto, el registro de eventos debe contar con información compatible con la que maneja el sistema DesInventar.

3.1.3.	Indicación de desastre

Para que un evento sea considerado como estado de desastre, anteriormente debe haber sido decretado así por el Poder Ejecutivo, siendo éste el encargado de declararlo junto con el Presidente de la República en acuerdo con los Ministros competentes por razón de materia, o en Consejo de Ministros. Según lo indica la Ley Nº 18.621 [5](5.md).
Una vez decretado el evento como estado de desastre, un funcionario del SINAE, con los permisos adecuados, debe indicar al sistema SATODE que el evento se convirtió en desastre. Ésta distinción es trascendente ya que no todos los eventos sobrepasan las capacidades locales convirtiéndose así en un desastre que el SINAE debe atender. El sistema guarda la fecha de decreto del desastre, así como también el usuario que ingresó la información.
Con la distinción realizada, en otras partes del sistema se asociará información al desastre, para luego realizar consultas necesarias asociadas a este.

3.1.4.	Gestión de necesidades y suministros.

Con el desastre surgen necesidades, que serán ingresadas en el sistema SATODE por un representante del CECOED u otro funcionario del SINAE con los privilegios para realizar la tarea, indicando si dicha necesidad será cubierta con recursos locales o si se necesita ayuda del SINAE.
En caso de solicitar ayuda, su requerimiento pasa a la gestión de necesidades. El encargado de la gestión de necesidades debe indicar si el requerimiento puede ser cubierto o no. En el caso de suministros se deberá corroborar la existencia de stock en los depósitos o en caso contrario debe realizarse una solicitud de compra. Siendo enviadas al punto de entrega.
El encargado de compras debe ingresar los precios de los artículos e indicar si deben ser entregados directamente en el punto de entrega o en un depósito. En el caso de ir a depósito se debe decir las cantidades de suministros y cuál será su punto de entrega.
Los suministros llegan a los depósitos por compras, donaciones enviadas desde los puntos de entrada, o devoluciones que realizan los puntos de entrega o traspasos desde otros depósitos.
Si los suministros llegan por compras, el encargado de depósito confirmará su ingreso, actualizando los inventarios.
Si los suministros provienen de un punto de entrega por ser una devolución, el encargado de depósito debe clasificarlos, indicando que tipo de suministros llegaron, su estado y cantidad, actualizando luego el inventario.
En el caso de que los suministros provengan de una donación, estos llegarán a los puntos de entrada donde serán clasificados y se envían a un depósito, luego el encargado del depósito confirma la recepción de los suministros, haciendo las correcciones pertinentes si existieran diferencias, posteriormente se actualizan los inventarios.
A continuación se presenta un diagrama que ejemplifica el flujo del trabajo:

Ingreso de necesidades

Para atender a los damnificados de un desastre surgen necesidades de suministros como ser: medicamentos, herramientas, abrigo, también pueden surgir necesidades de personal médico calificado u obreros para liberar casas inundadas. Los referentes de los CECOED son los receptores en primera instancia de las necesidades de la comunidad y deben atenderlas con recursos locales o solicitar ayuda al SINAE. Si las necesidades son cubiertas con recursos locales se debe especificar un costo estimado para luego tener un costo global del desastre. Si las necesidades sobrepasan la capacidad local y se solicita ayuda se debe especificar para el caso de suministros, todos los suministros necesarios, sus cantidades y el punto de referencia donde deben ser entregados, en otro caso una descripción detallada.
Gestión de necesidades
La gestión de necesidades es la parte en la que un responsable del SINAE se encarga de gestionar las necesidades que surgen en los desastres. Se debe priorizar las necesidades y analizarlas para proveerles atención, se debe determinar si éstas se pueden satisfacer y en caso positivo realizar un plan de acción. Para solicitud de suministros se tiene que controlar las existencias de los depósitos para ver si la necesidad puede ser cubierta o si se debe comprar o solicitar ayuda al exterior o a la población. Se debe registrar el plan de acción, en el cual se indican las solicitudes de compras (acción mediante la cual se le solicita al encargado de compras los suministros a adquirir), solicitudes de envío (acción mediante la cual se le solicita al encargado de depósito que envíe suministros a los puntos de entrega).

Punto de entrada

Es un punto de referencia donde se reciben por primera vez los suministros provenientes de donaciones. Aquí se clasifican y se destinan a distintos depósitos. Cada uno de estos posee un responsable. Generalmente son sitos en los aeropuertos o puertos, pudiendo ser también organizaciones, tales como CRUZ ROJA.

Punto de entrega

Son puntos de referencia distinguidos donde se encuentran los damnificados que recibirán la ayuda, pueden ser los CECOED, Intendencias, refugios, entre otros.

Suministros

Los suministros son materiales físicos que llegan a los puntos de entrada siendo donados o adquiridos a través de compras. Estos se clasifican y se almacenan en los depósitos.
En todos los casos los suministros llegan en lotes que tienen la información de la procedencia, tipo y cantidades en sus respectivas unidades.
Si son donaciones, el lote también llevará la información del donante.
Los suministros son de un determinado tipo, que cuenta con la siguiente información: nombre, descripción, unidad, si precisa refrigeración o no. En caso de alimentos y medicamentos será necesario establecer vencimiento de validez de uso.

Clasificación de suministros

Como se dijo anteriormente, al llegar los suministros deben ser clasificados. Ésta clasificación consiste en registrar el tipo de suministro que llegó, estado y cantidad en la unidad que corresponda (ej., unidades, metros, kilogramos). En el caso de donaciones se registra el donante. Además se registran observaciones generales, en el caso de devoluciones se indica los motivos de devolución.

Depósitos

Los depósitos son los lugares físicos utilizados para guardar los suministros mientras no son enviados a los puntos de entrega. De estos se llevará la información de la dirección, teléfonos e email de contacto, el área en metros cuadrados y metros cúbicos.
Cuentan con un encargado que es el responsable por las operaciones que se realizan, básicamente gestiona las entradas y salidas.
Las operaciones que realiza son: recepción de compras, de donaciones provenientes de los puntos de entrada, transferencias entre depósitos, recepción de devoluciones o ajustes al stock.

Compra de suministros

Desde la gestión de necesidades se crean las solicitudes de compra, se detallan los suministros que se deben comprar y el depósito o punto de entrega al cual se deben enviar. El encargado de compras debe registrar los costos y el proveedor al que se le compró. En caso de considerar que no se debe o no se puede comprar los suministros indicados se rechaza la solicitud de compra indicando el motivo.

Puntos de Referencia

Los puntos de referencia son lugares físicos importantes por su función en la gestión de desastres, estos puntos pueden ser utilizados para realizar un mapa de riesgos en donde se muestre los puntos importantes como ser hospitales, refugios, bomberos, policía, caminera, cuarteles y otros.
El sistema debe contar con altas, bajas y modificaciones de los mismos, indicando si pueden ser puntos de entrada y/o puntos de entrega. El que sean puntos de entrada permitirá registrar donaciones que entran al país por ese punto y el que sean puntos de entrega permitirá registrar envíos de suministros a dichos puntos.

3.1.5.	Registro y gestión de desastres

Registro de propiedades siniestradas

Luego de un desastre, como ser una inundación, quedan un gran número de casas y propiedades en general totalmente deterioradas y los damnificados no siempre pueden hacer frente a los costos de reparación para que sus casas sean habitables.
Las Intendencias solicitan entonces al SINAE ayuda económica para enfrentar las obras. Por ello el SINAE precisa llevar registro de los daños a las propiedades (como ser fotos antes y después de las reparaciones).
Se tomó como base para relevar los requerimientos y la información necesaria el registro que lleva el SINAE para relevar información sobre las aéreas inundables, esta ficha a sido utilizado en varias inundaciones y se a ido mejorando Para ver el detalle de esta ficha ver Anexo 2 del documento Estado Del Arte.

Costos

Es relevante llevar un registro detallado de los costos en los que se incurre al tratar un desastre, el fin primero es poder saber en futuros desastres los costos similares a los que se hará frente. Es preciso registrar costos por traslados, esto incluye: costo del combustible utilizado, costos de mano de obra, costo de alimentos y abrigo en refugios.
En el caso de inundaciones antes de que los evacuados regresen a los hogares estos deben ser limpiados, fumigados, blanqueados, todos estos costos deben incluirse. Se debe registrar también la pérdida de ingresos por no haber trabajado los días del desastre y pérdidas materiales.

Gestión de personal

Se debe poder gestionar el personal encargado de administrar el desastre, siendo estos referentes de las distintas organizaciones. Es esencial conocer quién está cumpliendo cada uno de los roles dentro de la gestión, así como su información de contacto, en qué horario y en qué punto de referencia se encuentra trabajando.

3.1.6.	 Calculo de Indicadores

Para poder reducir el riesgo mediante la toma de decisiones fortaleciendo las áreas más vulnerables es necesario identificar y reconocer el riesgo existente y la posibilidad de la generación de nuevos riesgos. Esto implica dimensionar o medir el riesgo para poder monitorear la efectividad y eficiencia de las medidas de intervención adoptadas. Estas mediciones deben ser información cuantificable y de fácil entendimiento para que pueda ser utilizada por los tomadores de decisiones que no son expertos en desastres. Medir el riesgo no es sólo cuantificar cuántas vidas, daños físicos o pérdidas económicas se produjeron sino también las pérdidas sociales, organizacionales o institucionales.

Índice de Desastres Locales (IDL)

Por el Índice de Desastres Locales se captura la problemática de riesgo social y ambiental que se deriva de los eventos frecuentes menores que afectan de manera crónica el nivel local y subnacional, afectando en particular a los estratos socioeconómicos más frágiles de la población y generando un efecto altamente perjudicial para el desarrollo del país.[8](8.md)
Para el cálculo de este índice se recomienda utilizar la base de datos DesInventar, como Uruguay no está ingresado en dicha base de datos, se utilizará el registro de eventos del SINAE el que estará integrado al sistema. De la base de datos se precisa: el número de fallecidos, afectados y pérdidas directas ya que el valor del IDL es la suma de tres índices que dependen de ellos.
Las pérdidas directas se calculan en base a una valoración económica de las viviendas y cultivos destruidos, aquí se toman las viviendas afectadas como un 0.25 de vivienda destruida.
El valor de reposición de cada vivienda destruida se asume equivalente al valor promedio de una vivienda de interés social según el patrón existente en cada país (número de metros cuadrados), en el período de análisis, y que el valor por metro cuadrado de vivienda de interés social corresponde al valor de un salario mínimo legal promedio en el mismo período.
Por otra parte, el valor de una hectárea de cultivos se determina con base en un precio promedio ponderado de las áreas de cultivos usualmente afectadas, según el criterio de expertos de cada país en el período de análisis.
En el documento Especificación de Requerimientos se detalla el cálculo necesario.

Índice de Gestión de Riesgos (IGR)

El objetivo de este índice es la medición del desempeño o performance de la gestión del riesgo. En cualquier caso este tipo de mediciones se ha considerado subjetivas y arbitrarias debido a su carácter normativo; es decir que es necesario definir referentes [8](8.md).
Para la formulación del IGR se tienen en cuenta cuatro políticas públicas:

1.	Identificación del riesgo, IR (que comprende la percepción individual, la representación social y la estimación objetiva)

2.	Reducción del riesgo, RR (que involucra propiamente a la prevención-mitigación)

3.	Manejo de desastres, MD (que corresponde a la respuesta y la recuperación)

4.	Gobernabilidad y Protección financiera, PF (que tiene que ver con la transferencia del riesgo y la institucionalidad).

Para cada política pública se proponen seis Indicadores de Gestión de Riesgo que caracterizan el desempeño de la gestión del riesgo en el país. Cada uno de estos indicadores tiene valores del 1 al 5 que determinan el grado de desempeño. Un experto debe indicar para cada caso cuál es su valor.
El valor del indicador total se obtiene del promedio de los indicadores de cada política.
En el documento Especificación de Requerimientos se detalla cada uno de los valores posibles de cada sub indicador.

3.1.7.	Requerimientos no funcionales

Software

El software, Framework, componentes y cualquier tipo de herramienta que se utilice en el desarrollo deben ser de código abierto y/o libre en su uso. Esto fue dicho en la entrevista a Virginia Fernández, el SINAE tiene como política utilizar solo software con estas características.
Arquitectura
La arquitectura debe ser extensible, es decir, que se requieran relativamente pocos cambios para lograr funcionalidades extras. Los usuarios podrán acceder al sistema desde cualquier punto del país por lo que este tendrá que estar accesible vía Internet.
Interfaces de usuario
Los usuarios del sistema están compuestos por los funcionarios del SINAE, por un lado los militares que trabajen con el SINAE en los aspectos operativos y por otro los funcionarios de los CECOED que son cargos políticos.
Existe una gran rotación de personal tanto a nivel militar como a nivel de los CECOED. Por lo que la interfaz de usuario tiene que ser simple, intuitiva y brindar ayuda a los usuarios dando definiciones de los términos y procesos. El estilo de presentación tiene que ser flexible, mantenible y de fácil cambio.
Seguridad de la información
Debido a lo delicado que es la información que el sistema maneja, se necesita resguardar y proteger la información buscando mantener la confidencialidad, la disponibilidad e Integridad de la misma.
Requerimientos de documentación
Se debe contar con un manual de instalación y un manual de usuario disponible desde el sistema para que los nuevos usuarios puedan aprender rápidamente las funciones pertinentes a su labor.

3.2.	Requerimientos específicos para el prototipo implementado

En este punto, si bien es deseable la implementación del 100 % de las funcionalidades, por temas de tiempo y de alcance del proyecto se seleccionaron un conjunto mínimo indispensable de funciones a implementar en el prototipo. A continuación se listan los requerimientos implementados en el prototipo.
Manejo de Usuarios: Se implementó altas, bajas y modificaciones de usuarios y perfiles de usuarios, además del sistema de seguridad.
Registro de Eventos: Se implementó altas, bajas y modificaciones de eventos.
Indicación de Desastre: Se implementó la funcionalidad que permite indicar que un evento se convirtió en desastre.

Gestión de Necesidades y Suministros

•	Puntos de entrada: Se implementó altas, bajas y modificaciones de puntos de entrada de suministros.
•	Puntos finales: Se implementó altas, bajas y modificaciones de puntos finales, donde se entregaran los suministros a los 	necesitados.
•	Suministros: Se implementó altas, bajas, modificaciones de tipos de suministros.
•	Clasificación de suministros: Se implementó altas, bajas, modificaciones de suministros.
•	Depósitos: Se implementó altas, bajas y modificaciones de depósitos, recepción de donaciones.
•	Puntos de Referencia: Se implementó altas bajas y modificaciones de puntos de referencia.
•	Ingreso de necesidades: Se implementó altas bajas y modificaciones de necesidades de suministros.
•	Gestión de necesidades: Se implementó toda la gestión referente a las solicitudes de suministros, no se implementó las solicitudes de compra.
Registro de propiedades siniestradas: Se implementó altas, baja, modificación de registros de propiedades siniestradas.
Costos: Se implementó altas, baja, modificación de costos y tipos de costos.
Calculo de indicadores: Se implementó el cálculo de los indicadores IDL e IGR. Se implementó funcionalidad para graficar cada indicador y estudiar su evolución, además se implemento funciones de análisis de los indicadores para permitir un estudio pormenorizado de las componentes del cálculo de los mismos.
Estado de desastre: Se implementó un reporte detallado que permite ver todos los datos asociados a un desastre, necesidades, solicitudes de envío y gastos.
A continuación presentamos un diagrama de casos de uso con los principales casos de uso del sistema:

4.	Diseño

En ésta sección se presenta las distintas visiones del diseño del sistema, arquitectura, diagrama de clases de diseño, base de datos, diagramas de colaboración y se documentan todas las decisiones tomadas.
4.1.	Consideraciones generales de diseño
Para el diseño de los distintos artefactos del software consideramos importante las propiedades no solo funcionales, sino también las propiedades inherentes al producto, como ser las sugeridas por los  criterios GRASP[38](38.md).
Las principales propiedades que son deseables dada la realidad relevada son las siguientes:

Usabilidad
El sistema debe ser de fácil uso por parte de usuarios inexpertos, todos los casos de uso deben ser similares, de forma que el usuario pueda intuir la forma de interactuar con el sistema. Los aspectos visuales y estéticos influyen en la confianza y la credibilidad del sistema.

Extensibilidad
El sistema debe ser extensible, esto quiere decir que fácilmente se podrá agregar nuevos módulos, reutilizando la mayor cantidad posible de la funcionalidad ya desarrollada. Esta propiedad es importante para el sistema ya que el prototipo implementado puede ser extendido en trabajos futuros.

Mantenibilidad
El sistema debe ser fácil de monitorear y de debugear, ya que son propiedades necesarias a la hora de solucionar problemas, debe tener bajo acoplamiento y alta cohesión en todos sus componentes, asegurando su fácil modificación y corrección.

Disponibilidad
Debido al uso distribuido del sistema en todo el país, es necesaria su alta disponibilidad desde los distintos centros de acción, por medio de un canal de comunicación, ya sea internet o una intranet. El sistema debe estar siempre en línea y accesible desde todo el país, ya que la gestión de un desastre se centraliza en la información que el sistema provee.

La aplicación debe contar con una mínima seguridad, pero no es el foco del problema, este requerimiento no condiciona la arquitectura, ni el despliegue de la aplicación, pero por temas de disponibilidad es deseable que se acceda por VPN [40](40.md), aunque no es un requisito indispensable. También es deseable comunicación HTTPS [41](41.md) para asegurar integridad de punta a punta y que los datos no sean interceptados o alterados en el medio de la comunicación.
En cuanto a confiabilidad, si bien es deseable un buen nivel de confiabilidad, no contamos con la descripción de los servidores utilizados para el despliegue de la aplicación, tampoco las condiciones y velocidades de las líneas de comunicación, ni un promedio de futuros usuarios concurrentes en el sistema. Por ello no podemos diseñar pruebas que aseguren una alta confiabilidad, pero si debe tener en cuenta no limitar el sistema de forma tal que sea inviable una alta confiabilidad.
En cuanto a eficiencia, consideramos que la aplicación se desplegará en uno o dos servidores a lo sumo y tomando en cuenta que el mayor uso de recursos que realizará el sistema será de memoria RAM y disco duro, no enfocaremos la solución a logro de  una mayor eficiencia en cuanto al uso de recursos debido que estos son recursos de bajo costo.

4.2.	Arquitectura

En esta sección se presenta un diagrama que describe la arquitectura en forma general y se describe cada capa.
Los usuarios están distribuidos en todo el país y existe una gran diversidad de software de base en los equipos que utilizan para conectarse al sistema. Por lo que un sistema web se ajusta a dichos requerimientos ya que con solo contar con un navegador web corriendo en cualquier plataforma se accede al sistema. De esta forma actualizar el sistema tiene un costo muy bajo, comparado con una solución de escritorio, que debe ser instalada en cada pc y desarrollada para las distintas plataformas.
Se descarta arquitectura en dos capas ya que o bien la lógica de negocio se acopla a la presentación o a la persistencia. Ambos casos violan los criterios generales de extensibilidad debido al alto acoplamiento y al de mantenibilidad por la baja cohesión. También el alto acoplamiento genera mayores costos de mantenimiento y nuevos desarrollos, por la baja reutilización de los componentes.
La arquitectura escogida es la clásica arquitectura en tres capas ya que cumple con las consideraciones generales de bajo acoplamiento y alta cohesión en sus componentes, de esta forma se crean componentes que se pueden reutilizar o sustituir con un bajo impacto en el resto del sistema. Las capas son, interface de usuarios web, lógica y persistencia, se agregaron dos capas más, la de dominio, que contiene todos los objetos que hacen referencia a entidades de la realidad del problema y una capa de datos puros, está última contiene básicamente Data Types [39](39.md).

Capa UI – User Interfase

Capa de presentación, la lógica de esta capa es totalmente de presentación, se encarga de exponer al usuario los componentes y textos para que pueda interactuar con el sistema.


Capa BL – Business Logic

Capa de negocio, encargada de gestionar las solicitudes de la capa de presentación y realizar las solicitudes correspondiente a la capa de persistencia. Está capa concentra todo el conocimiento del negocio.

Capa PL – Persistence Logic

Capa encargada de persistir los datos en la base de datos, se encarga de gestionar la relación entre los objetos y tablas de la base de datos, manteniendo independencia del motor de base de datos escogido.

Capa Domain

Capa encargada de modelar el dominio de la realidad planteada. Los objetos de dominio poseen comportamiento sobre las clases relacionadas.

Capa Data

Capa utilizada por las demás para transferir datos entre la lógica y la presentación, las clases de esta capa siguen el patrón Data Transfer Object [23](23.md), no poseen comportamiento.
Todos los objetos del dominio tienen su representante en esta capa, los objetos de dominio son accedidos por la persistencia y lógica de negocio, mientras que sus representantes en esta capa son accedidos por la lógica de negocio y la capa de presentación. Los objetos de dominio son procesados a nivel de capa lógica y representados en objetos de datos de la capa data. Los objetos de esta capa son todos serializables [43](43.md) ya que deben ser trasferidos desde el servidor web al navegador de los usuarios.

4.2.1.	Base de datos

El motor de base de datos escogido es relacional ya que de esa forma utilizamos un Framework llamado Hibernate [29](29.md) que permite de forma simple y transparente mantener la estructura de la base de datos, mapeando los objetos del dominio con la estructura necesaria para persistir los objetos. Solo se tiene que tener en cuenta a la hora de configurar dicho Framework que el resultado final del esquema de la base de datos esté en tercera forma normal [42](42.md).

4.2.2.	Despliegue de la aplicación

Diagrama de despliegue

La siguiente figura exhibe el despliegue de la aplicación en los servidores, mostrando los protocolos y canales de comunicación utilizados entre cada uno de los actores.



Usuarios

Los usuarios del sistema están compuestos por los funcionarios de los 19 gobiernos departamentales que pertenecen a los CECOED y/o colaboran en la atención a un desastre, los funcionarios del SINAE y los militares que apoyan en la operativa.

Comunicaciones

Las comunicaciones con los gobiernos departamentales deben soportarse mediante un enlace estable y rápido, puede ser un enlace punto a punto mediante VPN ya que son los usuarios más fuertes del sistema

Base de datos

Soporta toda la información relacionada al sistema y especialmente la gestión documental de imágenes, fotografías de las casas afectadas.

Alta disponibilidad

El sistema de motor de base de datos debe brindar una alta escalabilidad para ya que el sistema puede crecer mucho, por ejemplo si se comenzará a llevar información del estado de humedad del suelo en distintos puntos del país con reportes cada pocos segundos, la base de datos sería el cuello de botella si no pudiera escalar a una solución más amplia.
En esta misma línea el servidor web también debe poder escalar a una solución que soporte un gran número de usuarios concurrentes dado que por ejemplo en una futura versión, la población podría ingresar al sistema para realizar pedidos de ayuda, denunciar desaparecidos o buscar personas desaparecidas.

A continuación se exhibe un posible diagrama de despliegue de la aplicación en donde se a escalado a una solución que soporte mayores requerimientos.


Usuarios

Los usuarios están conformados por la población, por los Gobiernos Departamentales a través de los CECOED, SINAE y militares.
Cluster Web
La población es atendida por un cluster de servidores web y los usuarios más críticos que son los CECOED, SINAE y militares por otro cluster web.
De esta forma se tiene tolerancia ante fallos de uno de los servidores web pudiendo continuar online el otro y además se soporta un mayor número de usuarios concurrentes. Esto dependerá de la memoria RAM con la que cuenten los servidores web, la cantidad de núcleos de los procesadores y sus velocidades, la velocidad de acceso a disco para escritura de los logs de la aplicación y los canales de comunicación.
Cluster Base de Datos
Para mantener una alta disponibilidad, se plantea un cluster a nivel del motor de la base de datos  para soportar mayor demanda y a la vez tener tolerancia a fallos de uno de los servidores de base de datos.
Base de Datos de Respaldo
Es conveniente tener una base de datos idéntica a la de producción en todo momento ya que esto permite respaldar toda la información en todo momento y además en caso de que algo le suceda al storage que soporta la base de datos principal, se puede simplemente pasar a trabajar con la de respaldo hasta que se arregle la principal.

4.3.	Modelo de dominio

En esta sección se presenta una descripción de las principales entidades de dominio.
Usuario: Representa a los usuarios del sistema.
Perfil: Conjunto de permisos.
Permiso: Clave de acceso a funcionalidad en el sistema.
PuntoReferencia: Lugares físicos importantes por su función en la gestión de desastres.
Evento: Agrupa toda la información asociada al registro de un evento.
TipoEvento: Los eventos son de distinta naturaleza, esta clase representa los distintos tipos de eventos que pueden ocurrir.
Desastre: Esta clase registra el momento en el que un evento es declarado como desastre y es utilizada para asociar información del desastre en distintos puntos del sistema.
Donación: Agrupa la colección de suministros donados y los datos de donante, fecha y demás.
Suministro: Simboliza un suministro donado o comprado, agrupa la información de vencimiento, refrigeración, cantidad donada o comprada, etc.
TipoSuministro: Representa los distintos tipos de suministros como ser, frazadas, aspirinas, etc.
Depósito: Representación lógica del lugar físico donde se guardan los suministros donados o comprados.
CuentaCorrienteSuministro: Asocia un depósito con un tipo de suministro y lleva la cantidad total disponible.
Parcela: Representa una propiedad siniestrada.
Foto: Entidad que posee la información de una foto de una propiedad siniestrada.
TipoParcela: Las propiedades tienen diferentes usos, está clase simboliza si la propiedad es un galpón, un depósito, una casa, etc.
DatosVivienda: Entidad que agrupa la información del estado de la vivienda, materiales utilizados en la construcción, si tiene saneamiento, etc.
Unidad: Una parcela cuanta con muchas unidades individuales para las cuales se registra distinta información, agrupa los datos de nivel del agua, metros cuadrados afectados, etc.
ProblemasVivienda: Agrupa toda la información sobre los problemas de la vivienda, como ser grietas en las paredes, humedades, etc.
Hacinamiento: Entidad que asocia a la parcela a la información de cuantas personas familias viven en la casa, cuantos dormitorios tienen para dormir, si la casa se utiliza o no para trabajar, etc.
Inundación: Contiene información del estado de inundación de la propiedad, información histórica sobre otros desastres de inundaciones.
Necesidad: Representa una necesidad que puede ser cubierta localmente o con recursos del SINAE, lleva la información de los tipos de suministros y cantidades necesarias, lugar en donde se necesitan, etc.
GestionNecesidad: Entidad que se utiliza para agrupar información de la gestión realizada para atender una necesidad.
SolicitudEnvio: Cuando se decide cubrir una necesidad con recursos de los depósitos se generan solicitudes de envío a nombre de los depósitos para que los encargados envíen los suministros a los puntos de entrega, esta entidad lleva registro de la información pertinente.
A continuación se exhibe el diagrama UML [24](24.md) de las entidades del dominio por cada modulo, se separó en módulos por temas de visualización de los diagramas.

4.4.	Módulos

Las clases del diseño fueron agrupadas en módulos y en diagramas de clases de diseño, de tal forma que pueden ser fácilmente manejables y sea más fácil su visibilidad, también es importante la asignación en módulos coherentes para asignar responsabilidades como controladores de operaciones. Se separaron en los siguientes módulos:

Registro

Este módulo agrupa los requerimientos de registros de todo tipo, en nuestro caso el registro de eventos, en trabajos furos se podrá extender el módulo con nuevos registros, por ejemplo registrar  niveles del agua en ríos.

Desastres

Módulo encargado de los requerimientos sobre desastres, en nuestro caso abarca los requerimientos de consultas del estado del desastre, costos asociados al mismo y la declaración de desastre (proceso por el cual se indica que un evento es considerado como desastre). En futuros trabajos se podrá extender el módulo con  nuevos requerimientos como monitoreo de incendios o de inundaciones.

Puntos de referencia

Los puntos de referencia se modelaron en un módulo por separado pensando en trabajos futuros como la realización de un mapa de riesgos donde se resalte en distintas capas los puntos importante junto con sus ubicaciones en el país, además de manejar características propias del punto de referencia.


Registro de propiedades siniestradas.

Debido a las dimensiones de la información relacionada con  el registro de propiedades siniestradas y que contar dicho registro fue un requerimiento explicito aportado por el SINAE, decidimos que esté en un módulo dedicado al requerimiento especifico, ya que se manejó como posible que el SINAE lo utilizará en el corto plazo y se deberá ajustar a la visión refinada que este aporte.


Necesidades

El módulo de necesidades abarca desde el ingreso de necesidades al sistema hasta la gestión de dichas necesidades, se agruparon en este módulo por el fuerte relacionamiento entre sus entidades, en nuestro caso se contempló solo las necesidades de suministros. Puede ser extendido en trabajos futuros con solicitudes de personal capacitado en distintas disciplinas, dinero o cualquier otro tipo de necesidad y extender a consecuencia la gestión que se realiza para cubrir dichas necesidades.

Depósitos

El módulo de depósitos agrupa los requerimientos asociados con la gestión de suministros, esto va desde el ingreso al sistema por los puntos de entrada, la asignación a depósitos, la confirmación del ingreso de suministros al depósito y toda la gestión de solicitudes de envío de suministros a los puntos finales. Puede ser extendido en futuros trabajos agregando por ejemplo mayor control de stock, funcionalidades de ajustes de stock, recepción de compras, entre otros.

Seguridad

Módulo encargado de gestionar la seguridad, tiene como responsabilidad el manejo de usuarios, perfiles y permisos asociados a acciones en el sistema, los demás módulos consultan a este antes de permitir a un usuario realizar una operación.

Calculo de indicadores

La responsabilidad de este módulo es agrupar y gestionar todo lo referente al cálculo de indicadores que sirvan a la toma de decisiones, en nuestro caso solo abarca dos indicadores de los cuatro desarrollados por el BID e IDEAS llamados IDL e IGR. En futuros trabajos se podría extender el módulo con el cálculo de los dos indicadores restantes y algún otro que se considere importante.

Generales

Este módulo agrupa los pequeños conjuntos de datos que por sus dimensiones y posibilidades de extensión no justifican la creación de un módulo dedicado. En nuestro caso asignamos el manejo de ciudades y departamentos a este módulo.

A modo de ejemplo a continuación se presenta el diagrama de clases de diseño del modulo de necesidades, el resto de los módulos se pude consultar en el documento diseño.


Como vimos en los requerimientos, dentro de los principales casos de uso se encuentra el alta de necesidades, dicho caso de uso es tomado para ejemplificar todas las colaboraciones del sistema. Se siguieron estándares y patrones de diseño como Singleton [45](45.md), Data Transfer Object [44](44.md), Object Data Access [35](35.md), Factory [46](46.md), entre otros, que ayudaron a que las colaboraciones del sistema sean todas similares.

Diagrama de colaboración para el caso de uso alta de necesidad
Para el caso de uso alta de una necesidad es necesario contar con una operación NuevaNecesidad, a continuación se muestra el diagrama de colaboración para esta operación.


El EntryPointNecesidades es un componente JavaScript [37](37.md) perteneciente a la capa de presentación,  corre en el navegador del usuario, es quien recibe la solicitud de nueva necesidad. Luego se comunica por HTTP con la clase NecesidadImpl que es la responsable de comunicarse con los servicios de negocio, esta accede a la fábrica de servicios que sigue el patrón Singleton y luego le solicita que cree la necesidad pasando NecesidadDTO(sigue el patrón Data Transfer Object, clase serializable que pertenece a la capa Data) con la información necesaria para realizar la operación. El servicio de negocio NecesidadService, perteneciente a la capa de negocio, crea la necesidad pasando NecesidadDTO y el constructor de la clase Necesidad es el encargado de traducir la información alojada en NecesidadDTO a sus propios atributos privados. Luego el servicio de negocio se comunica con la capa de persistencia, accede a la clase NecesidadDAO(sigue el patrón Object Data Access y Singleton) y le solicita que persista la necesidad. NecesidadDAO solicita al Framework Hibernate que guarde en la base de datos toda la información asociada a la nueva necesidad.

5.	Implementación y testing.
En esta sección se describen las herramientas utilizadas y testeos realizados. En el Anexo 1, se encuentran los patrones, estándares, procedimientos y planificación seguida.

5.1.	Herramientas

5.1.1.	Propósito

En esta sección se presentan todas las herramientas que se utilizaron para el desarrollo de la aplicación. Dentro de los principales motivos que intervinieron en la decisión sobre que herramientas escoger, está la necesidad de utilizar herramientas de Software Libre dado que el SINAE solo utiliza estas herramientas. Por otra parte se consideraron herramientas ampliamente aceptadas y utilizadas por la comunidad de desarrolladores y por último se tuvo en cuenta la experiencia con la que cuenta el grupo en cada herramienta.

5.1.2.	Lenguaje de programación – Java

Para el desarrollo se decidió utilizar el lenguaje Java ya que para el mismo existen muchas herramientas, frameworks, etc, desarrolladas con licencias de código abierto o de libre uso. Otro punto determinante en la elección del lenguaje de programación fue el conocimiento y experiencia de los dos integrantes del grupo en este lenguaje.[25](25.md)

5.1.3.	Entorno de desarrollo - Eclipse 3.7 Indigo

El entorno de desarrollo (IDE) escogido es el Eclipse 3.7 Indigo, el IDE es de libre uso y está ampliamente aceptado por la comunidad de programadores Java. Principalmente se decidió utilizar este IDE por ser uno de los más conocidos por los integrantes del grupo para el desarrollo con Java, la versión del mismo se eligió tomando en cuenta el pug-in existente para GWT y porque es la última versión del IDE. [26](26.md)

5.1.4.	Desarrollo de interfase de usuarios – GWT

Para el desarrollo de la interfase de usuarios web, se escogió el framework desarrollado por Google, Google Web ToolKit. Este framework permite desarrollar páginas que hacen uso de de la tecnología AJAX en una forma transparente y simple. Básicamente se desarrolla en Java y GWT provee un compilador que traduce las clases Java a código JavaScript que se ejecuta en el navegador del cliente y hace llamadas asincrónicas a los servicios implementados como Servlets de java. Además se cuenta con un plug-in para Eclipse que facilita el desarrollo, depuración y ejecución de las aplicaciones que utilizan GWT. El código logrado con este sistema es muy simple de mantener y entender, hace que el desarrollo de las interfases web sea simple y no hace falta conocer javascript, para incorporar un nuevo desarrollador al equipo, solo tiene como requerimiento que este sepa JAVA y esté familiarizado con Eclipse. Si bien el grupo no conoce GWT considera que es una muy buena herramienta de punta y que es una buena oportunidad para aprender a utilizarla.[27](27.md)

5.1.5.	Servicios de negocio - Spring Business Service

Para el desarrollo de los servicios de negocio se utilizó una herramienta brindada por Spring, ésta permite desarrollar servicios de negocio que siguen el patrón Singleton por lo que son instanciados un única vez. Además está integrado con Hibernate y provee una clase llamada Hibernate Transaction Manager que brinda transnacionalidad (a nivel de base de datos) a los métodos de los servicios de negocio, utilizando Hibernate como framework de persistencia. [28](28.md)

5.1.6.	Persistencia – Hibernate

La persistencia de la aplicación se desarrolló utilizando el framework de persistencia Hibernate 3.0.[29](29.md) Este framework permite relacionar de forma muy simple los objetos del dominio con las tablas de la base de datos respetando el diseño de los objetos, permite hacer consultas fáciles de mantener y provee independencia de la base de datos, por lo que es posible cambiando su configuración utilizar otra base de datos.
Provee un lenguaje de consulta llamado HSQL que asegura independencia en la forma en que se forman las consultas para los distintos motores de base de datos. También provee una funcionalidad muy útil para agilizar el desarrollo, que es el mantenimiento automático del esquema de la base de datos.

5.1.7.	Reportes – Jasper

Jasper es una herramienta que permite desarrollar de forma rápida reportes y presentarlos en distintos formatos de forma fácil. Jasper también cuenta con un diseñador de reportes IReports el cual se utilizará en su versión 4.1.1 que es la última publicada. Se decidió utilizar esta herramienta porque ya cuenta con muchos años de desarrollo por lo que es muy estable y tiene una fuerte integración con java, además los integrantes del grupo ya poseen experiencia en el uso de la misma.[30](30.md)

5.1.8.	Control de versiones – Subversion

La herramienta elegida para el control de versiones del código fuente y de todos los documentos del proyecto es SVN – Subversion. Se creó un sitio en googlecode http://satode.googlecode.com/svn/trunk en donde se versionan todos los documentos no solo el código fuente. El cliente que se escogió es el TortoiseSVN 1.7.1, es uno de los clientes SVN más difundidos de libre uso y además el grupo ya cuenta con experiencia en su uso. [31](31.md)[32](32.md)

5.1.9.	Base de datos - MySQL

El motor de base de datos escogido es MySQL Server 5.1.50. Este motor de base de datos es de libre uso, ampliamente aceptado y utilizado por la comunidad de desarrolladores. La versión se escogió porque uno de los integrantes del grupo la utilizó en un proyecto de características similares y respondió muy bien. [33](33.md)

5.2.	Tecnología aplicada a la arquitectura

En la presente sección se exhibe un diagrama de la arquitectura de la aplicación en donde se expone para cada capa las tecnologías de software que serán utilizadas, luego se explica brevemente cada capa.

Capa UI – User Interfase

HTML, JSP: Páginas web HTML y Java Server Page
Jasper: Reportes Jasper, en formatos pdf, rtf, doc, xlsl y html.
GWT: Se encarga de inicializar los componentes de las páginas, escuchar los eventos de las páginas y hacer las solicitudes a la capa de negocio.

Capa BL – Business Logic

Spring Business Service: Servicios de negocio que siguen el patrón Singleton para asegurar una única instancia del servicio a nivel de toda la aplicación. Controlan las transacciones de base de datos de las operaciones.

Capa PL – Persistence Logic

Hibernate: Framework de persistencia, realiza las actualizaciones, consultas, inserciones, etc, en la base de datos.

5.3.	Testing

En esta subsección se detalla el Testing realizado al prototipo.


Testing de desarrollo.
A medida que un programador completaba un módulo, éste le realizaba pruebas para verificar que su funcionamiento sería el correcto y que cumpliera la especificación de requerimientos.
Testing de integración.
Luego de completar todo el desarrollo, se realizó Testing a todos los módulos comprobando que la comunicación e interacción entre ellos era la correcta. Aquí se probaron el 100% de las funcionalidades en los navegadores Internet Explorer 8, Firefox 11.0, Google Chrome 17.0.963.79 y se armó una lista con todos los defectos encontrados y posteriormente se corrigieron.
Testing de stress
Si bien es deseable e importante para un sistema web de estas características realizar pruebas de stress, no contamos con los recursos necesarios para realizarlas. Si bien se podrían realizar programas de testing automáticos que se comuniquen con los servicios de negocio, no se realizaron.

5.4.	Prototipo implementado.

En esta sección se presentan las principales pantallas del prototipo implementado.
Login del sistema
Pantalla inicial en la que se indica usuario y contraseña.


Pantalla inicial

Luego de realizar la identificación de usuario se despliega la pantalla de inicio.


Mantenimiento de depósitos

Los mantenimientos son todos similares, a continuación se ve la pantalla donde se despliegan los depósitos existentes, pudiendo hacer altas, bajas y modificaciones.


Estado desastre

Reporte que exhibe el estado de la gestión de un determinado desastre, mostrando las necesidades, solicitudes de suministros y gastos.


Calculo de Indicadores

En la siguiente pantalla se puede analizar las componentes del cálculo del IDL, se ve el grado de participación de cada departamento.


En la siguiente pantalla se ve la evolución del cálculo del IGR.


6.	Resultados obtenidos

En esta sección se describen los resultados obtenidos en el trascurso del proyecto. Estos se agruparon en investigación, definición de requerimientos, prototipo alcanzado y experiencia en la aplicación de ingeniería de software.
Investigación
Principalmente se logró analizar el contexto local por medio de una extensa documentación extraída del SINAE, de la entrevista realizada a ellos y de información provista por los tutores.
Se dejó plasmado en el documento estado del arte, las características principales de la gestión de desastres en el Uruguay y se puede visualizar las carencias y la falta de una gestión científica basada en indicadores.
En lo que respecta al ámbito internacional, se dejan planteados los puntos más importantes sobre la gestión de riesgo de desastres.
Se destaca principalmente el análisis realizado a los diferentes indicadores desarrollados por el BID en conjunto con IDEAS.
También en el ámbito internacional, se deja un análisis de las herramientas de software utilizadas en los últimos años para la atención de los desastres.
Definición de requerimientos
Como principal resultado, se obtuvo una amplia especificación de requerimientos para un producto de software, que brinde ayuda a la toma de decisiones en la gestión de riesgo de desastres y principalmente que brinde apoyo a las operaciones actuales del SINAE sumando herramientas para mejorar la gestión que realiza.
Prototipo
El prototipo alcanzado cubre aproximadamente un 80% de los requerimientos relevados, éste es funcional y la gran mayoría de sus operaciones son de carácter final. Si bien faltan funcionalidades, se cree que éste puede ser puesto en producción para uso por parte del SINAE.
Dentro de las decisiones tomadas, en cuanto a las herramientas utilizadas en la implementación del prototipo, se decidió utilizar GWT que es una herramienta de última generación y que era desconocida para el grupo, esta decisión implicó aceptar el riesgo en cuanto a la pérdida de productividad, pero comprobamos que la productividad fue aceptable y que los resultados son muy buenos.
Experiencia en la aplicación de ingeniería de software
Se destaca como un positivo, la experiencia generada en el equipo al aplicar los conocimientos adquiridos en el trascurso de la carrera para realizar el proyecto.

•	Planificación y gestión de proyectos.
•	Aplicación de estándares y patrones.
•	Generación de documentación estándar para la creación de software.


8.	Trabajos Futuros

Describimos a continuación los trabajos futuros que creemos necesarios para extender el prototipo realizado.
Extensión del prototipo con los requerimientos relevados
En el análisis del estado del arte se relevó la existencia de 4 indicadores desarrollados por el BID – IDEAS, Índice de Desastres Locales , Índice de Vulnerabilidad Prevalente , Índice de Déficit por Desastre , Índice de Gestión de Riesgo de los cuales en el prototipo fueron implementados solo los indicadores Índice de Gestión de Riesgo e Índice de Desastres Locales. Se deberían implementar los dos restantes para completar una visión integral del riesgo, una visión económica y otra social.
Otro punto analizado, pero que no ha sido implementado, fue el proceso de compra de suministros cuando no existe stock en los depósitos.
En la gestión de necesidades, solo se implementó la gestión de suministros, sin atenderse la gestión de otras necesidades como ser, ayuda psicológica, personal calificado en distintas áreas, medicina, construcción entre otras.
Faltaría también, el registro del personal y sus roles en la gestión de un desastre, esto es relevante a la hora de enfrentarse a un desastre con características similares, para poder consultar a las personas que ya tiene experiencia.
Otro punto no implementado es la seguridad de las acciones sobre los datos. Una persona con permisos para confirmar solicitudes de envío, podría hacerlo desde otro departamento. Además del sistema de permisos el SATODE debería contar con un perfil de datos asociados a los usuarios del sistema, de esta forma filtrar información no pertinente al usuario y no permitir inferir en los datos de otros usuarios.
Información sociocultural
Hace falta un registro del estado sociocultural de los distintos sectores de la población, que esté integrada a la información provista por los censos nacionales y que cuente con herramientas de análisis de fragilidad y vulnerabilidad de la sociedad. Dicho registro podría basar los datos a relevar en la información necesaria para calcular el indicador Índice de Vulnerabilidad Prevalente (IVP) descripto en el documento Estado del arte sección 5.3.
En general el IVP refleja susceptibilidad por el grado de exposición física de bienes y personas, lo que favorece el impacto directo. Igualmente, refleja condiciones de fragilidad social y económica que favorecen el impacto indirecto e intangible. También, refleja falta de capacidad para absorber las consecuencias, responder eficientemente y recuperarse. La reducción de este tipo de factores, objeto de un proceso de desarrollo humano sostenible y de políticas explícitas de reducción de riesgo es uno de los aspectos en los cuales debería ponerse especial énfasis.

Mapa de riesgos

En la atención de un desastre, se debe gestionar toda la logística necesaria para el apoyo inmediato y urgente de la población. Por lo que es conveniente contar con un mapa de riesgos, que exhiba información de la ubicación de los puntos destacables y relevantes, como ser:

•	Zonas Inundables
•	Zonas no habitables
•	Zonas con riesgo de incendio
•	Ubicación de centros policiales
•	Ubicación de centros militares
•	Ubicación de hospitales
•	Ubicación de camineras
•	Ubicación de refugios
•	Ubicación de bomberos

En la definición de requerimientos y en el prototipo se incluyó la entidad punto de referencia que puede ser usada para este fin.

Inundaciones

En un trabajo futuro se podrían abordar puntualmente las inundaciones, uno de los principales problemas medioambientales que sufre nuestro país.
Distintos organismos estatales como UTE y OSE poseen información online del estado de creciente y altura de los ríos, dicha información podría ser integrada al sistema SATODE para poder monitorear las amenazas de inundación, monitorear la inundación y generar alarmas a la población. Está información puede estar integrada al mapa de riesgo donde se vean las zonas posiblemente inundadas en las próximas horas. El sistema contando con dicha información, podría ser capaz de generar alarmas según parámetros establecidos, como por ejemplo nivel máximo del río o velocidad de creciente máxima.

Sequías

Se podría integrar al sistema SATODE información sobre el estado de infección de las aguas, de los niveles de los ríos y arroyos, niveles de humedad de los campos y brindar apoyo logístico en la distribución de agua y alimentos para el ganado, entre otros.
Incendios
Virginia Fernández encargada del área de información del SINAE, con quien tuvimos una entrevista, nos comentó que en Facultad de Ciencias, participa de un proyecto que busca analizar imágenes satelitales para determinar zonas de riesgo de incendio.
> Por otra para ANTEL, en conjunto con la Facultad de Ingeniería, está llevando adelante un proyecto para tomar imágenes satelitales desde un satélite propio de ANTEL que será lanzando, según lo previsto en el año 2013. Se podrían integrar ambas soluciones al sistema SATODE para generar alarmas a las autoridades pertinentes y brindar herramientas de apoyo a la prevención de incendios.

Alarmas y notificaciones

Otro punto que no fue desarrollado pero que se podría implementar, es la posibilidad de contar con alarmas en el sistema SATODE en lo referente a la gestión de desastres. Se podría activar alarmas en los siguientes casos:

•	Si un determinado punto de referencia tiene pendientes más de 15 solicitudes sin ser gestionadas.
•	Si existen solicitudes de envío ya enviada al punto de entrega hace más de una semana y no se cuenta con la confirmación de la recepción.
•	Si un determinado suministro llega a un determinado estado de stock.
•	Si existen una cantidad considerable de suministros con fecha de vencimiento en la brevedad.

9.	Referencias bibliográficas

[1](1.md)	Federación Internacional de Sociedades de la Cruz Roja y de la Media Luna Roja; Terremoto de Haití 2010 Informe de avance de dos años; http://www.ifrc.org/Global/Publications/disasters/1211100-Haiti-earthquake-2-years-report_SP.pdf; Diciembre 2011; Último acceso: 24/03/2012
[2](2.md)	Wikipedia; Terremoto y Tsunami Japón de 2011; http://es.wikipedia.org/wiki/Terremoto_y_tsunami_de_Jap%C3%B3n_de_2011; Último acceso 24/03/2012
[3](3.md)	Presidencia de la República, PNUD; Del Desastre a la Oportunidad; Diciembre 2008;  (ISBN 978-9974-7565-9-5)
[4](4.md)	Sistema Nacional de Emergencia; http://www.sinae.gub.uy/index.php?option=com_content&view=article&id=135&Itemid=43; Último acceso: 07/05/2011
[5](5.md)	Senado y Cámara de Representantes de la República Oriental del Uruguay; Sistema Nacional de Emergencias. Creación como sistema público de carácter permanente. Ley 18621; http://www0.parlamento.gub.uy/leyes/AccesoTextoLey.asp?Ley=18621&Anchor; Noviembre 2009; Último acceso: 30/04/2011
[6](6.md)	Banco Interamericado de Desarrollo; http://www.iadb.org/es/acerca-del-bid/acerca-del-banco-interamericano-de-desarrollo,5995.html; Último acceso: 12/04/2011
[7](7.md)	Universidad Nacional de Colombia, Sede Manizales; http://idea.unalmzl.edu.co/; Último acceso: 13/05/2011
[8](8.md)	Instituto de estudios ambientales, Universidad Nacional de Colombia Sede Manizales, Banco Interamericano de Desarrollo; Informe Técnico principal sobre Indicadores de gestión de riesgos; http://www.manizales.unal.edu.co/ProyectosEspeciales/bid2/documentos/InformeTecnicoPrincipalIDEA.pdf; Agosto 2005; Último acceso: 13/05/2011
[9](9.md)	Conferencia Mundial sobre la Reducción de los Desastres Naturales; http://www.un.org/spanish/conferences/wcdr/2005/; Último acceso: 23/04/2012
[10](10.md)	Sahana; http://sahanafoundation.org/; Último acceso: 23/05/2011
[11](11.md)	SUMA; http://www.disaster-info.net/SUMA/spanish/que_es_suma.htm; Último acceso: 04/06/2011
[12](12.md)	DesInventar; http://www.desinventar.org/; Último acceso: 02/06/2011
[13](13.md)	CEPAL ; Manual para la evaluación del impacto socioeconómico y ambiental de los desastres; http://www.eclac.org/cgi-bin/getProd.asp?xml=/publicaciones/xml/7/12707/P12707.xml&xsl=/mexico/tpl/p9f.xsl&base=/desastres/tpl/top-bottom.xsl; Julio 2003, pp. 5.
[14](14.md)	Carlos Ospital, Mónica Hobert, Alicia Saab, Adrián Rosolen; La gestión del riesgo en la prevención de emergencias por catástrofes ambientales; http://www.sgp.gov.ar/contenidos/ag/paginas/opp/docs/2007/47_OPP_2007_EMERGENCIAS.pdf; Agosto 2007; Último acceso: 15/04/2011
[15](15.md)	Alvaro Soldano; Conceptos sobre Riesgo; http://www.rimd.org/advf/documentos/4921a2bfbe57f2.37678682.pdf; Marzo 2009; Último acceso: 23/04/2012
[16](16.md)	Capacity Building in Asia using Information Technology Applications; Disaster Managment, Module 4; http://www.adpc.net/casita/course-materials/Mod-4-Disaster-Mgmt.pdf; Último acceso:13/04/2011
[17](17.md)	Sandro Moscatelli, Omar Viera, Libertad Tansini; Reporte Técnico RT 09-08. Disaster management and operation research in Uruguay; http://www.fing.edu.uy/inco/pedeciba/bibliote/reptec/TR0908.pdf; Mayo 2009, Último acceso: 25/04/2012
[18](18.md)	Estrategia Internacional para la Reducción de Desastres; Marco de Acción de Hyogo 2005-2015: Aumento de la resiliencia de las naciones y las comunidades ante los desastres. Extracto del informe de la Conferencia Mundial sobre la Reducción de los Desastres A/CONF.206/6; http://www.unisdr.org/eng/hfa/docs/Hyogo-framework-for-action-spanish.pdf; Enero 2005; Último acceso: 11/06/2011
[19](19.md)	Omar Darío Cardona; Indicadores de Riesgo de Desastre y Gestión de Riesgos. Programa para América Latina y el Caribe : Informe resumido; http://idea.unalmzl.edu.co; 2007; Ultimo acceso: 13/05/2011
[20](20.md)	Sahana; http://sahanafoundation.org; Último acceso: 23/05/2011
[21](21.md)	DesInventar; http://www.desinventar.org/ ; Último acceso: 02/06/2011
[22](22.md)	SUMA; http://www.disaster-info.net/SUMA/spanish/que_es_suma.htm; Último acceso: 04/06/2011
[23](23.md)	Core J2EE Patterns – Transfer Object; http://java.sun.com/blueprints/corej2eepatterns/Patterns/TransferObject.html; Último acceso: 08/04/2012
[24](24.md)	Unified Modeling Language; http://www.uml.org/; Último acceso: 08/04/2012
[25](25.md)	JAVA; http://www.oracle.com/technetwork/java/index.html; Último acceso: 24/09/11
[26](26.md)	Eclipse 3.7 Indigo; http://eclipse.org/indigo/; Último acceso: 27/09/11
[27](27.md)	GWT – Google Web Toolkit; http://code.google.com/intl/es-ES/webtoolkit/; Último acceso: 30/09/11
[28](28.md)	Spring Services – Hibernate; http://static.springsource.org/spring/docs/3.0.x/spring-framework-reference/html/orm.html; Último cceso: 30/09/11
[29](29.md)	Hibernate 3.0; http://www.hibernate.org/; Último Acceso: 30/09/11
[30](30.md)	JasperSoft; http://jasperforge.org/projects/jasperreports; Último Acceso: 03/10/11
[31](31.md)	Subversion; http://es.wikipedia.org/wiki/Subversion; Último Acceso: 03/10/11
[32](32.md)	Tortoise SVN; http://tortoisesvn.tigris.org/; Último Acceso: 05/10/11
[33](33.md)	MySQL; http://www.mysql.com/; Último Acceso: 18/11/11
[34](34.md)	Rich Client; http://es.wikipedia.org/wiki/Cliente_pesado; Último acceso: 08/04/2012
[35](35.md)	Data Access Object; http://java.sun.com/blueprints/corej2eepatterns/Patterns/DataAccessObject.html; Último Acceso: 08/04/2012
[36](36.md)	Camel Case; http://msdn.microsoft.com/en-us/library/x2dbyw72%28v=vs.71%29.aspx; Último acceso: 08/04/2012
[37](37.md)	JavaScript; http://www.w3schools.com/js/js_intro.asp; Último acceso: 08/04/2012
[38](38.md)	Crai Larman; UML y PATRONES. Introducción al análisis y diseño orientado a objetos; PRENTICE HALL;1999;pp 185 al 215 (ISBN 970-17-0261-1)
[39](39.md)	Programación 4. Conceptos básicos de orientación a objetos(parte 1 ); http://www.fing.edu.uy/inco/cursos/prog4/field.php/Material/Teorico?action=download&upname=03-conceptos_basicos_1era_parte.pdf; Último acceso : 27/04/2012
[40](40.md)	Servicios Informáticos. Universidad de Valencia; Red privada virtual; http://www.uv.es/siuv/cas/zxarxa/vpn.htm; Último acceso: 27/04/2012
[41](41.md)	Internetlab; ¿Qué significa el titulo https y como funciona?; http://www.internetlab.es/post/888/que-significa-el-protocolo-https-y-como-funciona/; Último acceso: 27/04/2012
[42](42.md)	Fundamentos de base de datos. Tema 4 - Diseño relacional; http://www.fing.edu.uy/inco/cursos/bdatos/teorico/7-Normalizacion.pdf; Último acceso: 27/04/2012
[43](43.md)	CAPÍTULO II – SERIALIZACIÓN: PERSISTENCIA DE DATOS EN JAVA; http://catarina.udlap.mx/u_dl_a/tales/documentos/lis/montero_g_g/capitulo2.pdf; Último acceso: 27/04/2012
[44](44.md)	 Data Transfer Object; http://msdn.microsoft.com/en-us/library/ff649585.aspx; Último acceso: 27/04/2012
[45](45.md)	El patrón Singleton, http://msdn.microsoft.com/es-es/library/bb972272.aspx#EDAA; Último acceso: 27/04/2012
[46](46.md)	Exploring the Factory Design Pattern; http://msdn.microsoft.com/en-us/library/ee817667.aspx; Último acceso: 27/04/2012


10.	Anexos

10.1.	Planificación

Luego del análisis de requerimientos se procedió a realizar el plan de desarrollo del prototipo, donde se definió los puntos a desarrollar cada semana por cada programador. Se tomó en cuenta, que primero se tenían que desarrollar los módulos que no dependían de otros y luego los que dependían de los anteriores y así hasta completar todos los módulos. En la asignación de horas de programación, se consideró que cada programador se encargara por completo de un modulo, para no tener conflictos en el desarrollo. Como plan de mitigación de atrasos se decidió, que si se encontraba que el desarrollo estaba atrasado una semana o más, la siguiente semana se dedicaban más horas que las planificadas para ponerse al día, solo en dos ocasiones se registró dicho caso.

10.2.	Patrones y estándares

Se definió al comienzo de la implementación los estándares y patrones a seguir. Para los nombres en todos los casos se utilizo el estándar de nomenclatura Camel Case [36](36.md).
A continuación se listan en detalle cada uno de los estándares y patrones.

Data Access Object (DAO)

Los Data Access Object [35](35.md) son los objetos encargados de la persistencia de una entidad del dominio, cada uno se encarga de implementar los métodos necesarios para persistir o recuperar una determinada entidad del dominio. Por cada entidad de dominio persistible existe un DAO y estos siguen el patrón Singleton. La nomenclatura utilizada para nombrarlos sigue el patrón: nombre de entidad + DAO (Ejemplo: CiudadDAO)
Para los métodos más comunes como nuevo, modificar, eliminar, buscar todos y buscar según un filtro se siguen los siguientes patrones:
•	nuevo + nombre de la entidad, método encargado de persistir el nuevo objeto en la base de datos.
•	modificar + nombre de la entidad, método encargado de modificar el objeto en al base de datos.
•	eliminar + nombre de la entidad, método encargado de eliminar el objeto de la base de datos.
•	lista + nombre de la entidad, método encargado de extraer de la base de datos la totalidad de registro de la entidad.
•	buscar + nombre de entidad, método encargado de la extracción de los registros asociados a una entidad, que cumplan una determinada condición de filtro.

Servicios de negocio

Los servicios de negocio son los encargados de proveer funcionalidad a la presentación de un determinado módulo, se utilizan para bajar el acoplamiento del sistema. Estos también son encargados de pasar los objetos de dominio a data transfer object (DTO). Todos los servicios de negocio son accedidos a través de una Factory y siguen el patrón Singleton. Solo los servicios de presentación de su modulo acceden a ellos y también prestan funcionalidad a los demás servicios de negocio. De esta forma se reutiliza el código y el conocimiento, se hace más simple el mantenimiento y la legibilidad de los mismos. La nomenclatura utilizada para nombrarlos sigue el siguiente patrón: nombre de entidad principal + Service (Ejemplo: DepositoService).
Para los métodos más comunes como nuevo, modificar, eliminar, buscar todos y buscar según un filtro se siguen los siguientes patrones:
•	nuevo + nombre de la entidad, método encargado de solicitar al correspondiente DAO persistir el nuevo objeto en la base de datos.
•	modificar + nombre de la entidad, método encargado de solicitar al correspondiente DAO modificar el objeto en al base de datos.
•	eliminar + nombre de la entidad, método encargado de solicitar al correspondiente DAO eliminar el objeto de la base de datos.
•	lista + nombre de la entidad, método encargado de solicitar al correspondiente DAO extraer de la base de datos la totalidad de registro de la entidad.
•	buscar + nombre de entidad, método encargado de solicitar al correspondiente DAO la extracción de los registros asociados a una entidad que cumplan una determinada condición de filtro.

Servicios de presentación

Los servicios de presentación son los encargados de proveer acceso a los servicios de negocio. Estos solo son accedidos desde los Rich Client Application [34](34.md). Pertenecen a un modulo y solo utilizan los servicios de negocio de dicho modulo. La nomenclatura utilizada para nombrarlos sigue el siguiente patrón: nombre de entidad principal + Impl (Ejemplo: DepositoImpl).
Para los métodos más comunes como nuevo, modificar, eliminar, buscar todos y buscar según un filtro se siguen los siguientes patrones:
•	nuevo + nombre de la entidad, método encargado de solicitar al correspondiente servicio de negocio persistir el nuevo objeto en la base de datos.
•	modificar + nombre de la entidad, método encargado de solicitar al correspondiente servicio de negocio modificar el objeto en al base de datos.
•	eliminar + nombre de la entidad, método encargado de solicitar al correspondiente servicio de negocio eliminar el objeto de la base de datos.
•	lista + nombre de la entidad, método encargado de solicitar al correspondiente servicio de negocio extraer de la base de datos la totalidad de registro de la entidad.
•	buscar + nombre de entidad, método encargado de solicitar al correspondiente servicio de negocio la extracción de los registros asociados a una entidad que cumplan una determinada condición de filtro.

Rich Client Application

Clases encargada de gestionar los componentes de presentación, estas son traducidas a javascript [37](37.md) y se ejecutan en el navegador del usuario, se comunican con los servicios de presentación mediante llamadas asincrónicas, pueden acceder a los servicios de presentación de distintos módulos. La nomenclatura utilizada sigue el siguiente patrón: EntryPoint + nombre de entidad principal (Ejemplo: EntryPointDeposito), la entidad principal es la que gestiona el Rich Client Application.
Paginas HTML
Son encargadas de la maquetación de la presentación, estás utilizan los Rich Client Application, solo utilizan uno y este pertenece a su mismo modulo. La nomenclatura utilizada sigue el siguiente patrón: nombre de entidad principal (Ejemplo: Deposito), la entidad principal es la que gestiona el Rich Client Application que utiliza dicha página HTML.

Data Transfer Object

Estos objetos son los representantes de las entidades de dominio, con la salvedad de que ellos y toda la información que encapsulan es serializable, esto quiere decir que puede viajar desde la lógica de negocio hasta los Rich Client Application. El estándar seguido para estos objetos es el siguiente:
•	Implementan la interface java.io.Serializable.
•	Implementan la interface com.google.gwt.user.client.rpc.IsSerializable.
•	Todos sus atributos se definen al inicio.
•	Solo posee el constructor por defecto.
•	Posee un método “set + nombre atributo” y otro “get+ nombre atributo”, por cada atributo.
Dominio

Las entidades de dominio representan objetos de la realidad y son persistibles en la base de datos, estas siguen el siguiente estándar:
•	Todos sus atributos se definen al inicio, todas las entidades de dominio poseen el atributo ID de tipo java.lang.Long.
•	El siguiente método es el constructor por defecto que no posee sentencias en su sección de código.
•	Luego el constructor que recibe como parámetro el correspondiente DTO.
•	Seguido de un método “set + nombre atributo” y otro “get + nombre atributo”, por cada atributo.
•	Por último el método getDTO que no recibe parámetros y retorna el correspondiente DTO, está regla se sigue para que el agregar o quitar atributos a una entidad de dominio solo impacte en este método y en el constructor que recibe el DTO.

10.3.	Procedimientos

Desarrollo

Cuando un programador comienza una nueva sesión de desarrollo, sigue el siguiente procedimiento:
•	Se actualizan todos los fuentes desde el servidor SVN.
•	Se desarrolla.
•	Se versionan todos los cambios.
No se termina la sesión de desarrollo hasta completar todos los pasos, esto asegura una buena política de respaldo de los fuentes ya que queda la copia local más la del servidor.

Versionado de los cambios

Al finalizar una sesión de desarrollo los programadores tienen que versionar los cambios, aquí se sigue la siguiente política.
•	Todos los fuentes versionados son compilables y se versionan la totalidad de los cambios.