-- o nome do fornecedor fica em outra tabela, entao preciso do JOIN
-- ligando a chave estrangeira id_providers com o id do fornecedor
SELECT products.name, providers.name
FROM products
INNER JOIN providers ON products.id_providers = providers.id
WHERE products.id_categories = 6;
