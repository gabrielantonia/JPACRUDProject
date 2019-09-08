-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema PokeBattle
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `PokeBattle` ;

-- -----------------------------------------------------
-- Schema PokeBattle
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `PokeBattle` DEFAULT CHARACTER SET utf8 ;
USE `PokeBattle` ;

-- -----------------------------------------------------
-- Table `Pokemon`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Pokemon` ;

CREATE TABLE IF NOT EXISTS `Pokemon` (
  `pokedex_number` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `type` VARCHAR(45) NULL,
  `type_2` VARCHAR(45) NULL,
  `hp` INT NOT NULL,
  `attack` INT NOT NULL,
  `defense` INT NOT NULL,
  `sp_attack` INT NOT NULL,
  `sp_defense` INT NOT NULL,
  `speed` INT NOT NULL,
  `abilities` VARCHAR(45) NULL,
  `against_bug` INT NULL DEFAULT 1,
  `against_dark` INT NULL DEFAULT 1,
  `against_dragon` INT NULL DEFAULT 1,
  `against_electric` INT NULL DEFAULT 1,
  `against_fairy` INT NULL DEFAULT 1,
  `against_fight` INT NULL DEFAULT 1,
  `against_fire` INT NULL DEFAULT 1,
  `against_flying` INT NULL DEFAULT 1,
  `against_ghost` INT NULL DEFAULT 1,
  `against_grass` INT NULL DEFAULT 1,
  `against_ground` INT NULL DEFAULT 1,
  `against_ice` INT NULL DEFAULT 1,
  `against_normal` INT NULL DEFAULT 1,
  `against_poison` INT NULL DEFAULT 1,
  `against_psychic` INT NULL DEFAULT 1,
  `against_rock` INT NULL DEFAULT 1,
  `against_steel` INT NULL DEFAULT 1,
  `against_water` INT NULL DEFAULT 1,
  `classification` VARCHAR(45) NULL,
  `height` DECIMAL(3,1) NULL,
  `weight_kg` DECIMAL(5,1) NULL,
  PRIMARY KEY (`pokedex_number`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `table1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `table1` ;

CREATE TABLE IF NOT EXISTS `table1` (
)
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS poketrainer@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'poketrainer'@'localhost' IDENTIFIED BY 'poketrainer';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'poketrainer'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
