BEGIN
CREATE DATABASE [Demo]
END;
GO

USE [Demo];
GO

CREATE  TABLE Demo.dbo.Devoluciones ( 
	Id                   int      NOT NULL,
	Prestamos_ID         int      NULL,
	CONSTRAINT pk_Devoluciones PRIMARY KEY  ( Id ) ,
	CONSTRAINT unq_Devoluciones_Prestamos_ID UNIQUE ( Prestamos_ID ) 
 );
GO

CREATE  TABLE Demo.dbo.Prestamos ( 
	Id                   int      NOT NULL,
	Usuario_ID           int      NULL,
	Libro_ID             int      NULL,
	Fecha                date      NULL,
	CONSTRAINT pk_Prestamos PRIMARY KEY  ( Id ) ,
	CONSTRAINT unq_Prestamos_Usuario_ID UNIQUE ( Usuario_ID ) ,
	CONSTRAINT unq_Prestamos_Libro_ID UNIQUE ( Libro_ID ) 
 );
GO

CREATE  TABLE Demo.dbo.[Usuarios Registrados] ( 
	Id                   int      NOT NULL,
	Nombre               varchar(100)      NULL,
	Apellido             varchar(100)      NULL,
	Direccion            varchar(100)      NULL,
	Telefono             int      NULL,
	CONSTRAINT [pk_Usuarios Registrados] PRIMARY KEY  ( Id ) 
 );
GO

CREATE  TABLE Demo.dbo.Libros ( 
	Id                   int      NOT NULL,
	Autor_ID             int      NULL,
	Titulo               varchar(100)      NULL,
	Paginas              int      NULL,
	Editorial            varchar(100)      NULL,
	Edicion              varchar(100)      NULL,
	CONSTRAINT pk_Libros PRIMARY KEY  ( Id ) ,
	CONSTRAINT unq_Libros_Autor_ID UNIQUE ( Autor_ID ) 
 );
GO

CREATE  TABLE Demo.dbo.Autor ( 
	Id                   int      NOT NULL,
	Nombre               varchar(100)      NULL,
	Apellido             varchar(100)      NULL,
	CONSTRAINT pk_Autor PRIMARY KEY  ( Id ) 
 );
GO

ALTER TABLE Demo.dbo.Autor ADD CONSTRAINT fk_Autor_Libros FOREIGN KEY ( Id ) REFERENCES Demo.dbo.Libros( Autor_ID );
GO

ALTER TABLE Demo.dbo.Libros ADD CONSTRAINT fk_Libros_Prestamos FOREIGN KEY ( Id ) REFERENCES Demo.dbo.Prestamos( Libro_ID );
GO

ALTER TABLE Demo.dbo.Prestamos ADD CONSTRAINT fk_Prestamos_Devoluciones FOREIGN KEY ( Id ) REFERENCES Demo.dbo.Devoluciones( Prestamos_ID );
GO

ALTER TABLE Demo.dbo.[Usuarios Registrados] ADD CONSTRAINT [fk_Usuarios Registrados_Prestamos] FOREIGN KEY ( Id ) REFERENCES Demo.dbo.Prestamos( Usuario_ID );
GO
