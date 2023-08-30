CREATE TABLE `contato` (
    `contato_id` int NOT NULL AUTO_INCREMENT,
    `contato_nome` varchar(200) NOT NULL,
    `email` varchar(200),
    `telefone` varchar(200),
    PRIMARY KEY (`contato_id`)
);