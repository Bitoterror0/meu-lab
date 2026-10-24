-- OR porque o produto pode estar em qualquer uma das duas faixas de preco
SELECT id, name
FROM products
WHERE price < 10 OR price > 100;
