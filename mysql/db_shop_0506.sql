/*
 Navicat Premium Data Transfer

 Source Server         : localhost_mysql
 Source Server Type    : MySQL
 Source Server Version : 50525 (5.5.25)
 Source Host           : localhost:3306
 Source Schema         : db_shop_0506

 Target Server Type    : MySQL
 Target Server Version : 50525 (5.5.25)
 File Encoding         : 65001

 Date: 07/05/2023 11:43:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_member
-- ----------------------------
DROP TABLE IF EXISTS `t_member`;
CREATE TABLE `t_member`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `member_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_member
-- ----------------------------
INSERT INTO `t_member` VALUES (2, 'member1022', 'member1022@qq.com');
INSERT INTO `t_member` VALUES (3, 'member103', 'member103@qq.com');
INSERT INTO `t_member` VALUES (4, 'member104', 'member104@qq.com');
INSERT INTO `t_member` VALUES (5, 'member104', 'member104@qq.com');
INSERT INTO `t_member` VALUES (6, 'member104', 'member104@qq.com');
INSERT INTO `t_member` VALUES (7, 'member105', 'member105@qq.com');
INSERT INTO `t_member` VALUES (8, 'member106', 'member106@qq.com');
INSERT INTO `t_member` VALUES (9, 'member107', 'member107@qq.com');
INSERT INTO `t_member` VALUES (10, 'member107', 'member107@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
