-- using sql expressions with string fnction: concatenation --

select SKU, SKU_Description, (Buyer+' in ' +Department) AS 
Sponsor 
from SKU_DATA
ORDER BY SKU;

