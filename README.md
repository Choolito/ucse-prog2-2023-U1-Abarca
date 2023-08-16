# ucse-prog2-2023-U1-Abarca

El modelado de los objetos asociados los distribui en tres imagenes.
La imagen Productos.
Posee nueve componentes en este caso. Uno de ellos es la interfaz que cumple la funcion de poseer todos los metodos en comun entre los distintos tipos de productos que creemos. En base a este componente, se crean tres mas que implementan los metodos de la interfaz. Cada uno de estos sera el objeto a formar cuando se cree un nuevo producto x.
Luego para crear esos productos, tenemos una clase abstracta llamada ProductFactory, que tendra el metodo abstracto de creacion que sera extendido a sus subclases, una por cada tipo de producto existente en nuesto modelo.
Y por ultimo tenemos la clase ProductSelector, que contiene el metodo para distinguir entre cada tipo de producto que exista. Y en base a eso crea un producto utilizando el ProductFactory, usando su debida subclase, generando una subclase de Product en base al tipo de producto seleccionado y buscando en la clase ProductSelector.
La imagen MedioPago.


La imagen Envio.
