DROP TABLE IF EXISTS `wrel_users`;
CREATE TABLE `wrel_users` (
`id`  int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '�y���s��  -- key' ,
`email`  varchar(100)  CHARACTER SET utf8 COLLATE utf8_general_ci  NOT NULL COMMENT 'email' ,
`password`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL  COMMENT '��?password' ,
`status`  int(1) NOT NULL  COMMENT '�O�_�ҥ� 1:�ҥ�, 2�G����' ,
`create_time`  datetime NOT NULL  COMMENT '�إ߮ɶ�' ,
`modify_time`  datetime NOT NULL COMMENT '�ק�ɶ�' ,
PRIMARY KEY (`id`)
)
ENGINE=MyISAM
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=0

;