use admin_default;

ALTER DATABASE admin_default CHARACTER
SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;
ALTER TABLE cards CONVERT TO CHARACTER
SET utf8mb4
COLLATE utf8mb4_unicode_ci;

INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (0, 'Шут', '01.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (1, 'Маг', '02.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (2, 'Верховная жрица', '03.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (3, 'Императрица', '04.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (4, 'Император', '05.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (5, 'Верховный жрец', '06.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (6, 'Влюбленные', '07.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (7, 'Колесница', '08.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (8, 'Справедливость', '09.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (9, 'Отшельник', '10.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (10, 'Колесо фортуны', '11.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (11, 'Сила', '12.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (12, 'Повешенный', '13.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (13, 'Смерть', '14.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (14, 'Умеренность', '15.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (15, 'Дьявол', '16.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (16, 'Башня', '17.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (17, 'Звезда', '18.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (18, 'Луна', '19.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (19, 'Солнце', '20.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (20, 'Суд', '21.jpg');
INSERT INTO cards
(card_number, card_name, image_path)
VALUES
  (21, 'Мир', '22.jpg');
