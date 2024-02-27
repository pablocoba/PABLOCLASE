drop procedure if exists listar_productos$$
create procedure listar_productos(IN gama varchar(50))
begin
	select Nombre, Gama, CodigoProducto
	from productos
	where productos.gama = gama;
end
$$

delimiter ;
call listar_productos('Herramientas');

DELIMITER $$
DROP PROCEDURE IF EXISTS contar_productos$$
CREATE PROCEDURE contar_productos(IN gama VARCHAR(50), OUT total INT UNSIGNED)
BEGIN
  SET total = (
    SELECT COUNT(*) 
    FROM productos
    WHERE productos.gama = gama);
END
$$