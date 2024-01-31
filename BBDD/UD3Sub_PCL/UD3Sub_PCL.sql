tee C:/Users/dawmi/Desktop/escritorio/p/BBDD/UD3Sub_PCL/UD3Sub_PCL.txt

/*Exercise 1:

Get the name of the more expensive product. Perform the exercise as a subquery and then as a simple query to make said query more efficient.*/

/*subconsulta*/
select nombre, precioventa from productos where precioventa = (select max(precioventa) from productos);
/*consulta simple*/
select nombre, precioventa from productos order by precioventa desc limit 1;
/*otro modo consulta simple*/
select nombre, max(precioventa) as precio from productos;

/*Exercise 2:

Get the name of the product of which the most units have been sold in the same order.*/

select p.nombre, d.cantidad from productos p inner join detallepedidos d on p.codigoproducto = d.codigoproducto where d.cantidad = (select max(cantidad) from detallepedidos);
/*sin multitabla*/
select nombre, codigoproducto from productos where codigoproducto = (select codigoproducto from detallepedidos order by cantidad desc limit 1);

/*Exercise 3:

Get the name of the customers who placed orders in 2008.*/

select nombrecliente from clientes where codigocliente in (select codigocliente from pedidos where year(fechapedido) = 2008);

/*Exercise 4:

Get the clients that They have ordered more than 200 units of any product.*/ 

select distinct c.nombrecliente from clientes c inner join pedidos p on c.codigocliente = p.codigocliente where codigopedido in (select codigopedido from detallepedidos group by 1 having sum(cantidad)>200);

select nombrecliente from clientes where codigocliente in (select codigocliente from pedidos where codigopedido in (select codigopedido from detallepedidos group by 1 having sum(cantidad)>200));

/*Exercise 5:

Get the clients that They reside in cities where there are no offices.*/	

select nombrecliente from clientes where not ciudad in (select ciudad from oficinas);

/*Exercise 6:

Get the name, surnames and email of the employees under Alberto Soria.*/

select nombre, apellido1, apellido2, email from empleados where codigojefe = (select codigojefe from empleados where nombre='Alberto' and apellido1 ='Soria') and nombre != 'Alberto';

/*Exercise 7:

Get the name of the customers to whom an order has not been delivered on time.*/

select nombrecliente from clientes where codigocliente in (select codigocliente from pedidos where fechaentrega>fechaesperada);

/*Exercise 8:

Get the name and telephone number of customers who made a payment in 2007, ordered alphabetically by name.*/

select nombrecliente, telefono from clientes where codigocliente in (select codigocliente from pagos where fechapago > '2006-12-31' and fechapago < '2008-01-01') order by 1 asc;

/*Exercise 9:

Get the range, the supplier and the quantity of those products whose status is pending.*/

select p.gama, p.proveedor, d.cantidad 
from productos p 
inner join detallepedidos d 
on p.codigoproducto=d.codigoproducto 
where d.codigopedido in (
	select codigopedido 
	from pedidos where estado = 'pendiente'
);

/*para comprobar aun más*/
select p.gama, p.proveedor, p.nombre,d.codigopedido,p.cantidadenstock,d.cantidad from productos p inner join detallepedidos d on p.codigoproducto=d.codigoproducto where d.codigopedido in (select codigopedido from pedidos where estado = 'pendiente') order by 4 desc;

select codigopedido from detallepedidos where sum(cantidad)>200;

notee;