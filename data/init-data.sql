-- CARD_NETWORK
INSERT INTO card_network(description) VALUES ('MasterCard');
INSERT INTO card_network(description) VALUES ('VISA');
INSERT INTO card_network(description) VALUES ('Elo');
INSERT INTO card_network(description) VALUES ('American Express');

-- CUSTOMER_GENDER
INSERT INTO customer_gender(description) VALUES ('Masculino');
INSERT INTO customer_gender(description) VALUES ('Feminino');
INSERT INTO customer_gender(description) VALUES ('Outro');

-- DELETE_STATUS
INSERT INTO delete_status(description) VALUES ('Ativo');
INSERT INTO delete_status(description) VALUES ('Excluido');
INSERT INTO delete_status(description) VALUES ('Esgotado');

-- GAME_DEVELOPER
INSERT INTO game_developer(name) VALUES ('Microsoft');
INSERT INTO game_developer(name) VALUES ('Nintendo');
INSERT INTO game_developer(name) VALUES ('Eletronic Arts');
INSERT INTO game_developer(name) VALUES ('Ubisoft');
INSERT INTO game_developer(name) VALUES ('Rockstar Games');
INSERT INTO game_developer(name) VALUES ('Project Red');
INSERT INTO game_developer(name) VALUES ('Sony');

-- GAME_GENDER
INSERT INTO game_gender(name) VALUES ('Ação');
INSERT INTO game_gender(name) VALUES ('Simulação');
INSERT INTO game_gender(name) VALUES ('Esporte');
INSERT INTO game_gender(name) VALUES ('Aventura');
INSERT INTO game_gender(name) VALUES ('Tiro em primeira pessoa');
INSERT INTO game_gender(name) VALUES ('Indie');

-- GAME_MEDIA_TYPE
INSERT INTO game_media_type(description) VALUES ('Física');
INSERT INTO game_media_type(description) VALUES ('Digital');

-- GAME_PLATFORM
INSERT INTO game_platform(name) VALUES ('PS4');
INSERT INTO game_platform(name) VALUES ('PS5');
INSERT INTO game_platform(name) VALUES ('PC');
INSERT INTO game_platform(name) VALUES ('Xbox One');

-- PRODUCT_PRICING
INSERT INTO product_pricing(percentage) VALUES (10.0);
INSERT INTO product_pricing(percentage) VALUES (20.0);
INSERT INTO product_pricing(percentage) VALUES (30.0);
INSERT INTO product_pricing(percentage) VALUES (40.0);
INSERT INTO product_pricing(percentage) VALUES (50.0);

-- PRODUCT_TYPE
INSERT INTO product_type(name) VALUES ('Games');
INSERT INTO product_type(name) VALUES ('Consoles');
INSERT INTO product_type(name) VALUES ('Acessórios');