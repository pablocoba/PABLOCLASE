tee C:/Users/conta/OneDrive/Documents/GitHub/Pablo_Coba_Docs/BBDD/UD3log_PCL.txt

/*Exercise 1:

Obtain the city and telephone number of the US offices.*/

select ciudad, telefono from oficinas where pais='EEUU';

/*Exercise 2:

Obtain the position, name, surname and email of the head of the company.*/

/*forma mala*/
select puesto, nombre, apellido1, apellido2, email from empleados where puesto = 'director general';
/*forma buena*/
select puesto, nombre, apellido1, apellido2, email from empleados where codigojefe is null;

/*Exercise 3:

Obtain the first and last name and position of those who are not sales representatives.*/

select nombre, apellido1, apellido2, puesto from empleados where puesto != 'representante ventas';

/*Exercise 4:

Obtain the number of clients the company has.*/

select count(codigocliente) from clientes;

/*Exercise 5:

Obtain the name of Spanish clients.*/

select count(codigocliente) from clientes where pais='spain';

/*Exercise 6:

Obtain how many clients the company has in each country.*/

select pais, count(codigocliente) from clientes group by 1;

/*Exercise 7:

Obtain how many clients the company has in the city of Madrid.*/

select ciudad, count(codigocliente) from clientes group by 1 having ciudad='madrid';

/*Exercise 8:

Obtain the employee code and the number of clients each sales representative serves.*/

select codigoEmpleadoRepVentas, count(codigocliente) from clientes group by 1;

/*Exercise 9:

Obtain what was the first and last payment made by the client whose code is 3.*/
/*mal hecho
select codigoCliente, IDtransaccion, Cantidad from pagos where codigoCliente=3 order by Idtransaccion desc limit 1;
select codigoCliente, IDtransaccion, Cantidad from pagos where codigoCliente=3 order by Idtransaccion asc limit 1;*/
/*bien hecho*/
select min(fechapago), max(fechapago), codigocliente from pagos where codigocliente=3;

/*Exerceise 10:

Obtain the customer code of those customers who made payments in 2008*/

select codigoCliente, fechapago from pagos having fechapago > ('2007-12-31') && fechapago < ('2009-01-01');

/*Exercise 11:

Obtain the different states through which an order can go.*/

select distinct estado from pedidos;

/*Exercise 12:

Obtain the order number, customer code, required date and delivery date of orders that have not been delivered on time.*/

select codigopedido, codigocliente, fechaesperada, fechaentrega, estado from pedidos where estado ="entregado" having fechaentrega>fechaesperada;

/*Exercise 13:

Get how many products exist in each order line.*/
//algo así, arreglar.
select distinct numeroLinea, count(codigoproducto) from detallepedidos group by numerolinea;

/*Ejercicio 14:

Obtener un listado de los 20 códigos de productos más pedidos ordenado por cantidad pedida.*/

select codigoproducto, sum(cantidad) as total from detallepedidos group by 1 order by 2 desc limit 20;

/*Exercise 15:

Obtain the order number, customer code, required date and delivery date of orders whose delivery date was at least two days before the required date. (Use addDate function)*/

select codigopedido, codigocliente, fechaesperada, fechaentrega from pedidos where addDate(fechaentrega, interval 2 day) <= fechaesperada order by 1;

/*Exercise 16:

Obtain the name, surname, office and position of those who are not sales representatives.*/

select nombre, apellido1, apellido2, codigooficina, puesto from empleados where puesto != 'representante ventas';

/*Exercise 17:

Obtain the number of clients assigned to each sales representative.*/

select codigoempleadorepventas as 'Codigo de empleado', count(codigocliente) as 'numero de clientes' from clientes group by 1;

/*Exercise 18:

Obtain a list with the total price of each order.*/

select codigopedido, sum(preciounidad*cantidad), cantidad, preciounidad from detallepedidos group by 1;

/*Exercise 19:

Get how many orders each customer has in each state.*/

select codigocliente, count(codigopedido) as  'nº pedidos', estado from pedidos group by 1,3 order by 1;

/*Exercise 20:

Obtain a list with the office, city, region and country code of those offices that are in countries whose name begins with “E”.*/

select codigooficina, ciudad, region, pais from oficinas where pais like 'E%';

/*Ejercicio 21:

Obtener el nombre, gama, dimensiones, cantidad en stock y el precio de venta de los cinco productos más caros.*/

 select nombre, gama, dimensiones, cantidadEnStock, precioventa from productos order by precioventa desc limit 5;
 
 /*Ejercicio 22:
 
Obtener el código y la facturación de aquellos pedidos mayores de 2000 euros.*/

select codigopedido, sum(preciounidad * cantidad) as facturacion from detallepedidos group by 1 having sum(preciounidad * cantidad)>2000;

/*Ejercicio 23:

Obtener una lista de los productos mostrando el stock total, la gama y el proveedor.*/

select cantidadenstock, gama, proveedor from productos;

/*Ejercicio 24:

Obtener el número de pedidos y código de cliente de aquellos pedidos cuya fecha de pedido sea igual a la de la fecha de entrega.*/

select count(codigopedido) as pedidos, codigocliente from pedidos where fechaentrega = fechaesperada group by 2;

notee;