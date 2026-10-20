CREATE TABLE conta (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
titular VARCHAR(100),
valor DECIMAL(10,2)
);
INSERT INTO conta (titular, valor) VALUES ('Ana Souza', 1500.00);
INSERT INTO conta (titular, valor) VALUES ('Bruno Lima', 320.50);
