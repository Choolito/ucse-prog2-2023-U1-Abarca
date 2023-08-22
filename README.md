# ucse-prog2-2023-U1-Abarca

El modelado de los objetos asociados los distribui en tres imagenes.

La imagen Productos.
Posee nueve componentes en este caso. Uno de ellos es la interfaz que cumple la funcion de poseer todos los metodos en comun entre los distintos tipos de productos que creemos. En base a este componente, se crean tres mas que implementan los metodos de la interfaz. Cada uno de estos sera el objeto a formar cuando se cree un nuevo producto x.
Luego para crear esos productos, tenemos una clase abstracta llamada ProductFactory, que tendra el metodo abstracto de creacion que sera extendido a sus subclases, una por cada tipo de producto existente en nuesto modelo.
Y por ultimo tenemos la clase ProductSelector, que contiene el metodo para distinguir entre cada tipo de producto que exista. Y en base a eso crea un producto utilizando el ProductFactory, usando su debida subclase, generando una subclase de Product en base al tipo de producto seleccionado y buscando en la clase ProductSelector.
Esto permite agregar nuevas categorias en este ejercicio.

La imagen MedioPago.
El componente PaymentManager utiliza tanto el PaymentProcessor y el PaymentGateway. El PaymentManager procesa los pagos recibiendo los datos del monto y que medio se utiliza. PaymentProcessor es una clase abstracta que extiende a las subclases de los medio de pagos que tienen los metodos de procesado y reembolso de pagos. Luego el PaymentGateway es una interfaz que es implementada en las subclases de los medios de pagos que poseen los metodos de autorizacion y captura de pagos.
Esto es muy util para realizar compras y agregar nuevos medios de pagos facilmente en este ejercicio.

La imagen Envio.
El componente ShippingStrategy es una interfaz que posee los metodos para calcular los costos de los envios. Esta es implementada por subclases que son para cada uno de los medios de envio y cada uno con el retorno de un determinado porcentaje. Pero para realizar los calculos, se utiliza una clase ShippingCalculator que contiene los metodos de las implementaciones de los medios de envio.
Esto en el ejercicio nos sirve para modificar los costos de envio facilmente, y agregar alguno otro medio de la misma manera.

Al agregar una nueva categoria, gracias a el patron Factory Method solo deberias crear una nueva subclase "ProductFactory" para esa categoria y definir la logica de creacion especifica. Esto permite que el sistema tenga una buena escalabilidad y flexibilidad, siendo innecesario modificar las clases ya existentes.
Al modificar el costo de envio de algun tipo de envio particular, gracias al patron Strategy, si se necesita modificar el calculo del costo, se puede crear una nueva implementacio de "ShippingStrategy" sin afectar a las existentes. Integrandose sin cambios en la clase "ShippingCalculator".
Y si deseamos agregar un nuevo medio de pago, con el padron Bridge, se crea una nueva subclase "PaymentProcessor" permitiendo extender el sistema sin modificar el codigo existente de procesamiento de pagos.
