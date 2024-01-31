/*Ejercicio 1:

Obtener los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. Utliza WHERE en lugar de JOIN para la unión de tablas..*/

 select c.codigocliente, c.limitecredito, sum(p.cantidad) as total from clientes c, pagos p where c.codigocliente = p.idtransaccion group by 1 having c.limitecredito>total;

/*Ejercicio 2:

Mostrar un listado de jugadores con el formato nombre(equipo) en una sola columna.*/

