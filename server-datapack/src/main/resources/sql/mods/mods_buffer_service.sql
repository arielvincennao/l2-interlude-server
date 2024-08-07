CREATE TABLE IF NOT EXISTS `custom_buffer_service_ulists` (
  `ulist_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ulist_char_id` int(10) unsigned NOT NULL,
  `ulist_name` varchar(255) NOT NULL,
  PRIMARY KEY (`ulist_id`),
  UNIQUE KEY `ulist_char_id` (`ulist_char_id`,`ulist_name`),
  CONSTRAINT `custom_buffer_service_ulists_ibfk_1` FOREIGN KEY (`ulist_char_id`) REFERENCES `characters` (`charId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS `custom_buffer_service_ulist_buffs` (
  `ulist_id` int(10) unsigned NOT NULL,
  `ulist_buff_ident` varchar(255) NOT NULL,
  PRIMARY KEY (`ulist_id`,`ulist_buff_ident`),
  CONSTRAINT `custom_buffer_service_ulist_buffs_ibfk_1` FOREIGN KEY (`ulist_id`) REFERENCES `custom_buffer_service_ulists` (`ulist_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;