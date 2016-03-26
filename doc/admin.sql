DROP TABLE IF EXISTS `wrel_users`;
CREATE TABLE `wrel_users` (
`id`  int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '流水編號  -- key' ,
`email`  varchar(100)  CHARACTER SET utf8 COLLATE utf8_general_ci  NOT NULL COMMENT 'email' ,
`password`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL  COMMENT '用?password' ,
`status`  int(1) NOT NULL  COMMENT '是否啟用 1:啟用, 2：停用' ,
`create_time`  datetime NOT NULL  COMMENT '建立時間' ,
`modify_time`  datetime NOT NULL COMMENT '修改時間' ,
PRIMARY KEY (`id`)
)
ENGINE=MyISAM
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=0

;