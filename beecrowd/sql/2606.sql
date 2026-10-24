-- o LIKE com % pega qualquer categoria que comece com 'super'
-- (o % significa "qualquer coisa depois")
SELECT products.id, products.name
FROM products
INNER JOIN categories ON products.id_categories = categories.id
WHERE categories.name LIKE 'super%';
