SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;
CREATE DATABASE IF NOT EXISTS `biblioteca` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish2_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `biblioteca`;

DROP TABLE IF EXISTS `autores`;
CREATE TABLE IF NOT EXISTS `autores` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombres` varchar(40) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `apellidos` varchar(40) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

DROP TABLE IF EXISTS `categorias`;
CREATE TABLE IF NOT EXISTS `categorias` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(100) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

DROP TABLE IF EXISTS `devoluciones``;
CREATE TABLE IF NOT EXISTS `devoluciones` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `prestamo_id` int unsigned DEFAULT NULL,
  `fecha_hora` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `prestamo_devolucion` (`prestamo_id`),
  CONSTRAINT `prestamo_devolucion` FOREIGN KEY (`prestamo_id`) REFERENCES `prestamos` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

DROP TABLE IF EXISTS `editoriales`;
CREATE TABLE IF NOT EXISTS `editoriales` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre_editorial` varchar(100) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `pais_id` int unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pais_editorial` (`pais_id`),
  CONSTRAINT `pais_editorial` FOREIGN KEY (`pais_id`) REFERENCES `paises` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

DROP TABLE IF EXISTS `libros`;
CREATE TABLE IF NOT EXISTS `libros` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `titulo` varchar(200) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `paginas` smallint unsigned DEFAULT NULL,
  `categoria_id` int unsigned DEFAULT NULL,
  `autor_id` int unsigned DEFAULT NULL,
  `editorial_id` int unsigned DEFAULT NULL,
  `disponibles` smallint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `categoria_libro` (`categoria_id`),
  KEY `autor_libro` (`autor_id`),
  KEY `editorial_libro` (`editorial_id`),
  CONSTRAINT `autor_libro` FOREIGN KEY (`autor_id`) REFERENCES `autores` (`id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `categoria_libro` FOREIGN KEY (`categoria_id`) REFERENCES `categorias` (`id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `editorial_libro` FOREIGN KEY (`editorial_id`) REFERENCES `editoriales` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

DROP TABLE IF EXISTS `paises`;
CREATE TABLE IF NOT EXISTS `paises` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre_pais` varchar(50) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

DROP TABLE IF EXISTS `prestamos`;
CREATE TABLE IF NOT EXISTS `prestamos` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `libro_id` int unsigned DEFAULT NULL,
  `usuario_id` int unsigned DEFAULT NULL,
  `fecha_hora` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `libro_prestamo` (`libro_id`),
  KEY `usuario_prestamo` (`usuario_id`),
  CONSTRAINT `libro_prestamo` FOREIGN KEY (`libro_id`) REFERENCES `libros` (`id`) ON DELETE SET NULL ON UPDATE SET NULL,
  CONSTRAINT `usuario_prestamo` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `email` varchar(100) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `direccion` varchar(255) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `telefono` varchar(20) COLLATE utf8mb4_spanish2_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

SET FOREIGN_KEY_CHECKS = 1;