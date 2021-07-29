select department, count(SKU) AS
NumberOfCatalogItems
from CATALOG_SKU_2017
WHERE CatalogPage is NOT NULL 
GROUP BY Department
HAVING count(SKU) > 2;

SELECT * FROM CATALOG_SKU_2017