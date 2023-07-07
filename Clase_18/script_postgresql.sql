CREATE SCHEMA IF NOT EXISTS demopostgresql;

CREATE  TABLE demopostgresql.devoluciones ( 
	id                   integer  NOT NULL  ,
	prestamos_id         integer    ,
	CONSTRAINT pk_devoluciones PRIMARY KEY ( id ),
	CONSTRAINT unq_devoluciones_presatmos_id UNIQUE ( prestamos_id ) 
 );

CREATE  TABLE demopostgresql.prestamos ( 
	id                   integer  NOT NULL  ,
	usuario_id           integer    ,
	libro_id             integer    ,
	fecha                date    ,
	CONSTRAINT pk_prestamos PRIMARY KEY ( id ),
	CONSTRAINT unq_prestamos_usuario_id UNIQUE ( usuario_id ) ,
	CONSTRAINT unq_prestamos_libro_id UNIQUE ( libro_id ) 
 );

CREATE  TABLE demopostgresql.usuarios_registrados ( 
	id                   integer  NOT NULL  ,
	nombre               varchar(100)    ,
	apellido             varchar(100)    ,
	direccion            varchar(100)    ,
	telefono             varchar(100)    ,
	CONSTRAINT pk_usuarios_registrados PRIMARY KEY ( id )
 );

CREATE  TABLE demopostgresql.libros ( 
	id                   integer  NOT NULL  ,
	autor_id             integer    ,
	titulo               varchar(100)    ,
	paginas              integer    ,
	editorial            varchar(100)    ,
	edicion              varchar(100)    ,
	CONSTRAINT pk_libros PRIMARY KEY ( id ),
	CONSTRAINT unq_libros_autor_id UNIQUE ( autor_id ) 
 );

CREATE  TABLE demopostgresql.autor ( 
	id                   integer  NOT NULL  ,
	nombre               varchar(100)    ,
	apellido             varchar(100)    ,
	CONSTRAINT pk_autor PRIMARY KEY ( id )
 );

ALTER TABLE demopostgresql.autor ADD CONSTRAINT fk_autor_libros FOREIGN KEY ( id ) REFERENCES demopostgresql.libros( autor_id );

ALTER TABLE demopostgresql.libros ADD CONSTRAINT fk_libros_prestamos FOREIGN KEY ( id ) REFERENCES demopostgresql.prestamos( libro_id );

ALTER TABLE demopostgresql.prestamos ADD CONSTRAINT fk_prestamos_devoluciones FOREIGN KEY ( id ) REFERENCES demopostgresql.devoluciones( prestamos_id );

ALTER TABLE demopostgresql.usuarios_registrados ADD CONSTRAINT fk_usuarios_registrados_prestamos FOREIGN KEY ( id ) REFERENCES demopostgresql.prestamos( usuario_id );