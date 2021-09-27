-- inserts shops (id, shop name, storage capacity) 
INSERT INTO shops VALUES (NULL, 'Green', 6);
INSERT INTO shops VALUES (NULL, 'Blue', 3);
INSERT INTO shops VALUES (NULL, 'Red', 5);
INSERT INTO shops VALUES (NULL, 'Yellow', 5);

-- inserts paintings (id, author, title, price, shop id) 
INSERT INTO paintings VALUES (NULL, 'Joan Miró', 'La Masia', 500000.0, NULL, 1);
INSERT INTO paintings VALUES (NULL, 'Picasso', 'Guernica', 1000000.0, NULL, 1);
INSERT INTO paintings VALUES (NULL, 'Leonardo da Vinci', 'Mona Lisa', 1500000.0, NULL, 2);
INSERT INTO paintings VALUES (NULL, 'Van Gogh', 'The kiss', 800000.0, NULL, 2);
INSERT INTO paintings VALUES (NULL, 'Velazquez', 'Las Meninas', 700000.0, NULL, 2);
INSERT INTO paintings VALUES (NULL, 'Goya', '3 de mayo de 1808', 1100000.0, NULL, 3);
INSERT INTO paintings VALUES (NULL, 'Greco', 'Vista de Toledo', 500000.0, NULL, 4);
INSERT INTO paintings VALUES (NULL, 'Hokusai', 'The Greate Wave', 900000.0, NULL, 4);

