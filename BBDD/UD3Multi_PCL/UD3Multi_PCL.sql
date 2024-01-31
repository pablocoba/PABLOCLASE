	tee C:/Users/dawmi/Desktop/p/BBDD/UD3Multi_PCL/UD3Multi_PCL.txt
	/*Exercise 1:

Get the clients whose line of credit is greater than the payments you have made. Use WHERE in instead of JOIN for joining tables.*/

	 select c.codigocliente, c.limitecredito, p.cantidad from clientes c, pagos p where c.limitecredito > p.cantidad;

	 /*Exercise 2:

Get the name of the clients and the name of their representatives along with the city of the office to which the representative belongs to. Use WHERE instead of JOIN for the join tables*/

	 select c.nombrecliente as 'Nombre Cliente', e.nombre as 'Nombre Empleado', o.ciudad as 'Ciudad' from clientes c, empleados e, oficinas o where e.codigoempleado = c.codigoempleadorepventas;
	
	/*Exercise 3:

Get the name of the clients and the name of their representatives along with the city of the office to which the representative belongs to. Use JOIN instead WHERE for joining tables.*/

	 select c.nombrecliente as 'Nombre Cliente', e.nombre as 'Nombre Empleado', o.ciudad as 'Ciudad' from clientes c inner join  empleados e inner join oficinas o on e.codigoempleado = c.codigoempleadorepventas;
	
	/*Exercise 4:

Get a list of customers indicating the customer's name and how many orders they have placed.*/

	 select c.nombrecliente, count(p.codigopedido) from clientes c inner join pedidos p on c.codigocliente = p.codigocliente group by 1;
	
	/*Exercise 5:

Get a list of names of the clients and the total paid by each of them.*/

	 select c.nombrecliente, count(p.codigopedido) from clientes c inner join pedidos p group by 1;
	
	/*Exercise 6:

Get the name and surnames of employees as well as the customer name of those employees that represent clients who have made a payment through Paypal.*/

	 select e.nombre as 'Nombre empleado', e.apellido1 as 'Apellido empleado', c.nombrecliente as 'Cliente' from empleados e inner join clientes c inner join pagos p on p.formapago = 'Paypal' where c.codigoempleadorepventas = e.codigoempleado group by 3; select e.nombre as 'Nombre empleado', e.apellido1 as 'Apellido empleado', c.nombrecliente as 'Cliente', p.formapago from empleados e inner join clientes c inner join pagos p on p.formapago = 'Paypal' where c.codigoempleadorepventas = e.codigoempleado group by 3;
	
	/*Exercise 7:

Get how many employees each office has, showing the name of the city where the office is.*/

	 select o.ciudad, count(e.codigoempleado) as numero from oficinas o inner join empleados e on o.codigooficina = e.codigooficina group by 1;
	
	/*Exercise 8:

Get the name, last name, office (city) and position of the employee who does not represent any customer.*/

	 /*mala pero valida por ahora*/
	 select e.nombre, e.apellido1, o.ciudad, e.puesto from empleados e inner join oficinas o on e.codigoOficina = o.codigooficina where e.puesto != 'representante ventas';
	 /*buena con subconsultas*/
	 select e.nombre, e.apellido1, o.ciudad, e.puesto from empleados e inner join oficinas o on e.codigoOficina = o.codigooficina where e.codigoempleado not in (select codigoempleadorepventas from clientes);
	 
	 /*Exercise 8:

Get the name, last name, office (city) and position of the employee who does not represent any customer.*/

	 select c.nombrecliente, p.idtransaccion, p.fechapago from clientes c inner join pagos p on c.codigocliente = p.codigocliente where year(fechapago) = 2007;
	 
	 /*Exercise 10:

Get the names of the clients as well as the names and surnames of their representatives of those customers who have not made payments.*/
	 
	 /*funciona por el left join que se centra en la primera tabla, con inner join saldrían también los clientes que han pagado.*/
	 select c.nombrecliente, e.nombre, e.apellido1, e.apellido2 from clientes c inner join empleados e on c.codigoempleadorepventas = e.codigoempleado left join pagos p on c.codigocliente = p.codigocliente where p.codigocliente is null;
	 /*con subconsulta*/
	 select c.nombrecliente, e.nombre, e.apellido1, e.apellido2 from clientes c inner join empleados e on c.codigoempleadorepventas = e.codigoempleado where c.codigocliente not in (select codigocliente from pagos);
	
	/*Exercise 11:

Get the name, range and text description of products that have never been ordered.*/
	 
	 select p.codigoproducto, p.nombre, p.gama, substring(p.descripcion, 1, 10) as descripcion from productos p left join detallepedidos d on p.codigoproducto = d.codigoproducto where d.codigoproducto is null;
	 /*con subconsulta*/
	 
	 select p.codigoproducto, p.nombre, p.gama, substring(p.descripcion, 1, 10) as descripcion from productos p left join detallepedidos d on p.codigoproducto = d.codigoproducto where p.codigoproducto not in (select codigoproducto from detallepedidos);
	 
	 /*Exercise 12:

Get the name, surname and zip code of all employees working at Barcelona.*/

	 select e.nombre, e.apellido1, e.apellido2, o.codigopostal, o.ciudad from empleados e inner join oficinas o on e.codigooficina = o.codigooficina where o.ciudad = 'barcelona';
	
	/*Exercise 13:

Get the product code, text description and the number of times it has been ordered said product.*/

	 select p.codigoproducto, substring(p.descripcion, 1, 10) as descripcion, sum(d.cantidad) as cantidad from productos p inner join detallepedidos d on p.codigoproducto = d.codigoproducto group by 1;
	 
	 /*Exercise 14:

Get the name of the customers in the city of Madrid who have placed an order and the state in which said order is.*/

	 select c.nombrecliente as Nombre, p.estado as Estado, c.ciudad as Ciudad from clientes c inner join pedidos p on c.codigocliente = p.codigocliente where c.ciudad = 'madrid';
	 
	 notee;