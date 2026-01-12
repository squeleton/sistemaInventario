## Proyectos 01: Sistema de inventario
Este sistema de inventario tiene por objetivo manejar los productos de una tienda física (localidad única) y todo el inventario de una manera simple, moderna y bien documentada.

## Casos de uso
Los requerimientos son la parte más fundamental de crear un sistema; antes de escribir una línea de código, se debe tener bien en claro qué es lo que se busca, cuál es el scope, las funcionalidades clave, etc.

En este caso, después de ser planteado el sistema, desarrolle el siguiente documento: 


[Inventario Epicas.txt](https://github.com/user-attachments/files/24562079/Inventario.Epicas.txt)
Introducción: Un sistema para controlar stock de una tienda pequeña. No solo guarda nombres, sino que gestiona cantidades y estados.

Instrucciones: Crea una clase Producto con ID, nombre, cantidad y precio. El sistema debe permitir añadir, buscar por ID, actualizar stock y listar productos en bajo inventario.

Recomendaciones: Un ArrayList para los productos. Implementa un método que recorra la lista y avise qué productos tienen menos de 5 unidades.

Resultado esperado: Un menú interactivo que no se rompa si el usuario ingresa una letra en lugar de un número.

Casos de prueba: 

1. Intentar vender 10 unidades de un producto que solo tiene 5 (debe dar error).

2. Buscar un ID que no existe.

------------------------------------------------------------------------------------------------------------------------------------------
Resumen:

Estamos creando un sistema de inventario de la primera tienda Helper SpA. El objetivo de este sistema es mantener una contabilidad de los productos existentes (por ahora creados en el sistema).

Se debe poder crear un product, con su cantidad de stock y todo eso. Lo ideal, obviamente, sería un menú donde se le diese la bienvenida a la persona y que se le diesen opciones: 

1. Revisar inventario (ver cantidad de productos y estado actual). 

2. Extracción (similar a una venta) 

3. Añadir producto. 

4. Buscar producto por ID.

5. Actualizar stock.
