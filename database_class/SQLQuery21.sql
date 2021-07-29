-- using sql expression --

Select OrderNumber, sku
from ORDER_ITEM
where (Quantity * price) <> ExtendedPrice
ORDER BY OrderNumber, SKU