SELECT Department, COUNT(SKU) AS NumberOfCatalogItems
FROM CATALOG_SKU_2017
-- WHERE CatalogPage is not NULL --
GROUP BY Department;