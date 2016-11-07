# price-analysis
Problem we're trying to solve:

    * As owners of a company, we want to find the best deals on parts among our suppliers 
    so that we can save money.
    * As owners of a company, we want to see how many units of a particular product we purchased over a period of time, 
    so that we can better anticipate future orders and calculate how to save.

Assumptions:

    Each invoice will have:
        * Unit ID
        * Supplier
        * Date
        * Unit Description
        * Unit Price
        * Quantity
        * Unit discount
    Unit ID's are not the same at each supplier
    Prices change frequently at suppliers
    
Needs

    Description needs to be consistent(the same) across all suppliers in order for comparison or searches to work

Processes/Work Flow

    Data Entry
      As invoices come in, the data entry specialist adds the following into the Raw Data sheet:
        * Date
        * Unit Description(Must be the same for all suppliers)
        * Unit ID
        * Supplier
        * Price per unit
        * Quantity
        * Discount
      Save changes
    Price Analysis/Find best prices for a specific part
      1. Open excel spreadsheet
      2. Navigate to Price Analysis sheet
      3. Enter in search term until matched shows desired product
      4. Note prices for Best, Better, Worse, Worst Suppliers
