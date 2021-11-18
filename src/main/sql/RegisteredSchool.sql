/*
 Navicat Premium Data Transfer

 Source Server         : LYJ
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : LYJ

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 18/11/2021 15:53:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for RegisteredSchool
-- ----------------------------
DROP TABLE IF EXISTS `RegisteredSchool`;
CREATE TABLE `RegisteredSchool` (
  `id` int NOT NULL,
  `registeredSchool` varchar(255) NOT NULL,
  PRIMARY KEY (`registeredSchool`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of RegisteredSchool
-- ----------------------------
BEGIN;
INSERT INTO `RegisteredSchool` VALUES (3213, '中山大学');
INSERT INTO `RegisteredSchool` VALUES (3213215, '北京大学');
INSERT INTO `RegisteredSchool` VALUES (321314, '北京师范大学');
INSERT INTO `RegisteredSchool` VALUES (321315, '华南师范大学');
INSERT INTO `RegisteredSchool` VALUES (21312, '华南理工大学');
INSERT INTO `RegisteredSchool` VALUES (3213110, '山东大学');
INSERT INTO `RegisteredSchool` VALUES (32132113, '广东外语外贸大学');
INSERT INTO `RegisteredSchool` VALUES (3213121, '广东外语外贸大学南国商学院');
INSERT INTO `RegisteredSchool` VALUES (3216, '杭州大学');
INSERT INTO `RegisteredSchool` VALUES (1237, '杭州师范大学');
INSERT INTO `RegisteredSchool` VALUES (32111, '深圳大学');
INSERT INTO `RegisteredSchool` VALUES (12, '深圳职业技术学院');
INSERT INTO `RegisteredSchool` VALUES (4, '清华大学');
INSERT INTO `RegisteredSchool` VALUES (9, '湘潭大学');
INSERT INTO `RegisteredSchool` VALUES (321321, '牛逼大学');
INSERT INTO `RegisteredSchool` VALUES (1231, '社会大学');
INSERT INTO `RegisteredSchool` VALUES (8, '西湖大学');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
